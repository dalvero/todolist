package objek;

public class Task {
    private int id_tugas;
    private int id_user;
    private String nama_tugas;
    private String status;
    private String tingkatan;
    private String waktu;
    private String tanggal;

    public Task(int id_tugas, int id_user, String nama_tugas, String status, String tingkatan, String waktu, String tanggal) {
        this.id_tugas = id_tugas;
        this.id_user = id_user;
        this.nama_tugas = nama_tugas;
        this.status = status;
        this.tingkatan = tingkatan;
        this.waktu = waktu;
        this.tanggal = tanggal;
    }
    
    public Task(int id_user, String nama_tugas, String status, String tingkatan, String waktu, String tanggal) {        
        this.id_user = id_user;
        this.nama_tugas = nama_tugas;
        this.status = status;
        this.tingkatan = tingkatan;
        this.waktu = waktu;
        this.tanggal = tanggal;
    }

    public Task(){
        
    }
    
    public int getId_tugas() {
        return id_tugas;
    }

    public void setId_tugas(int id_tugas) {
        this.id_tugas = id_tugas;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNama_tugas() {
        return nama_tugas;
    }

    public void setNama_tugas(String nama_tugas) {
        this.nama_tugas = nama_tugas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTingkatan() {
        return tingkatan;
    }

    public void setTingkatan(String tingkatan) {
        this.tingkatan = tingkatan;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
    
}
