package objek;

public class User {
    private int id_user;
    private String nama_lengkap;
    private String username;
    private String password;

    public User(int id_user, String nama_lengkap, String username, String password) {
        this.id_user = id_user;
        this.nama_lengkap = nama_lengkap;
        this.username = username;
        this.password = password;
    }

    public User(){
        
    }
    
    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
