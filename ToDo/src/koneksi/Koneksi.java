package koneksi;

import java.sql.*;

public class Koneksi {
    public static Connection koneksi = null;
    public static Connection koneksiDatabase(){
        try {
            //SETTING DRIVER MYSQL
            Class.forName("com.mysql.jdbc.Driver");
            
            //BUAT KONEKSI
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3307/todo?characterEncoding=utf8", "root", "");            
//            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/todo?characterEncoding=utf8", "root", "");            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection Error : " + e.getMessage());
        }
        return koneksi;
    }
}
