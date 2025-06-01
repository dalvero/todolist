package panel;

import component.MyOptionPane;
import frame.ToDoFrame;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import repository.TaskRepository;
import objek.Task;

public class MyTask extends javax.swing.JPanel {
    private CardLayout cardLayout;    
    private String currentSection;
    
    private static LocalDate date; // MENGAMBIL TANGGAL HARI INI    
    private static LocalTime now; // MENGAMBIL WAKTU SEKARANG SECARA REAL TIME
    private static DateTimeFormatter format; // FORMAT PENULISAN TANGGAL DAN WAKTU    
    
    private static String todayDate;
    
    private AllTask allTask;
    private TodayTask todayTask;
    
    public MyTask() {
        initComponents();        
        // MEMBUAT PANEL UTAMA UNTUK CARD LAYOUT
        cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout);

        allTask = new AllTask();
        todayTask = new TodayTask();
        
        // MENAMBAHKAN PANEL-PANEL KE DALAM CARD LAYOUT
        mainPanel.add(allTask, "AllTask");
        mainPanel.add(todayTask, "TodayTask");
        mainPanel.add(new CompletedTask(), "CompletedTask");

        // MENAMBAHKAN mainPanel KE LAYOUT UTAMA (DI BAGIAN TENGAH)
        this.add(mainPanel, BorderLayout.CENTER);  
        userGreeting();
        
        // SET DEFAULT CURRENT SECTION = ALL TASK
        currentSection = "All Task";
        
    }

    // FUNCTION UNTUK MENGATUR TANGGAL DAN WAKTU AGAR SESUAI DENGAN HARI INI
    public void userGreeting(){      
        // MENGAMBIL TANGGAL HARI INI        
        date = LocalDate.now();
        format = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        
        // SET TO LABEL
        l_date.setText("Today, " + date.format(format));                
        
        // MENGAMBIL PAGI/SIIANG/MALAM
        now = LocalTime.now();
        String timeOfDay = "";
        
        // KONDISI UNTUK MEMBAGI WAKTU
        if (now.isBefore(LocalTime.NOON)) {
            timeOfDay = "Pagi";
        } else if (now.isBefore(LocalTime.of(18, 0))) {
            timeOfDay = "Siang";
        } else {
            timeOfDay = "Malam";
        }
        
        // SET TO GREETING USER
        l_userGreet.setText("Selamat " + timeOfDay + ",");       
        l_userName.setText(Login.user.getNama_lengkap());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navbar = new component.MyPanelCustBorder();
        btn_navIcon = new component.MyLabel();
        btn_myTask = new component.MyLabel();
        btn_pomodoro = new component.MyLabel();
        btn_logout = new component.MyLabel();
        btn_profile = new javax.swing.JLabel();
        p_sideBar = new component.MyPanel();
        l_myList = new component.MyLabel();
        btn_allTask = new component.MyLabel();
        btn_todayTask = new component.MyLabel();
        btn_completedTask = new component.MyLabel();
        btn_addTask = new component.MyButton();
        l_titleTask = new component.MyLabel();
        t_search = new component.MyTextFieldCustBorder();
        footer1 = new component.MyPanelCustBorder();
        mainPanel = new component.MyPanelCustBorder();
        l_userGreet = new component.MyLabel();
        l_userName = new component.MyLabel();
        l_date = new component.MyLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(null);

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

        p_sideBar.setBorderColor(new java.awt.Color(255, 255, 255));
        p_sideBar.setCornerRadius(13);

        l_myList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/MyList.png"))); // NOI18N
        l_myList.setText("  My List");

        btn_allTask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/AllTasks.png"))); // NOI18N
        btn_allTask.setText(" All Tasks");
        btn_allTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_allTaskMouseClicked(evt);
            }
        });

        btn_todayTask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Today.png"))); // NOI18N
        btn_todayTask.setText(" Today");
        btn_todayTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_todayTaskMouseClicked(evt);
            }
        });

        btn_completedTask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Completed.png"))); // NOI18N
        btn_completedTask.setText(" Completed");

        javax.swing.GroupLayout p_sideBarLayout = new javax.swing.GroupLayout(p_sideBar);
        p_sideBar.setLayout(p_sideBarLayout);
        p_sideBarLayout.setHorizontalGroup(
            p_sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_sideBarLayout.createSequentialGroup()
                .addGroup(p_sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_sideBarLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(p_sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_todayTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_allTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_completedTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(p_sideBarLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(l_myList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        p_sideBarLayout.setVerticalGroup(
            p_sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_sideBarLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(l_myList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btn_allTask, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_todayTask, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_completedTask, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        add(p_sideBar);
        p_sideBar.setBounds(40, 190, 217, 211);

        btn_addTask.setBackground(new java.awt.Color(0, 0, 0));
        btn_addTask.setForeground(new java.awt.Color(255, 255, 255));
        btn_addTask.setText("Add Task");
        btn_addTask.setBorderColor(new java.awt.Color(0, 0, 0));
        btn_addTask.setColor(java.awt.Color.black);
        btn_addTask.setColorClick(new java.awt.Color(51, 51, 51));
        btn_addTask.setColorOver(new java.awt.Color(51, 51, 51));
        btn_addTask.setFont(new java.awt.Font("Gavoline", 1, 14)); // NOI18N
        btn_addTask.setRadius(5);
        btn_addTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addTaskActionPerformed(evt);
            }
        });
        add(btn_addTask);
        btn_addTask.setBounds(873, 88, 100, 34);

        l_titleTask.setText("All Task");
        l_titleTask.setColorClick(new java.awt.Color(0, 0, 0));
        l_titleTask.setColorOver(new java.awt.Color(0, 0, 0));
        l_titleTask.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N
        add(l_titleTask);
        l_titleTask.setBounds(280, 110, 110, 18);

        t_search.setCornerRadius(15);
        t_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_searchActionPerformed(evt);
            }
        });
        add(t_search);
        t_search.setBounds(280, 140, 291, 37);

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

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorderBottom(false);
        mainPanel.setBorderLeft(false);
        mainPanel.setBorderRight(false);
        mainPanel.setBorderTop(false);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        add(mainPanel);
        mainPanel.setBounds(283, 189, 690, 440);

        l_userGreet.setText("Selamat Datang");
        l_userGreet.setColorClick(new java.awt.Color(0, 0, 0));
        l_userGreet.setColorOver(new java.awt.Color(0, 0, 0));
        l_userGreet.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N
        add(l_userGreet);
        l_userGreet.setBounds(50, 100, 150, 18);

        l_userName.setText("All Task");
        l_userName.setColorClick(new java.awt.Color(0, 0, 0));
        l_userName.setColorOver(new java.awt.Color(0, 0, 0));
        l_userName.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N
        add(l_userName);
        l_userName.setBounds(50, 120, 110, 18);

        l_date.setText("DD/MM/YYYY");
        l_date.setColorClick(new java.awt.Color(0, 0, 0));
        l_date.setColorOver(new java.awt.Color(0, 0, 0));
        l_date.setFont(new java.awt.Font("Gavoline", 0, 18)); // NOI18N
        add(l_date);
        l_date.setBounds(50, 160, 210, 18);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btn_navIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_navIconMouseClicked
        ToDoFrame toDoFrame = (ToDoFrame) SwingUtilities.getWindowAncestor(this);
        if (toDoFrame != null) {
            toDoFrame.showHomePage();
        }
    }//GEN-LAST:event_btn_navIconMouseClicked

    private void btn_addTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addTaskActionPerformed
        ToDoFrame toDoFrame = (ToDoFrame) SwingUtilities.getWindowAncestor(this);
        if (toDoFrame != null) {
            toDoFrame.showTambahToDoList();
        }
    }//GEN-LAST:event_btn_addTaskActionPerformed

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

    private void btn_allTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_allTaskMouseClicked
        l_titleTask.setText("All Task");
        currentSection = "All Task";
        System.out.println("SHOWING ALL TASK PANEL");   
        allTask.showTask(null);
        cardLayout.show(mainPanel, "AllTask");        
    }//GEN-LAST:event_btn_allTaskMouseClicked

    private void btn_todayTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_todayTaskMouseClicked
        l_titleTask.setText("Today Task");
        currentSection = "Today Task";
        System.out.println("SHOWING TODAY TASK PANEL");        
        date = LocalDate.now();
        todayDate =  date.getYear() + "-" + String.format("%02d", date.getMonthValue()) + "-" 
                + date.getDayOfMonth();         
        
        todayTask.showTask(TaskRepository.getTodayTask(todayDate, Login.user.getId_user()));
        
        cardLayout.show(mainPanel, "TodayTask");        
    }//GEN-LAST:event_btn_todayTaskMouseClicked

    private void t_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_searchActionPerformed
        if (currentSection.equals("All Task")) {
            System.out.println("SHOWING RESULT SEARCH ALL TASK PANEL");               
            allTask.showTask(TaskRepository.searchTask(t_search.getText(), Login.user.getId_user(), null));            
            cardLayout.show(mainPanel, "AllTask");   
            mainPanel.revalidate();
            mainPanel.repaint();
            t_search.setText("");
        } else if (currentSection.equals("Today Task")) {
            System.out.println("SHOWING RESULT SEARCH TODAY TASK PANEL");               
            todayTask.showTask(TaskRepository.searchTask(t_search.getText(), Login.user.getId_user(), todayDate));            
            cardLayout.show(mainPanel, "TodayTask");   
            mainPanel.revalidate();
            mainPanel.repaint();
            t_search.setText("");
        }
    }//GEN-LAST:event_t_searchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.MyButton btn_addTask;
    private component.MyLabel btn_allTask;
    private component.MyLabel btn_completedTask;
    private component.MyLabel btn_logout;
    private component.MyLabel btn_myTask;
    private component.MyLabel btn_navIcon;
    private component.MyLabel btn_pomodoro;
    private javax.swing.JLabel btn_profile;
    private component.MyLabel btn_todayTask;
    private component.MyPanelCustBorder footer1;
    private component.MyLabel l_date;
    private component.MyLabel l_myList;
    private component.MyLabel l_titleTask;
    private component.MyLabel l_userGreet;
    private component.MyLabel l_userName;
    private component.MyPanelCustBorder mainPanel;
    private component.MyPanelCustBorder navbar;
    private component.MyPanel p_sideBar;
    private component.MyTextFieldCustBorder t_search;
    // End of variables declaration//GEN-END:variables
}
