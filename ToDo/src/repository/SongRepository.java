package repository;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import koneksi.Koneksi;
import objek.Song;
import panel.Login;

public class SongRepository {
    private static String query;
    private static ResultSet rs;
    private static Statement stmt;
    private static ResultSet rs_c;
    private static Statement stmt_c;
    private static int jumBaris;  
    public static ArrayList<Song> listSong = new ArrayList<>();
    
    public static ArrayList<Song> getListSong(int id_user){
        listSong.clear();
        Connection connect = Koneksi.koneksiDatabase();
        String data[][] = null;
        
        try {
            stmt = connect.createStatement();

            // AMBIL DATA
            query = "SELECT `id_musik`, `id_user`, `judul`, `penyanyi`, `nama_file` FROM `musik`"
                    + " WHERE `id_user` = " + id_user;

            rs = stmt.executeQuery(query);

            ResultSetMetaData meta = rs.getMetaData();            
            int jmlKolom = meta.getColumnCount();            
            data = new String[1000][jmlKolom];
            int r = 0;                                                     
            
            while (rs.next()) {
                for (int c = 0; c < jmlKolom; c++) {
                    data[r][c] = rs.getString(c+1);                    
                }
                r++;
            }          
            
            int jmlBaris = r;
            String tmparray[][] = data;
            data = new String[jmlBaris][jmlKolom];
            
            for (r = 0; r < jmlBaris; r++) {
                for (int c = 0; c < jmlKolom; c++) {
                    data[r][c] = tmparray[r][c];                     
                }                
            }
                
            // TASK ATRIBUT
            int idMusik = 0;
            int idUser = 0;
            String penyanyi = "";
            String judul = "";
            String nama_file = "";            
            for (int i = 0; i < jmlBaris ; i++) {
                idMusik = Integer.parseInt(data[i][0]);
                idUser = Integer.parseInt(data[i][1]);
                judul = data[i][2];
                penyanyi = data[i][3];
                nama_file = data[i][4];                
                                
                listSong.add(new Song(idMusik, idUser, penyanyi, judul, nama_file));                
            }
                                    
            stmt.close();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }                        
        return listSong;
    }
    
    public static void addSong(Song song, int id_user){
        System.out.println(song.getFilePath());
        jumBaris = 0;
        Connection connect = Koneksi.koneksiDatabase();        
        
        // QUERY DENGAN PLACE HOLDER AGAR LEBIH AMAN (MENGHINDARI SQL INJECTION)
        query = "INSERT INTO musik (id_user, judul, penyanyi, nama_file) VALUES (?, ?, ?, ?)";
        try (
            // MEMBUAT PREPAREDSTATEMENT UNTUK QUERY
            PreparedStatement pstmt = (PreparedStatement) connect.prepareStatement(query);
            Statement stmtCount = connect.createStatement()
        ) {
            
            // MENGISI PLACE HOLDER MENGGUNAKAN PREPARED STATEMENT
            pstmt.setInt(1, id_user);
            pstmt.setString(2, song.getSongTitle());
            pstmt.setString(3, song.getSongArtist());
            pstmt.setString(4, song.getFilePath());
            pstmt.executeUpdate();

            // UNTUK MENGETAHUI JUMLAH TERBARU DARI USER
            ResultSet rs = stmtCount.executeQuery("SELECT COUNT(*) FROM musik");
            if (rs.next()) {
                jumBaris = rs.getInt(1);
            }
            rs.close();
            System.out.println("Total musik: " + jumBaris);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void deleteSong(int id_musik){
        Connection connect = Koneksi.koneksiDatabase();
        try {
            stmt = connect.createStatement();
            query = "DELETE FROM musik WHERE `id_musik` = '" + id_musik + "'";
            stmt.executeUpdate(query);
            stmt.close();
            connect.close();            
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    
    public static Song getSongByTitle(String judul){        
        for (Song song : listSong) {
            if (song.getSongTitle().equals(judul)) {                
                return song;
            }            
        }
        return null;
    }
    
    public static int getSongIndexPosition(Song song){
        int i = 0;
        for (Song sng : listSong) {
            if (sng.getSongTitle().equals(song.getSongTitle())) {                
                return i;
            }   
            i++;
        }
        return 0;
    }
}
