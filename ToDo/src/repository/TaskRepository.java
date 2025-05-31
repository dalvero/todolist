package repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import koneksi.Koneksi;
import objek.Task;

public class TaskRepository {
    private static ArrayList<Task> listAllTask = new ArrayList<>();
    private static String query;
    private static ResultSet rs;
    private static Statement stmt;
    private static ResultSet rs_c;
    private static Statement stmt_c;
    private static int jumBaris;    
    
    public static ArrayList<Task> getAllTask(int id_user){
        listAllTask.clear();
        Connection connect = Koneksi.koneksiDatabase();
        String data[][] = null;
        
        try {
            stmt = connect.createStatement();

            // AMBIL DATA
            query = "SELECT `id_tugas`, `id_user`, `nama_tugas`, `status`, `tingkatan`, "
                    + "`waktu`, `tanggal` FROM `tugas` WHERE `id_user` = " + id_user;

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
            int idTugas = 0;
            int idUser = 0;
            String namaTugas = "";
            String status = "";
            String tingkatan = "";
            String waktu = "";
            String tanggal = "";
            for (int i = 0; i < jmlBaris ; i++) {
                idTugas = Integer.parseInt(data[i][0]);
                idUser = Integer.parseInt(data[i][1]);
                namaTugas = data[i][2];
                status = data[i][3];
                tingkatan = data[i][4];
                waktu = data[i][5];
                tanggal = data[i][6];
                                
                listAllTask.add(new Task(idTugas, id_user, namaTugas, status, tingkatan, waktu, tanggal));
            }
                                    
            stmt.close();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }        
        return listAllTask;
    }
}
