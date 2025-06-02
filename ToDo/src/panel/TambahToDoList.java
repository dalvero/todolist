package panel;

import component.MyOptionPane;
import frame.ToDoFrame;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.SwingUtilities;
import objek.Task;
import repository.TaskRepository;

public class TambahToDoList extends javax.swing.JPanel {

    public TambahToDoList() {
        initComponents();
        
        // SET BUTTON NAV TEXT
        btn_navIcon.setText("  Add Task");
        
        l_userName.setText("Hallo, " + Login.user.getNama_lengkap() + " tambah tugas yuk.." );
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        footer = new component.MyPanelCustBorder();
        t_namaTugas = new component.MyTextFieldCustBorder();
        l_namaTugas = new component.MyLabel();
        l_status = new component.MyLabel();
        l_tingkatan = new component.MyLabel();
        l_waktu = new component.MyLabel();
        btn_simpan = new component.MyButton();
        l_tanggal = new component.MyLabel();
        navbar = new component.MyPanelCustBorder();
        btn_navIcon = new component.MyLabel();
        btn_myTask = new component.MyLabel();
        btn_pomodoro = new component.MyLabel();
        btn_logout = new component.MyLabel();
        btn_profile = new javax.swing.JLabel();
        s_waktu = new component.MySpinnerTime();
        s_tanggal = new component.MySpinnerDate();
        l_userName = new component.MyLabel();
        l_greet = new component.MyLabel();
        p_status = new component.MyPanel();
        cb_status = new component.MyComboBox();
        p_tingkatan = new component.MyPanel();
        cb_tingkatan = new component.MyComboBox();

        setBackground(new java.awt.Color(245, 245, 245));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(null);

        footer.setBorderBottom(false);
        footer.setBorderLeft(false);
        footer.setBorderRight(false);
        footer.setBorderTop(false);
        footer.setPreferredSize(new java.awt.Dimension(100, 50));

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        add(footer);
        footer.setBounds(0, 650, 1000, 50);

        t_namaTugas.setCornerRadius(10);
        t_namaTugas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(t_namaTugas);
        t_namaTugas.setBounds(230, 230, 570, 40);

        l_namaTugas.setText("Nama Tugas");
        l_namaTugas.setColorClick(new java.awt.Color(0, 0, 0));
        l_namaTugas.setColorOver(new java.awt.Color(0, 0, 0));
        l_namaTugas.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N
        add(l_namaTugas);
        l_namaTugas.setBounds(230, 210, 102, 18);

        l_status.setText("Status");
        l_status.setColorClick(new java.awt.Color(0, 0, 0));
        l_status.setColorOver(new java.awt.Color(0, 0, 0));
        l_status.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N
        add(l_status);
        l_status.setBounds(230, 280, 52, 18);

        l_tingkatan.setText("Tingkatan");
        l_tingkatan.setColorClick(new java.awt.Color(0, 0, 0));
        l_tingkatan.setColorOver(new java.awt.Color(0, 0, 0));
        l_tingkatan.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N
        add(l_tingkatan);
        l_tingkatan.setBounds(230, 360, 81, 18);

        l_waktu.setText("Waktu");
        l_waktu.setColorClick(new java.awt.Color(0, 0, 0));
        l_waktu.setColorOver(new java.awt.Color(0, 0, 0));
        l_waktu.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N
        add(l_waktu);
        l_waktu.setBounds(230, 450, 52, 18);

        btn_simpan.setBackground(new java.awt.Color(0, 0, 0));
        btn_simpan.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan.setText("Simpan");
        btn_simpan.setBorderColor(new java.awt.Color(0, 0, 0));
        btn_simpan.setColor(java.awt.Color.black);
        btn_simpan.setColorClick(new java.awt.Color(51, 51, 51));
        btn_simpan.setColorOver(new java.awt.Color(51, 51, 51));
        btn_simpan.setFont(new java.awt.Font("Gavoline", 1, 18)); // NOI18N
        btn_simpan.setRadius(5);
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        add(btn_simpan);
        btn_simpan.setBounds(670, 580, 137, 39);

        l_tanggal.setText("Tanggal");
        l_tanggal.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N
        add(l_tanggal);
        l_tanggal.setBounds(230, 520, 90, 18);

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
        btn_navIcon.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N
        btn_navIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_navIconMouseClicked(evt);
            }
        });
        navbar.add(btn_navIcon);
        btn_navIcon.setBounds(36, 4, 130, 40);

        btn_myTask.setText("My Task");
        btn_myTask.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N
        btn_myTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_myTaskMouseClicked(evt);
            }
        });
        navbar.add(btn_myTask);
        btn_myTask.setBounds(630, 20, 80, 18);

        btn_pomodoro.setText("Pomodoro");
        btn_pomodoro.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N
        navbar.add(btn_pomodoro);
        btn_pomodoro.setBounds(730, 20, 100, 18);

        btn_logout.setText("Logout");
        btn_logout.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });
        navbar.add(btn_logout);
        btn_logout.setBounds(850, 20, 70, 18);

        btn_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ImageUser.png"))); // NOI18N
        navbar.add(btn_profile);
        btn_profile.setBounds(940, 10, 30, 30);

        add(navbar);
        navbar.setBounds(0, 0, 1000, 50);
        add(s_waktu);
        s_waktu.setBounds(230, 470, 106, 36);
        add(s_tanggal);
        s_tanggal.setBounds(230, 540, 141, 36);

        l_userName.setText("Halo,");
        l_userName.setColorClick(new java.awt.Color(0, 0, 0));
        l_userName.setColorOver(new java.awt.Color(0, 0, 0));
        l_userName.setFont(new java.awt.Font("Gavoline", 1, 24)); // NOI18N
        add(l_userName);
        l_userName.setBounds(230, 140, 550, 30);

        l_greet.setText("Silahkan isi data berikut untuk menambahkan tugas ke list kamu");
        l_greet.setColorClick(new java.awt.Color(0, 0, 0));
        l_greet.setColorOver(new java.awt.Color(0, 0, 0));
        l_greet.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N
        add(l_greet);
        l_greet.setBounds(230, 170, 560, 18);

        p_status.setBorderWidth(1);
        p_status.setCornerRadius(20);
        p_status.setLayout(null);

        cb_status.setBackground(new java.awt.Color(255, 255, 255));
        cb_status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Belum Selesai", "Selesai" }));
        cb_status.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        p_status.add(cb_status);
        cb_status.setBounds(10, 10, 550, 30);

        add(p_status);
        p_status.setBounds(230, 300, 570, 50);

        p_tingkatan.setBorderWidth(1);
        p_tingkatan.setCornerRadius(20);
        p_tingkatan.setLayout(null);

        cb_tingkatan.setBackground(new java.awt.Color(255, 255, 255));
        cb_tingkatan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "High", "Medium", "Low" }));
        cb_tingkatan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        p_tingkatan.add(cb_tingkatan);
        cb_tingkatan.setBounds(10, 10, 550, 40);

        add(p_tingkatan);
        p_tingkatan.setBounds(230, 380, 570, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_navIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_navIconMouseClicked
        ToDoFrame toDoFrame = (ToDoFrame) SwingUtilities.getWindowAncestor(this);
        if (toDoFrame != null) {
            toDoFrame.showTambahToDoList();
        }
    }//GEN-LAST:event_btn_navIconMouseClicked

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

    private void btn_myTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_myTaskMouseClicked
        ToDoFrame toDoFrame = (ToDoFrame) SwingUtilities.getWindowAncestor(this);
        if (toDoFrame != null) {
            toDoFrame.showMyTask();
        }
    }//GEN-LAST:event_btn_myTaskMouseClicked

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        if (t_namaTugas.getText().isEmpty()) {
            MyOptionPane.showWarning(this, "Nama Tugas harus diisi!", "Warning");
        } else {
            // WAKTU DAN TANGGAL FORMAT
            Date time, date;        
            SimpleDateFormat sdfWaktu = new SimpleDateFormat("HH:mm");
            SimpleDateFormat sdfTanggal = new SimpleDateFormat("yyyy-MM-dd");
            
            String nama_tugas, status, tingkatan, waktu, tanggal;
            nama_tugas = t_namaTugas.getText();
            status = cb_status.getSelectedItem().toString();
            tingkatan = cb_tingkatan.getSelectedItem().toString();
            
            // MENGAMBIL WAKTU DAN TANGGAL
            time = (Date) s_waktu.getValue();           
            waktu = sdfWaktu.format(time);
            
            date = (Date) s_tanggal.getValue();
            tanggal = sdfTanggal.format(date);
            
            System.out.println(nama_tugas);
            System.out.println(status);
            System.out.println(tingkatan);
            System.out.println(waktu);
            System.out.println(tanggal);
            
            // BUAT OBJEK TASK
            Task task = new Task(Login.user.getId_user(), nama_tugas, status, tingkatan, waktu, tanggal);
            
            // INSERT KE DATABASE
            TaskRepository.addTask(task);
            ToDoFrame toDoFrame = (ToDoFrame) SwingUtilities.getWindowAncestor(this);
            if (toDoFrame != null) {
                toDoFrame.showMyTask();
            }
        }
    }//GEN-LAST:event_btn_simpanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.MyLabel btn_logout;
    private component.MyLabel btn_myTask;
    private component.MyLabel btn_navIcon;
    private component.MyLabel btn_pomodoro;
    private javax.swing.JLabel btn_profile;
    private component.MyButton btn_simpan;
    private component.MyComboBox cb_status;
    private component.MyComboBox cb_tingkatan;
    private component.MyPanelCustBorder footer;
    private component.MyLabel l_greet;
    private component.MyLabel l_namaTugas;
    private component.MyLabel l_status;
    private component.MyLabel l_tanggal;
    private component.MyLabel l_tingkatan;
    private component.MyLabel l_userName;
    private component.MyLabel l_waktu;
    private component.MyPanelCustBorder navbar;
    private component.MyPanel p_status;
    private component.MyPanel p_tingkatan;
    private component.MySpinnerDate s_tanggal;
    private component.MySpinnerTime s_waktu;
    private component.MyTextFieldCustBorder t_namaTugas;
    // End of variables declaration//GEN-END:variables
}
