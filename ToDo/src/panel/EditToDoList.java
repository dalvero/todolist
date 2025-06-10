package panel;

import com.mysql.jdbc.PreparedStatement;
import component.MyOptionPane;
import frame.ToDoFrame;
import java.awt.Component;
import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.SwingUtilities;
import koneksi.Koneksi;
import java.sql.ResultSet;
import objek.Task;
import repository.TaskRepository;

public class EditToDoList extends javax.swing.JPanel {

    private int idTugas;

    private void loadDataById(int id_tugas) {
        Connection conn = Koneksi.koneksiDatabase();
        String sql = "SELECT * FROM tugas WHERE id_tugas = ?";

        try (PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql); Statement stmtCount = conn.createStatement()) {

            pstmt.setInt(1, id_tugas);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                // Ambil data dari database
                String nama = rs.getString("nama_tugas");
                String statusDB = rs.getString("status");
                String tingkatanDB = rs.getString("tingkatan");
                String waktuDB = rs.getString("waktu");
                String tanggalDB = rs.getString("tanggal");
                
                String waktu = waktuDB.replace(".", ":");
                
                // Set nilai ke komponen
                current_namaTugas.setText(nama);
                current_status.setSelectedItem(statusDB);
                current_tingkatan.setSelectedItem(tingkatanDB);

                // Format tanggal & waktu
                SimpleDateFormat sdfWaktu = new SimpleDateFormat("HH:mm");
                SimpleDateFormat sdfTanggal = new SimpleDateFormat("yyyy-MM-dd");
                s_waktu.setValue(sdfWaktu.parse(waktu));
                s_tanggal.setValue(sdfTanggal.parse(tanggalDB));
            }

            rs.close();
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public EditToDoList(int id_tugas) {
        initComponents();
        this.idTugas = id_tugas;
        loadDataById(id_tugas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        footer1 = new component.MyPanelCustBorder();
        navbar = new component.MyPanelCustBorder();
        btn_navIcon = new component.MyLabel();
        btn_myTask = new component.MyLabel();
        btn_pomodoro = new component.MyLabel();
        btn_logout = new component.MyLabel();
        btn_profile = new javax.swing.JLabel();
        l_namaTugas = new component.MyLabel();
        current_namaTugas = new component.MyTextFieldCustBorder();
        l_status = new component.MyLabel();
        p_status = new component.MyPanel();
        current_status = new component.MyComboBox();
        l_tingkatan = new component.MyLabel();
        p_tingkatan = new component.MyPanel();
        current_tingkatan = new component.MyComboBox();
        l_waktu = new component.MyLabel();
        s_waktu = new component.MySpinnerTime();
        l_tanggal = new component.MyLabel();
        s_tanggal = new component.MySpinnerDate();
        btn_batal = new component.MyButton();
        btn_edit = new component.MyButton();

        setBackground(new java.awt.Color(245, 245, 245));
        setLayout(null);

        footer1.setBorderBottom(false);
        footer1.setBorderLeft(false);
        footer1.setBorderRight(false);
        footer1.setBorderTop(false);
        footer1.setPreferredSize(new java.awt.Dimension(100, 50));

        javax.swing.GroupLayout footer1Layout = new javax.swing.GroupLayout(footer1);
        footer1.setLayout(footer1Layout);
        footer1Layout.setHorizontalGroup(
            footer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        footer1Layout.setVerticalGroup(
            footer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        add(footer1);
        footer1.setBounds(0, 650, 1000, 50);

        navbar.setBorderBottom(false);
        navbar.setBorderColor(new java.awt.Color(102, 102, 102));
        navbar.setBorderLeft(false);
        navbar.setBorderRight(false);
        navbar.setBorderTop(false);
        navbar.setPreferredSize(new java.awt.Dimension(1050, 50));
        navbar.setLayout(null);

        btn_navIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/todoIcon24.png"))); // NOI18N
        btn_navIcon.setText("  To-Do List");
        btn_navIcon.setColorClick(new java.awt.Color(102, 102, 102));
        btn_navIcon.setColorOver(new java.awt.Color(153, 153, 153));
        btn_navIcon.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_navIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_navIconMouseClicked(evt);
            }
        });
        navbar.add(btn_navIcon);
        btn_navIcon.setBounds(36, 4, 130, 40);

        btn_myTask.setText("My Task");
        btn_myTask.setColorClick(new java.awt.Color(204, 204, 204));
        btn_myTask.setColorOver(new java.awt.Color(153, 153, 153));
        btn_myTask.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_myTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_myTaskMouseClicked(evt);
            }
        });
        navbar.add(btn_myTask);
        btn_myTask.setBounds(630, 20, 80, 24);

        btn_pomodoro.setText("Pomodoro");
        btn_pomodoro.setColorClick(new java.awt.Color(204, 204, 204));
        btn_pomodoro.setColorOver(new java.awt.Color(153, 153, 153));
        btn_pomodoro.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_pomodoro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pomodoroMouseClicked(evt);
            }
        });
        navbar.add(btn_pomodoro);
        btn_pomodoro.setBounds(730, 20, 100, 24);

        btn_logout.setText("Logout");
        btn_logout.setColorClick(new java.awt.Color(204, 204, 204));
        btn_logout.setColorOver(new java.awt.Color(153, 153, 153));
        btn_logout.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });
        navbar.add(btn_logout);
        btn_logout.setBounds(850, 20, 70, 24);

        btn_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ImageUser.png"))); // NOI18N
        navbar.add(btn_profile);
        btn_profile.setBounds(940, 10, 30, 30);

        add(navbar);
        navbar.setBounds(0, 0, 1000, 50);

        l_namaTugas.setText("Nama Tugas");
        l_namaTugas.setColorClick(new java.awt.Color(0, 0, 0));
        l_namaTugas.setColorOver(new java.awt.Color(0, 0, 0));
        l_namaTugas.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        add(l_namaTugas);
        l_namaTugas.setBounds(220, 150, 120, 24);

        current_namaTugas.setCornerRadius(10);
        current_namaTugas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(current_namaTugas);
        current_namaTugas.setBounds(220, 170, 570, 40);

        l_status.setText("Status");
        l_status.setColorClick(new java.awt.Color(0, 0, 0));
        l_status.setColorOver(new java.awt.Color(0, 0, 0));
        l_status.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        add(l_status);
        l_status.setBounds(220, 220, 51, 24);

        p_status.setBorderWidth(1);
        p_status.setCornerRadius(20);
        p_status.setLayout(null);

        current_status.setBackground(new java.awt.Color(255, 255, 255));
        current_status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Belum Selesai", "Selesai" }));
        current_status.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        p_status.add(current_status);
        current_status.setBounds(10, 10, 550, 30);

        add(p_status);
        p_status.setBounds(220, 240, 570, 50);

        l_tingkatan.setText("Tingkatan");
        l_tingkatan.setColorClick(new java.awt.Color(0, 0, 0));
        l_tingkatan.setColorOver(new java.awt.Color(0, 0, 0));
        l_tingkatan.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        add(l_tingkatan);
        l_tingkatan.setBounds(220, 300, 90, 24);

        p_tingkatan.setBorderWidth(1);
        p_tingkatan.setCornerRadius(20);
        p_tingkatan.setLayout(null);

        current_tingkatan.setBackground(new java.awt.Color(255, 255, 255));
        current_tingkatan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "High", "Medium", "Low" }));
        current_tingkatan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        p_tingkatan.add(current_tingkatan);
        current_tingkatan.setBounds(10, 10, 550, 40);

        add(p_tingkatan);
        p_tingkatan.setBounds(220, 320, 570, 60);

        l_waktu.setText("Waktu");
        l_waktu.setColorClick(new java.awt.Color(0, 0, 0));
        l_waktu.setColorOver(new java.awt.Color(0, 0, 0));
        l_waktu.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        add(l_waktu);
        l_waktu.setBounds(220, 390, 80, 24);
        add(s_waktu);
        s_waktu.setBounds(220, 410, 106, 36);

        l_tanggal.setText("Tanggal");
        l_tanggal.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        add(l_tanggal);
        l_tanggal.setBounds(220, 460, 90, 24);
        add(s_tanggal);
        s_tanggal.setBounds(220, 480, 141, 36);

        btn_batal.setForeground(new java.awt.Color(255, 255, 255));
        btn_batal.setText("Batal");
        btn_batal.setBorderColor(new java.awt.Color(153, 0, 0));
        btn_batal.setColor(java.awt.Color.black);
        btn_batal.setColorClick(new java.awt.Color(51, 51, 51));
        btn_batal.setColorOver(new java.awt.Color(51, 51, 51));
        btn_batal.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btn_batal.setRadius(5);
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });
        add(btn_batal);
        btn_batal.setBounds(510, 540, 137, 39);

        btn_edit.setBackground(new java.awt.Color(0, 0, 0));
        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setText("Edit");
        btn_edit.setBorderColor(new java.awt.Color(0, 0, 0));
        btn_edit.setColor(java.awt.Color.black);
        btn_edit.setColorClick(new java.awt.Color(51, 51, 51));
        btn_edit.setColorOver(new java.awt.Color(51, 51, 51));
        btn_edit.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btn_edit.setRadius(5);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        add(btn_edit);
        btn_edit.setBounds(660, 540, 137, 39);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_navIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_navIconMouseClicked
        ToDoFrame toDoFrame = (ToDoFrame) SwingUtilities.getWindowAncestor(this);
        if (toDoFrame != null) {
            toDoFrame.showTambahToDoList();
        }
    }//GEN-LAST:event_btn_navIconMouseClicked

    private void btn_myTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_myTaskMouseClicked
        ToDoFrame toDoFrame = (ToDoFrame) SwingUtilities.getWindowAncestor(this);
        if (toDoFrame != null) {
            toDoFrame.showMyTask();
        }
    }//GEN-LAST:event_btn_myTaskMouseClicked

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        MyOptionPane.showConfirm(this, "Yakin ingin logout dari akun anda?", "Konfirmasi", result -> {
            if (result) {
                ToDoFrame toDoFrame = (ToDoFrame) SwingUtilities.getWindowAncestor(this);
                if (toDoFrame != null) {
                    toDoFrame.showHomePage();
                }
            } else {
                System.out.println("Batal Logout.");
            }
        });
    }//GEN-LAST:event_btn_logoutMouseClicked

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        MyOptionPane.showConfirm(null, "Yakin ingin membatalkan edit ?", "Konfirmasi", result -> {
            if (result) {
                ToDoFrame toDoFrame = (ToDoFrame) SwingUtilities.getWindowAncestor(this);
                if (toDoFrame != null) {
                    toDoFrame.showMyTask(); // method untuk kembali ke daftar tugas
                }
            } else {
                System.out.println("Batal Keluar.");
            }
        });
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        if (current_namaTugas.getText().isEmpty()) {
            MyOptionPane.showWarning(this, "Nama Tugas harus diisi!", "Warning");
        } else {
            SimpleDateFormat sdfWaktu = new SimpleDateFormat("HH:mm");
            SimpleDateFormat sdfTanggal = new SimpleDateFormat("yyyy-MM-dd");

            String nama_tugas = current_namaTugas.getText();
            String status = current_status.getSelectedItem().toString();
            String tingkatan = current_tingkatan.getSelectedItem().toString();

            Date time = (Date) s_waktu.getValue();
            String waktu = sdfWaktu.format(time);

            Date date = (Date) s_tanggal.getValue();
            String tanggal = sdfTanggal.format(date);

            Task editedTask = new Task(Login.user.getId_user(), nama_tugas, status, tingkatan, waktu, tanggal);
            editedTask.setId_tugas(idTugas);  

            TaskRepository.editTask(editedTask);

            MyOptionPane.showInfo(this, "Tugas berhasil diperbarui!", "Sukses");

            ToDoFrame toDoFrame = (ToDoFrame) SwingUtilities.getWindowAncestor(this);
            if (toDoFrame != null) {
                toDoFrame.showMyTask();
            }
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_pomodoroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pomodoroMouseClicked
        ToDoFrame toDoFrame = (ToDoFrame) SwingUtilities.getWindowAncestor(this);
        if (toDoFrame != null) {
            toDoFrame.showPomodoro();
        }
    }//GEN-LAST:event_btn_pomodoroMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.MyButton btn_batal;
    private component.MyButton btn_edit;
    private component.MyLabel btn_logout;
    private component.MyLabel btn_myTask;
    private component.MyLabel btn_navIcon;
    private component.MyLabel btn_pomodoro;
    private javax.swing.JLabel btn_profile;
    private component.MyTextFieldCustBorder current_namaTugas;
    private component.MyComboBox current_status;
    private component.MyComboBox current_tingkatan;
    private component.MyPanelCustBorder footer1;
    private component.MyLabel l_namaTugas;
    private component.MyLabel l_status;
    private component.MyLabel l_tanggal;
    private component.MyLabel l_tingkatan;
    private component.MyLabel l_waktu;
    private component.MyPanelCustBorder navbar;
    private component.MyPanel p_status;
    private component.MyPanel p_tingkatan;
    private component.MySpinnerDate s_tanggal;
    private component.MySpinnerTime s_waktu;
    // End of variables declaration//GEN-END:variables
}
