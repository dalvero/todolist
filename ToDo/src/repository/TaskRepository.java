package repository;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import koneksi.Koneksi;
import objek.Task;
import panel.Login;

public class TaskRepository {

    private static ArrayList<Task> listAllTask = new ArrayList<>(); // ALL TASK
    private static ArrayList<Task> resultTask = new ArrayList<>(); // TASK BY SEARCH
    private static ArrayList<Task> todayTask = new ArrayList<>(); // TODAY TASK
    private static ArrayList<Task> completedTask = new ArrayList<>(); // COMPLETED TASK
    private static String query;
    private static ResultSet rs;
    private static Statement stmt;
    private static ResultSet rs_c;
    private static Statement stmt_c;
    private static int jumBaris;

    public static ArrayList<Task> getAllTask(int id_user) {
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
                    data[r][c] = rs.getString(c + 1);
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
            for (int i = 0; i < jmlBaris; i++) {
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

    public static ArrayList<Task> searchTask(String keyWord, int id_user, String date) {
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
                    data[r][c] = rs.getString(c + 1);
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
            for (int i = 0; i < jmlBaris; i++) {
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

    public static ArrayList<Task> getTodayTask(String date, int id_user) {
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
                    data[r][c] = rs.getString(c + 1);
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
            for (int i = 0; i < jmlBaris; i++) {
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

    public static void addCompletedTask(Task task) {
        // CHECK APAKAH TASK SUDAH ADA ATAU BELUM
        if (completedTask != null) {
            for (Task tsk : completedTask) {
                if (tsk.getId_tugas() == task.getId_tugas()) {
                    System.out.println("Task Sudah Di Check Sebelumnya");
                    return;
                }
            }
        }

        // PERBARUI KE DATABASE
        Connection connect = Koneksi.koneksiDatabase();
        try {
            stmt = connect.createStatement();
            query = "UPDATE tugas SET `status` = '" + task.getStatus() + "' WHERE `id_tugas` = '" + task.getId_tugas() + "'";
            stmt.executeUpdate(query);
            stmt.close();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public static void uncheckTask(int id_tugas) {
        // PERBARUI KE DATABASE
        Task task = new Task();
        for (Task tsk : completedTask) {
            if (tsk.getId_tugas() == id_tugas) {
                task = tsk;
            }
        }

        task.setStatus("Belum Selesai");

        Connection connect = Koneksi.koneksiDatabase();
        try {
            stmt = connect.createStatement();
            query = "UPDATE tugas SET `status` = '" + task.getStatus() + "' WHERE `id_tugas` = '" + task.getId_tugas() + "'";
            stmt.executeUpdate(query);
            stmt.close();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public static ArrayList<Task> getCompletedTask(int id_user) {
        completedTask.clear();
        System.out.println("AMBIL TASK YANG SELESAI DI DATABASE ");

        // MENGAMBIL TASK DI DATABASE
        Connection connect = Koneksi.koneksiDatabase();
        String data[][] = null;

        try {
            stmt = connect.createStatement();

            // AMBIL DATA
            query = "SELECT `id_tugas`, `id_user`, `nama_tugas`, `status`, `tingkatan`, "
                    + "`waktu`, `tanggal` FROM `tugas` WHERE `status` = 'Selesai' AND `id_user` = " + id_user;

            rs = stmt.executeQuery(query);

            ResultSetMetaData meta = rs.getMetaData();
            int jmlKolom = meta.getColumnCount();
            data = new String[1000][jmlKolom];
            int r = 0;

            while (rs.next()) {
                for (int c = 0; c < jmlKolom; c++) {
                    data[r][c] = rs.getString(c + 1);
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
            for (int i = 0; i < jmlBaris; i++) {
                idTugas = Integer.parseInt(data[i][0]);
                idUser = Integer.parseInt(data[i][1]);
                namaTugas = data[i][2];
                status = data[i][3];
                tingkatan = data[i][4];
                waktu = data[i][5];
                tanggal = data[i][6];

                completedTask.add(new Task(idTugas, idUser, namaTugas, status, tingkatan, waktu, tanggal));
            }

            stmt.close();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }

        return completedTask;
    }

    public static void addTask(Task task) {
        jumBaris = 0;
        Connection connect = Koneksi.koneksiDatabase();

        // QUERY DENGAN PLACE HOLDER AGAR LEBIH AMAN (MENGHINDARI SQL INJECTION)
        query = "INSERT INTO tugas (id_user, nama_tugas, status, tingkatan, waktu, tanggal) VALUES (?, ?, ?, ?, ?, ?)";
        try (
                // MEMBUAT PREPAREDSTATEMENT UNTUK QUERY
                PreparedStatement pstmt = (PreparedStatement) connect.prepareStatement(query); Statement stmtCount = connect.createStatement()) {

            // MENGISI PLACE HOLDER MENGGUNAKAN PREPARED STATEMENT
            pstmt.setInt(1, Login.user.getId_user());
            pstmt.setString(2, task.getNama_tugas());
            pstmt.setString(3, task.getStatus());
            pstmt.setString(4, task.getTingkatan());
            pstmt.setString(5, task.getWaktu());
            pstmt.setString(6, task.getTanggal());
            pstmt.executeUpdate();

            // UNTUK MENGETAHUI JUMLAH TERBARU DARI USER
            ResultSet rs = stmtCount.executeQuery("SELECT COUNT(*) FROM tugas");
            if (rs.next()) {
                jumBaris = rs.getInt(1);
            }
            rs.close();
            System.out.println("Total tugas: " + jumBaris);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void editTask(Task task) {
        Connection connect = Koneksi.koneksiDatabase();

        try {
            stmt = connect.createStatement();
            query = "UPDATE `tugas` SET "
                    + "`nama_tugas` = '" + task.getNama_tugas() + "', "
                    + "`status` = '" + task.getStatus() + "', "
                    + "`tingkatan` = '" + task.getTingkatan() + "', "
                    + "`waktu` = '" + task.getWaktu() + "', "
                    + "`tanggal` = '" + task.getTanggal() + "' "
                    + "WHERE `id_tugas` = '" + task.getId_tugas() + "'";
            stmt.executeUpdate(query);
            stmt.close();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public static Task getTaskById(int id_tugas_param) {
        Connection connect = Koneksi.koneksiDatabase();
        Task task = null;
        String query = "SELECT id_tugas, id_user, nama_tugas, status, tingkatan, waktu, tanggal "
                + "FROM tugas WHERE id_tugas = ?";

        try (
                PreparedStatement pstmt = (PreparedStatement) connect.prepareStatement(query);) {

            pstmt.setInt(1, id_tugas_param);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int idTugas = rs.getInt("id_tugas");
                    int idUser = rs.getInt("id_user");
                    String namaTugas = rs.getString("nama_tugas");
                    String status = rs.getString("status");
                    String tingkatan = rs.getString("tingkatan");
                    String waktu = rs.getString("waktu");
                    String tanggal = rs.getString("tanggal");

                    task = new Task(idTugas, idUser, namaTugas, status, tingkatan, waktu, tanggal);
                } else {
                    System.out.println("Task dengan ID: " + id_tugas_param + " tidak ditemukan.");
                }
            }
        } catch (SQLException e) {
            System.err.println("Error saat mengambil task by ID: " + e.getMessage());
        }
        return task;
    }

    public static void deleteTask(int id_task) {
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

    public static Task getTaskByName(String nama_tugas) {
        for (Task task : listAllTask) {
            if (task.getNama_tugas().equals(nama_tugas)) {
                return task;
            }
        }
        return null;
    }
}
