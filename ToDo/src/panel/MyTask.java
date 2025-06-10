package panel;

import component.MyOptionPane;
import frame.ToDoFrame;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.SwingUtilities;
import repository.TaskRepository;


public class MyTask extends javax.swing.JPanel {
    private CardLayout cardLayout;    
    private String currentSection;
    
    private static LocalDate date; // MENGAMBIL TANGGAL HARI INI    
    private static LocalTime now; // MENGAMBIL WAKTU SEKARANG SECARA REAL TIME
    private static DateTimeFormatter format; // FORMAT PENULISAN TANGGAL DAN WAKTU    
    
    public static String todayDate;
    
    private AllTask allTask;
    private TodayTask todayTask;
    private CompletedTask completedTask;
    
    public MyTask() {
        initComponents();        
        // MEMBUAT PANEL UTAMA UNTUK CARD LAYOUT
        cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout);

        allTask = new AllTask();
        todayTask = new TodayTask();
        completedTask = new CompletedTask();
        
        
        // MENAMBAHKAN PANEL-PANEL KE DALAM CARD LAYOUT
        mainPanel.add(allTask, "AllTask");
        mainPanel.add(todayTask, "TodayTask");
        mainPanel.add(completedTask, "CompletedTask");

        // MENAMBAHKAN mainPanel KE LAYOUT UTAMA (DI BAGIAN TENGAH)
        this.add(mainPanel, BorderLayout.CENTER);  
        userGreeting();
        
        // SET BUTTON NAV TEXT
        btn_navIcon.setText("  All Task");
        
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

        mainPanel = new component.MyPanelCustBorder();
        navbar = new component.MyPanelCustBorder();
        btn_navIcon = new component.MyLabel();
        btn_myTask = new component.MyLabel();
        btn_pomodoro = new component.MyLabel();
        btn_logout = new component.MyLabel();
        btn_profile = new javax.swing.JLabel();
        p_sideBar = new component.MyPanel();
        l_userName = new component.MyLabel();
        l_myList = new component.MyLabel();
        btn_allTask = new component.MyLabel();
        btn_todayTask = new component.MyLabel();
        btn_completedTask = new component.MyLabel();
        l_userGreet = new component.MyLabel();
        l_date = new component.MyLabel();
        btn_addTask = new component.MyButton();
        l_titleTask = new component.MyLabel();
        t_search = new component.MyTextFieldCustBorder();
        footer1 = new component.MyPanelCustBorder();
        myLabel1 = new component.MyLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(null);

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

        navbar.setBackground(new java.awt.Color(255, 255, 255));
        navbar.setBackgroundColor((new java.awt.Color(255, 255, 255, 190)));
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
        navbar.add(btn_myTask);
        btn_myTask.setBounds(650, -2, 80, 50);

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
        btn_pomodoro.setBounds(740, -2, 100, 50);

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
        btn_logout.setBounds(850, 0, 60, 50);

        btn_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ImageUser.png"))); // NOI18N
        navbar.add(btn_profile);
        btn_profile.setBounds(940, 0, 60, 50);

        add(navbar);
        navbar.setBounds(0, 0, 1000, 50);

        p_sideBar.setBackground(new java.awt.Color(255, 255, 255));
        p_sideBar.setBackgroundColor((new java.awt.Color(255, 255, 255, 190)));
        p_sideBar.setBorderColor(new java.awt.Color(255, 255, 255));
        p_sideBar.setCornerRadius(13);

        l_userName.setText("user");
        l_userName.setColorClick(new java.awt.Color(0, 0, 0));
        l_userName.setColorOver(new java.awt.Color(0, 0, 0));
        l_userName.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        l_myList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/MyList.png"))); // NOI18N
        l_myList.setText("  My List");
        l_myList.setColorClick(new java.awt.Color(0, 0, 0));
        l_myList.setColorOver(new java.awt.Color(0, 0, 0));
        l_myList.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        btn_allTask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/AllTasks.png"))); // NOI18N
        btn_allTask.setText(" All Tasks");
        btn_allTask.setColorClick(new java.awt.Color(204, 204, 204));
        btn_allTask.setColorOver(new java.awt.Color(153, 153, 153));
        btn_allTask.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_allTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_allTaskMouseClicked(evt);
            }
        });

        btn_todayTask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Today.png"))); // NOI18N
        btn_todayTask.setText(" Today");
        btn_todayTask.setColorClick(new java.awt.Color(204, 204, 204));
        btn_todayTask.setColorOver(new java.awt.Color(153, 153, 153));
        btn_todayTask.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_todayTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_todayTaskMouseClicked(evt);
            }
        });

        btn_completedTask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Completed.png"))); // NOI18N
        btn_completedTask.setText(" Completed");
        btn_completedTask.setColorClick(new java.awt.Color(204, 204, 204));
        btn_completedTask.setColorOver(new java.awt.Color(153, 153, 153));
        btn_completedTask.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_completedTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_completedTaskMouseClicked(evt);
            }
        });

        l_userGreet.setText("Selamat Datang");
        l_userGreet.setColorClick(new java.awt.Color(0, 0, 0));
        l_userGreet.setColorOver(new java.awt.Color(0, 0, 0));
        l_userGreet.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        l_date.setText("DD/MM/YYYY");
        l_date.setColorClick(new java.awt.Color(0, 0, 0));
        l_date.setColorOver(new java.awt.Color(0, 0, 0));
        l_date.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        javax.swing.GroupLayout p_sideBarLayout = new javax.swing.GroupLayout(p_sideBar);
        p_sideBar.setLayout(p_sideBarLayout);
        p_sideBarLayout.setHorizontalGroup(
            p_sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_sideBarLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(p_sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_sideBarLayout.createSequentialGroup()
                        .addGroup(p_sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p_sideBarLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(p_sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_todayTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_allTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_completedTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(l_myList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_sideBarLayout.createSequentialGroup()
                        .addGroup(p_sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p_sideBarLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(l_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_sideBarLayout.createSequentialGroup()
                                .addComponent(l_userGreet, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addComponent(l_date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        p_sideBarLayout.setVerticalGroup(
            p_sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_sideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_userGreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l_myList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_allTask, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_todayTask, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_completedTask, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        add(p_sideBar);
        p_sideBar.setBounds(40, 100, 217, 270);

        btn_addTask.setBackground(new java.awt.Color(255, 255, 255));
        btn_addTask.setForeground(new java.awt.Color(0, 0, 0));
        btn_addTask.setText("Add Task");
        btn_addTask.setBorderColor(new java.awt.Color(255, 255, 255));
        btn_addTask.setColor(new java.awt.Color(255, 255, 255));
        btn_addTask.setColorClick(new java.awt.Color(204, 204, 204));
        btn_addTask.setColorOver(new java.awt.Color(153, 153, 153));
        btn_addTask.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btn_addTask.setRadius(5);
        btn_addTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addTaskActionPerformed(evt);
            }
        });
        add(btn_addTask);
        btn_addTask.setBounds(580, 140, 120, 40);

        l_titleTask.setText("All Task");
        l_titleTask.setColorClick(new java.awt.Color(0, 0, 0));
        l_titleTask.setColorOver(new java.awt.Color(0, 0, 0));
        l_titleTask.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        add(l_titleTask);
        l_titleTask.setBounds(280, 98, 290, 30);

        t_search.setCornerRadius(15);
        t_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_searchActionPerformed(evt);
            }
        });
        add(t_search);
        t_search.setBounds(280, 140, 291, 37);

        footer1.setBackground(new java.awt.Color(255, 255, 255));
        footer1.setBackgroundColor((new java.awt.Color(255, 255, 255, 190)));
        footer1.setBorderBottom(false);
        footer1.setBorderLeft(false);
        footer1.setBorderRight(false);
        footer1.setBorderTop(false);
        footer1.setPreferredSize(new java.awt.Dimension(100, 50));

        myLabel1.setText("@copyrightToDoList2025");
        myLabel1.setColorClick(new java.awt.Color(0, 0, 0));
        myLabel1.setColorOver(new java.awt.Color(0, 0, 0));
        myLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        javax.swing.GroupLayout footer1Layout = new javax.swing.GroupLayout(footer1);
        footer1.setLayout(footer1Layout);
        footer1Layout.setHorizontalGroup(
            footer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footer1Layout.createSequentialGroup()
                .addContainerGap(427, Short.MAX_VALUE)
                .addComponent(myLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(437, 437, 437))
        );
        footer1Layout.setVerticalGroup(
            footer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footer1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(myLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        add(footer1);
        footer1.setBounds(0, 650, 1000, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/backgroundMyTask.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 700);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btn_navIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_navIconMouseClicked
        ToDoFrame toDoFrame = (ToDoFrame) SwingUtilities.getWindowAncestor(this);
        if (toDoFrame != null) {
            toDoFrame.showMyTask();
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

    private void btn_completedTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_completedTaskMouseClicked
        l_titleTask.setText("Completed Task");
        currentSection = "Completed Task";
        System.out.println("SHOWING COMPLETED TASK PANEL");   
        completedTask.showTask();
        cardLayout.show(mainPanel, "CompletedTask");        
    }//GEN-LAST:event_btn_completedTaskMouseClicked

    private void btn_pomodoroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pomodoroMouseClicked
        ToDoFrame toDoFrame = (ToDoFrame) SwingUtilities.getWindowAncestor(this);
        if (toDoFrame != null) {
            toDoFrame.showPomodoro();
        }
    }//GEN-LAST:event_btn_pomodoroMouseClicked


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
    private javax.swing.JLabel jLabel1;
    private component.MyLabel l_date;
    private component.MyLabel l_myList;
    private component.MyLabel l_titleTask;
    private component.MyLabel l_userGreet;
    private component.MyLabel l_userName;
    private component.MyPanelCustBorder mainPanel;
    private component.MyLabel myLabel1;
    private component.MyPanelCustBorder navbar;
    private component.MyPanel p_sideBar;
    private component.MyTextFieldCustBorder t_search;
    // End of variables declaration//GEN-END:variables
}
