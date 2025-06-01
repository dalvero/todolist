package repository;

import com.mysql.jdbc.PreparedStatement;
import component.MyOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import objek.User;
import koneksi.Koneksi;

public class UserRepository {
    private static ArrayList<User> listAllUser = new ArrayList<>();
    private static String query;
    private static ResultSet rs;
    private static Statement stmt;
    private static ResultSet rs_c;
    private static Statement stmt_c;
    private static int jumBaris;    
    
    public static ArrayList<User> getAllUser(){
        Connection connect = Koneksi.koneksiDatabase();
        String data[][] = null;
        
        try {
            stmt = connect.createStatement();

            // AMBIL DATA
            query = "SELECT `id_user`, `nama_lengkap`, `username`, `password` FROM `user`";

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
                
            // USER ATRIBUT
            int id = 0;
            String nama = "";
            String username = "";
            String password = "";
            for (int i = 0; i < jmlBaris ; i++) {
                id = Integer.parseInt(data[i][0]);
                nama = data[i][1];
                username = data[i][2];
                password = data[i][3];
                                
                listAllUser.add(new User(id, nama, username, password));
            }
                                    
            stmt.close();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }        
        return listAllUser;
    }
            
    public static void registerUser(String namaLengkap, String username, String password) {
        jumBaris = 0;
        Connection connect = Koneksi.koneksiDatabase();        
        
        // QUERY DENGAN PLACE HOLDER AGAR LEBIH AMAN (MENGHINDARI SQL INJECTION)
        query = "INSERT INTO user (nama_lengkap, username, password) VALUES (?, ?, ?)";
        try (
            // MEMBUAT PREPAREDSTATEMENT UNTUK QUERY
            PreparedStatement pstmt = (PreparedStatement) connect.prepareStatement(query);
            Statement stmtCount = connect.createStatement()
        ) {
            
            // MENGISI PLACE HOLDER MENGGUNAKAN PREPARED STATEMENT
            pstmt.setString(1, namaLengkap);
            pstmt.setString(2, username);
            pstmt.setString(3, password);
            pstmt.executeUpdate();

            // UNTUK MENGETAHUI JUMLAH TERBARU DARI USER
            ResultSet rs = stmtCount.executeQuery("SELECT COUNT(*) FROM user");
            if (rs.next()) {
                jumBaris = rs.getInt(1);
            }
            rs.close();
            System.out.println("Total user: " + jumBaris);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    
    public static User loginUser(String username, String password){        
        boolean isValid = false;
        User userValid = null;
        for (User user : UserRepository.getAllUser()) {            
            if (username.equals(user.getUsername())) {
                if (password.equals(user.getPassword())) {                    
                    userValid = user;
                    isValid = true;
                    break;
                } else {                    
                    isValid = false;
                }
            } else {                
                isValid = false;
            }
        }
        
        if (isValid) {
            return userValid;
        } else {
            System.out.println("Username Salah");
            MyOptionPane.showWarning(null, "Username atau Password Anda mungkin salah, silahkan ulangi!", "Warning");                
            return null;
        }
        
    }
}

