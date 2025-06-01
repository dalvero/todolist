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
    private static ArrayList<Task> listAllTask = new ArrayList<>(); // ALL TASK
    private static ArrayList<Task> resultTask = new ArrayList<>(); // TASK BY SEARCH
    private static ArrayList<Task> todayTask = new ArrayList<>(); // TODAY TASK
    
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
    
    public static ArrayList<Task> searchTask(String keyWord, int id_user, String date){                
        resultTask.clear();
        Connection connect = Koneksi.koneksiDatabase();
        String data[][] = null;
        
        try {
            stmt = connect.createStatement();

            if (date != null) {
                query = "SELECT `id_tugas`, `id_user`, `nama_tugas`, `status`, `tingkatan`, "
                        + "`waktu`, `tanggal` FROM `tugas` WHERE `id_user` = " + id_user
                        + " AND `nama_tugas` LIKE '%" + keyWord + "%' AND `tanggal` = "
                        + "'" + date + "'";
            } else {
                // AMBIL DATA
                query = "SELECT `id_tugas`, `id_user`, `nama_tugas`, `status`, `tingkatan`, "
                        + "`waktu`, `tanggal` FROM `tugas` WHERE `id_user` = " + id_user
                        + " AND `nama_tugas` LIKE '%" + keyWord + "%'";
            }

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
                                
                resultTask.add(new Task(idTugas, idUser, namaTugas, status, tingkatan, waktu, tanggal));
            }
                                    
            stmt.close();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }        
        return resultTask;
    }        
    
    public static ArrayList<Task> getTodayTask(String date, int id_user){
        todayTask.clear();
        Connection connect = Koneksi.koneksiDatabase();
        String data[][] = null;
        
        try {
            stmt = connect.createStatement();

            // AMBIL DATA
            query = "SELECT `id_tugas`, `id_user`, `nama_tugas`, `status`, `tingkatan`, "
                    + "`waktu`, `tanggal` FROM `tugas` WHERE `id_user` = " + id_user
                    + " AND `tanggal` = '" + date + "'";

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
                                
                todayTask.add(new Task(idTugas, idUser, namaTugas, status, tingkatan, waktu, tanggal));
            }
                                    
            stmt.close();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }          
        return todayTask;
    }
    
    public static void deleteTask(int id_task){
        Connection connect = Koneksi.koneksiDatabase();
        try {
            stmt = connect.createStatement();
            query = "DELETE FROM tugas WHERE `id_tugas` = '" + id_task + "'";
            stmt.executeUpdate(query);
            stmt.close();
            connect.close();            
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    
    public static Task getTaskByName(String nama_tugas){
        for (Task task : listAllTask) {
            if (task.getNama_tugas().equals(nama_tugas)) {
                return task;
            }
        }
        return null;
    }
}
