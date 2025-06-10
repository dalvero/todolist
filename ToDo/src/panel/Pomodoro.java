package panel;

import component.MyOptionPane;
import frame.ToDoFrame;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import objek.MusicPlayer;
import objek.Song;
import repository.SongRepository;

public class Pomodoro extends javax.swing.JPanel {   
    private int waktuSaatIni = 25 * 60; // 25 MENIT
    private int waktuPendek = 5 * 60; // 5 MENIT
    private int waktuPanjang = 15 * 60; // 15 MENIT
    private boolean isMainTimer = true;
    private boolean isShortTimer = true;
    private boolean isLongTimer = true;
    private int countSession = 0;       
    
    // SONG LIST 
    private CardLayout cardLayout;
    private SongList songList;    
    public  Song currentSong;
    
    // MUSIC PLAYER
    public MusicPlayer musicPlayer;

    
    // UNTUK MEMBUKA FILE EXPLORER DI APLIKASI KITA
    private JFileChooser jFileChooser;
    
    public Pomodoro() {
        initComponents();
        myInits();
        l_session.setText("Session : " + countSession);

        // MUSIC UTILITIES
        cardLayout = new CardLayout();
        p_songListPanel.setLayout(cardLayout);   
        songList = new SongList(this);
        p_songListPanel.add(songList, "SongList");                  
        
        musicPlayer = new MusicPlayer();
        
        jFileChooser = new JFileChooser();
        jFileChooser.setCurrentDirectory(new File("src/song"));
        
        // MEMFILTER FILE YANG HANYA EXTENSION mp3
        jFileChooser.setFileFilter(new FileNameExtensionFilter("MP3", "mp3"));                
        
    }
    
    public void myInits(){
        playbackBtns.add(btn_prevSong);
        playbackBtns.add(btn_playSong);
        playbackBtns.add(btn_pauseSong);
        playbackBtns.add(btn_nextSong); 
        
        btn_pauseSong.setVisible(false);
        btn_pauseSong.setEnabled(false);                
    }
    
    public void ubahPauseJadiPlay(){
        JButton playButton = (JButton) playbackBtns.getComponent(1);
        JButton pauseButton = (JButton) playbackBtns.getComponent(2);
        
        pauseButton.setVisible(false);
        pauseButton.setEnabled(false);                
        
        playButton.setVisible(true);
        playButton.setEnabled(true);                
    }
    
    public void ubahPlayJadiPause(){
        JButton playButton = (JButton) playbackBtns.getComponent(1);
        JButton pauseButton = (JButton) playbackBtns.getComponent(2);
        
        pauseButton.setVisible(true);
        pauseButton.setEnabled(true);                
        
        playButton.setVisible(false);
        playButton.setEnabled(false);                
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myPanel1 = new component.MyPanel();
        btn_pause = new component.MyButton();
        btn_start = new component.MyButton();
        btn_edit = new component.MyButton();
        btn_reset = new component.MyButton();
        l_mainTimer = new component.MyLabel();
        l_shortTimer = new component.MyLabel();
        l_shortBreak = new component.MyLabel();
        l_longBreak = new component.MyLabel();
        l_longTimer = new component.MyLabel();
        l_title = new component.MyLabel();
        l_title2 = new component.MyLabel();
        l_session = new component.MyLabel();
        p_musicPlayer = new component.MyPanel();
        l_songArtist = new component.MyLabel();
        playbackBtns = new component.MyPanel();
        btn_playSong = new component.MyButton();
        btn_nextSong = new component.MyButton();
        btn_prevSong = new component.MyButton();
        btn_pauseSong = new component.MyButton();
        btn_addMusic = new component.MyButton();
        l_songTitle = new component.MyLabel();
        navbar = new component.MyPanelCustBorder();
        btn_navIcon = new component.MyLabel();
        btn_profile = new javax.swing.JLabel();
        btn_myTask = new component.MyLabel();
        btn_pomodoro = new component.MyLabel();
        btn_logout = new component.MyLabel();
        myPanelCustBorder1 = new component.MyPanelCustBorder();
        myLabel2 = new component.MyLabel();
        p_songListPanel = new component.MyPanel();
        myLabel1 = new component.MyLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myPanel1.setBackground(new java.awt.Color(255, 255, 255));
        myPanel1.setBackgroundColor(new java.awt.Color(255, 255, 255, 190));
        myPanel1.setBorderColor((new java.awt.Color(255, 255, 255, 190)));
        myPanel1.setCornerRadius(13);
        myPanel1.setLayout(null);

        btn_pause.setForeground(new java.awt.Color(102, 102, 102));
        btn_pause.setText("Pause");
        btn_pause.setBorderColor(new java.awt.Color(204, 204, 204));
        btn_pause.setColor(new java.awt.Color(245, 245, 245));
        btn_pause.setColorClick(new java.awt.Color(220, 220, 220));
        btn_pause.setColorOver(new java.awt.Color(250, 250, 250));
        btn_pause.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btn_pause.setRadius(10);
        btn_pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pauseActionPerformed(evt);
            }
        });
        myPanel1.add(btn_pause);
        btn_pause.setBounds(20, 380, 170, 30);

        btn_start.setBorder(null);
        btn_start.setForeground(new java.awt.Color(102, 102, 102));
        btn_start.setText("Start");
        btn_start.setBorderColor(new java.awt.Color(204, 204, 204));
        btn_start.setColor(new java.awt.Color(245, 245, 245));
        btn_start.setColorClick(new java.awt.Color(220, 220, 220));
        btn_start.setColorOver(new java.awt.Color(250, 250, 250));
        btn_start.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btn_start.setRadius(10);
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        myPanel1.add(btn_start);
        btn_start.setBounds(120, 300, 140, 30);

        btn_edit.setForeground(new java.awt.Color(102, 102, 102));
        btn_edit.setText("Edit");
        btn_edit.setBorderColor(new java.awt.Color(204, 204, 204));
        btn_edit.setColor(new java.awt.Color(245, 245, 245));
        btn_edit.setColorClick(new java.awt.Color(220, 220, 220));
        btn_edit.setColorOver(new java.awt.Color(250, 250, 250));
        btn_edit.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btn_edit.setRadius(10);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        myPanel1.add(btn_edit);
        btn_edit.setBounds(200, 380, 170, 30);

        btn_reset.setForeground(new java.awt.Color(102, 102, 102));
        btn_reset.setText("Reset");
        btn_reset.setBorderColor(new java.awt.Color(204, 204, 204));
        btn_reset.setColor(new java.awt.Color(245, 245, 245));
        btn_reset.setColorClick(new java.awt.Color(220, 220, 220));
        btn_reset.setColorOver(new java.awt.Color(250, 250, 250));
        btn_reset.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btn_reset.setRadius(10);
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        myPanel1.add(btn_reset);
        btn_reset.setBounds(120, 340, 140, 30);

        l_mainTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_mainTimer.setText("00.25.00");
        l_mainTimer.setColorClick(new java.awt.Color(0, 0, 0));
        l_mainTimer.setColorOver(new java.awt.Color(0, 0, 0));
        l_mainTimer.setFont(new java.awt.Font("SansSerif", 1, 72)); // NOI18N
        myPanel1.add(l_mainTimer);
        l_mainTimer.setBounds(0, 150, 390, 80);

        l_shortTimer.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l_shortTimer.setText("00.05.00");
        l_shortTimer.setColorClick(new java.awt.Color(0, 0, 0));
        l_shortTimer.setColorOver(new java.awt.Color(0, 0, 0));
        l_shortTimer.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        myPanel1.add(l_shortTimer);
        l_shortTimer.setBounds(0, 260, 130, 32);

        l_shortBreak.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l_shortBreak.setText("Short Break");
        l_shortBreak.setColorClick(new java.awt.Color(0, 0, 0));
        l_shortBreak.setColorOver(new java.awt.Color(0, 0, 0));
        l_shortBreak.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        myPanel1.add(l_shortBreak);
        l_shortBreak.setBounds(0, 230, 130, 24);

        l_longBreak.setText("Long Break");
        l_longBreak.setColorClick(new java.awt.Color(0, 0, 0));
        l_longBreak.setColorOver(new java.awt.Color(0, 0, 0));
        l_longBreak.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        myPanel1.add(l_longBreak);
        l_longBreak.setBounds(260, 230, 120, 24);

        l_longTimer.setText("00.20.00");
        l_longTimer.setColorClick(new java.awt.Color(0, 0, 0));
        l_longTimer.setColorOver(new java.awt.Color(0, 0, 0));
        l_longTimer.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        myPanel1.add(l_longTimer);
        l_longTimer.setBounds(260, 260, 130, 32);

        l_title.setText("Pomodoro");
        l_title.setColorClick(new java.awt.Color(0, 0, 0));
        l_title.setColorOver(new java.awt.Color(0, 0, 0));
        l_title.setFont(new java.awt.Font("SansSerif", 1, 72)); // NOI18N
        myPanel1.add(l_title);
        l_title.setBounds(10, 10, 370, 80);

        l_title2.setText("Timer");
        l_title2.setColorClick(new java.awt.Color(0, 0, 0));
        l_title2.setColorOver(new java.awt.Color(0, 0, 0));
        l_title2.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        myPanel1.add(l_title2);
        l_title2.setBounds(10, 90, 150, 62);

        l_session.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l_session.setText("Session : ");
        l_session.setColorClick(new java.awt.Color(0, 0, 0));
        l_session.setColorOver(new java.awt.Color(0, 0, 0));
        l_session.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        myPanel1.add(l_session);
        l_session.setBounds(210, 110, 170, 30);

        add(myPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 112, 390, 460));

        p_musicPlayer.setBackground(new java.awt.Color(255, 255, 255));
        p_musicPlayer.setBackgroundColor(new java.awt.Color(255, 255, 255, 190));
        p_musicPlayer.setBorderColor(new java.awt.Color(255, 255, 255));
        p_musicPlayer.setCornerRadius(13);
        p_musicPlayer.setLayout(null);

        l_songArtist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_songArtist.setText("----");
        l_songArtist.setColorClick(new java.awt.Color(0, 0, 0));
        l_songArtist.setColorOver(new java.awt.Color(0, 0, 0));
        l_songArtist.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        p_musicPlayer.add(l_songArtist);
        l_songArtist.setBounds(0, 160, 340, 20);

        playbackBtns.setBackground(new java.awt.Color(255, 255, 255));
        playbackBtns.setBackgroundColor((new java.awt.Color(255, 255, 255, 190)));
        playbackBtns.setBorderColor((new java.awt.Color(255, 255, 255, 190)));
        playbackBtns.setLayout(null);

        btn_playSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/play40.png"))); // NOI18N
        btn_playSong.setBorderColor(new java.awt.Color(255, 255, 255));
        btn_playSong.setColor(new java.awt.Color(255, 255, 255));
        btn_playSong.setColorClick(new java.awt.Color(204, 204, 204));
        btn_playSong.setColorOver(new java.awt.Color(102, 102, 102));
        btn_playSong.setRadius(1000);
        btn_playSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_playSongActionPerformed(evt);
            }
        });
        playbackBtns.add(btn_playSong);
        btn_playSong.setBounds(150, 0, 46, 50);

        btn_nextSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nextRight40.png"))); // NOI18N
        btn_nextSong.setBorderColor(new java.awt.Color(255, 255, 255));
        btn_nextSong.setColor(new java.awt.Color(255, 255, 255));
        btn_nextSong.setColorClick(new java.awt.Color(204, 204, 204));
        btn_nextSong.setColorOver(new java.awt.Color(102, 102, 102));
        btn_nextSong.setRadius(1000);
        btn_nextSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextSongActionPerformed(evt);
            }
        });
        playbackBtns.add(btn_nextSong);
        btn_nextSong.setBounds(210, 0, 46, 50);

        btn_prevSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nextLeft40.png"))); // NOI18N
        btn_prevSong.setBorderColor(new java.awt.Color(255, 255, 255));
        btn_prevSong.setColor(new java.awt.Color(255, 255, 255));
        btn_prevSong.setColorClick(new java.awt.Color(204, 204, 204));
        btn_prevSong.setColorOver(new java.awt.Color(102, 102, 102));
        btn_prevSong.setRadius(1000);
        btn_prevSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prevSongActionPerformed(evt);
            }
        });
        playbackBtns.add(btn_prevSong);
        btn_prevSong.setBounds(80, 0, 46, 50);

        btn_pauseSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pause40.png"))); // NOI18N
        btn_pauseSong.setBorderColor(new java.awt.Color(255, 255, 255));
        btn_pauseSong.setColor(new java.awt.Color(255, 255, 255));
        btn_pauseSong.setColorClick(new java.awt.Color(204, 204, 204));
        btn_pauseSong.setColorOver(new java.awt.Color(153, 153, 153));
        btn_pauseSong.setRadius(1000);
        btn_pauseSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pauseSongActionPerformed(evt);
            }
        });
        playbackBtns.add(btn_pauseSong);
        btn_pauseSong.setBounds(150, 0, 46, 50);

        p_musicPlayer.add(playbackBtns);
        playbackBtns.setBounds(0, 100, 340, 60);

        btn_addMusic.setBackground(new java.awt.Color(0, 0, 0));
        btn_addMusic.setForeground(new java.awt.Color(255, 255, 255));
        btn_addMusic.setText("Add Music");
        btn_addMusic.setBorderColor(new java.awt.Color(0, 0, 0));
        btn_addMusic.setColor(java.awt.Color.black);
        btn_addMusic.setColorClick(new java.awt.Color(51, 51, 51));
        btn_addMusic.setColorOver(new java.awt.Color(51, 51, 51));
        btn_addMusic.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_addMusic.setRadius(5);
        btn_addMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addMusicActionPerformed(evt);
            }
        });
        p_musicPlayer.add(btn_addMusic);
        btn_addMusic.setBounds(220, 10, 110, 34);

        l_songTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_songTitle.setText("Motivation Playlist");
        l_songTitle.setColorClick(new java.awt.Color(0, 0, 0));
        l_songTitle.setColorOver(new java.awt.Color(0, 0, 0));
        l_songTitle.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        p_musicPlayer.add(l_songTitle);
        l_songTitle.setBounds(0, 70, 340, 20);

        add(p_musicPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 69, 340, 210));

        navbar.setBackground(new java.awt.Color(255, 255, 255));
        navbar.setBackgroundColor((new java.awt.Color(255, 255, 255, 100)));
        navbar.setBorderBottom(false);
        navbar.setBorderColor(new java.awt.Color(102, 102, 102));
        navbar.setBorderLeft(false);
        navbar.setBorderRight(false);
        navbar.setBorderTop(false);
        navbar.setPreferredSize(new java.awt.Dimension(1050, 50));
        navbar.setLayout(null);

        btn_navIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/todoIcon24.png"))); // NOI18N
        btn_navIcon.setText("  Pomodoro");
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

        btn_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ImageUser.png"))); // NOI18N
        navbar.add(btn_profile);
        btn_profile.setBounds(940, 0, 60, 50);

        btn_myTask.setText("My Task");
        btn_myTask.setColorClick(new java.awt.Color(204, 204, 204));
        btn_myTask.setColorOver(new java.awt.Color(102, 102, 102));
        btn_myTask.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_myTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_myTaskMouseClicked(evt);
            }
        });
        navbar.add(btn_myTask);
        btn_myTask.setBounds(680, 10, 69, 24);

        btn_pomodoro.setText("Pomodoro");
        btn_pomodoro.setColorClick(new java.awt.Color(204, 204, 204));
        btn_pomodoro.setColorOver(new java.awt.Color(102, 102, 102));
        btn_pomodoro.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_pomodoro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pomodoroMouseClicked(evt);
            }
        });
        navbar.add(btn_pomodoro);
        btn_pomodoro.setBounds(760, 10, 82, 24);

        btn_logout.setText("Logout");
        btn_logout.setColorClick(new java.awt.Color(204, 204, 204));
        btn_logout.setColorOver(new java.awt.Color(102, 102, 102));
        btn_logout.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });
        navbar.add(btn_logout);
        btn_logout.setBounds(860, 10, 55, 24);

        add(navbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        myPanelCustBorder1.setBackground(new java.awt.Color(255, 255, 255));
        myPanelCustBorder1.setBackgroundColor(new java.awt.Color(255, 255, 255, 190));
        myPanelCustBorder1.setBorderBottom(false);
        myPanelCustBorder1.setBorderLeft(false);
        myPanelCustBorder1.setBorderRight(false);
        myPanelCustBorder1.setBorderTop(false);

        myLabel2.setText("@copyrightToDoList2025");
        myLabel2.setColorClick(new java.awt.Color(0, 0, 0));
        myLabel2.setColorOver(new java.awt.Color(0, 0, 0));
        myLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        javax.swing.GroupLayout myPanelCustBorder1Layout = new javax.swing.GroupLayout(myPanelCustBorder1);
        myPanelCustBorder1.setLayout(myPanelCustBorder1Layout);
        myPanelCustBorder1Layout.setHorizontalGroup(
            myPanelCustBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelCustBorder1Layout.createSequentialGroup()
                .addGap(417, 417, 417)
                .addComponent(myLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(424, Short.MAX_VALUE))
        );
        myPanelCustBorder1Layout.setVerticalGroup(
            myPanelCustBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelCustBorder1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(myLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        add(myPanelCustBorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 1000, 50));

        p_songListPanel.setBackground(new java.awt.Color(255, 255, 255));
        p_songListPanel.setBackgroundColor((new java.awt.Color(255, 255, 255, 190)));
        p_songListPanel.setBorderColor(new java.awt.Color(255, 255, 255));
        p_songListPanel.setCornerRadius(15);

        javax.swing.GroupLayout p_songListPanelLayout = new javax.swing.GroupLayout(p_songListPanel);
        p_songListPanel.setLayout(p_songListPanelLayout);
        p_songListPanelLayout.setHorizontalGroup(
            p_songListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        p_songListPanelLayout.setVerticalGroup(
            p_songListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        add(p_songListPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, -1));

        myLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/backgroundPomodoroo.jpg"))); // NOI18N
        add(myLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));
    }// </editor-fold>//GEN-END:initComponents
    
    // MAIN TIMER
    Timer mainTimer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (waktuSaatIni > 0) {          
                isMainTimer = true;
                waktuSaatIni--;
                int jam = waktuSaatIni / 3600;
                int sisa = waktuSaatIni % 3600;
                int menit = sisa / 60;
                int detik = sisa % 60;
                l_mainTimer.setText(String.format("%02d:%02d:%02d", jam, menit, detik));
            } else {
                ((Timer) e.getSource()).stop(); // STOP TIMER SAAT WAKTU HABIS
                l_mainTimer.setText("00:00:00");
                countSession++;
                System.out.println("Ini sesi ke-" + countSession);
                l_session.setText("Session : " + countSession);                                                                              
                
                // DISINI BISA MENAMBAHKAN ALARM/POP UP   
                
                
                if (countSession % 4 != 0) {
                    MyOptionPane.showConfirm(Pomodoro.this, "Waktu anda telah habis, apakah ingin beristirahat?", "Konfirmasi", result -> {
                        if (result) {
                            if (waktuPendek == 0) {
                                waktuPendek = 5;
                            }
                            isMainTimer = false;
                            isLongTimer = false;
                            isShortTimer = true; // SHORT TIMER SEDANG BERJALAN
                            shortTimer.start();                            
                        } else { // RESET KE MAIN TIMER          
                            mainTimer.stop();
                            waktuSaatIni = 5;
                            l_mainTimer.setText("00:00:00");     
                            isMainTimer = true;
                            isLongTimer = false;
                            isShortTimer = false;
                        }
                    });
                } 
                
                if (countSession % 4 == 0) {
                    MyOptionPane.showConfirm(Pomodoro.this, "Waktu anda telah habis, ini saatnya istirahat panjang?", "Konfirmasi", result -> {
                        if (result) {
                            if (waktuPanjang == 0) {
                                waktuPanjang = 5;
                            }
                            longTimer.start();      
                            isMainTimer = false;
                            isShortTimer =  false;
                            isLongTimer = true;
                                    
                        } else {                            
                            mainTimer.stop();
                            waktuSaatIni = 5;
                            l_mainTimer.setText("00:00:00");                            
                            isMainTimer = true;
                            isLongTimer = false;
                            isShortTimer = false;
                            
                        }
                    });
                }                
            }
        }
    });
    
    // SHORT TIMER
    Timer shortTimer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (waktuPendek > 0) {                
                isShortTimer = true;
                waktuPendek--;
                int menit = waktuPendek / 60;
                int detik = waktuPendek % 60;
                l_shortTimer.setText(String.format("00:%02d:%02d", menit, detik));
            } else {
                ((Timer) e.getSource()).stop(); // STOP TIMER SAAT WAKTU HABIS
                l_shortTimer.setText("00:00:00");
                // DISINI BISA MENAMBAHKAN ALARM/POP UP                                
                waktuSaatIni = 5;                
                mainTimer.start();
            }
        }
    });
    
    // MAIN TIMER
    Timer longTimer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (waktuPanjang > 0) {                
                isLongTimer = true;
                waktuPanjang--;
                int menit = waktuPanjang / 60;
                int detik = waktuPanjang % 60;
                l_longTimer.setText(String.format("00:%02d:%02d", menit, detik));
            } else {
                ((Timer) e.getSource()).stop(); // STOP TIMER SAAT WAKTU HABIS
                l_longTimer.setText("00:00:00");                
                // DISINI BISA MENAMBAHKAN ALARM/POP UP                 
                waktuSaatIni = 5;
                mainTimer.start();
            }
        }
    });
    
    private void btn_pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pauseActionPerformed
        if (isMainTimer) {
            System.out.println("IF SATU");
            mainTimer.stop();
            isMainTimer = true;
            return;
        }
        
        if (isShortTimer) {
            System.out.println("IF DUA");
            shortTimer.stop();
            isShortTimer = true;
            return;
        }
        
        if (isLongTimer) {
            System.out.println("IF TIGA");
            longTimer.stop();
            isLongTimer = true;
            return;
        }
        
        
    }//GEN-LAST:event_btn_pauseActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        System.out.println("CEK KONDISI UNTUK START: ");
        System.out.println("MAIN : " + isMainTimer);
        System.out.println("SHORT : " + isShortTimer);
        System.out.println("LONG : " + isLongTimer);        
        
        if (isMainTimer) {
            System.out.println("IF 1");
            mainTimer.start();
            isMainTimer = true;
            isShortTimer = false;
            isLongTimer = false;
            return;
        }
        
        if (isShortTimer) {
            System.out.println("IF 2");
            shortTimer.start();
            isShortTimer = true;
            isMainTimer = false;
            isLongTimer = false;
            return;
        }
        
        if (isLongTimer) {
            System.out.println("IF 3");
            longTimer.start();
            isLongTimer = true;
            isShortTimer = false;
            isMainTimer = false;
            return;
        }
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // LOGIKA MENAMPILKAN POP UP PANEL
        // 1. AMBIL FRAME UTAMA KITA
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame == null) {
            System.err.println("Tidak dapat menemukan JFrame utama.");
            MyOptionPane.showInfo(this, "Kesalahan: Frame utama tidak ditemukan.", "Error");
            return;
        }

        // 2. BUAT GLASSPANE UNTUK BACKGROUND POP UP
        JComponent glassPane = (JComponent) frame.getGlassPane();
        glassPane.setLayout(new BorderLayout()); // LAYOUT INI UNTUK MENGISI SELURUH AREA/BACKGROUND        
        glassPane.removeAll(); // CLEAR DULU KOMPONEN SEBELUMNYA

        // 3. INISIALISASI PANEL POP UP        
        EditTimerPanel popUp = new EditTimerPanel();                

        // 4. INISIALISASI PANEL OVERLAY
        JPanel overlay = new JPanel(new GridBagLayout()) { // BIAR POP UP ADA DITENGAH PAKAI GridBagLayout
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setColor(new Color(0, 0, 0, 150)); // WARNA AKAN HITAM TRANSPARAN
                g2d.fillRect(0, 0, getWidth(), getHeight());
                g2d.dispose();
            }
        };
        overlay.setOpaque(false); 

        // MENAMBAHKAN POP UP KE TENGAH OVERLAY
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0; 
        gbc.weighty = 1.0; 
        gbc.anchor = GridBagConstraints.CENTER; // MEMPOSISIKAN DI TENGAH
        overlay.add(popUp, gbc);

        // 5. MENAMBAHKAN OVERLAY KE GLASSPANE
        glassPane.add(overlay, BorderLayout.CENTER);

        // 6. MENGATUR ULANG, VALIDASI DAN MENAMPILKAN glassPane
        glassPane.revalidate();
        glassPane.repaint();
        glassPane.setVisible(true);

        // 7. MENDAPATKAN BUTTON SAVE DARI POP UP (EditTimerPanel)
        JButton saveButton = popUp.getSaveButton();                
        for (ActionListener al : saveButton.getActionListeners()) {
            saveButton.removeActionListener(al);
        }
        saveButton.addActionListener(e -> {
            try {
                // MENDAPATKAN NILAI SPINNER
                int mainTimerDetik = popUp.getMainTimerInSecond();
                int shortBreakDetik = popUp.getShortBreakInSecond();
                int longBreakDetik = popUp.getLongBreakInSecond();

                // MEMVALIDASI
                if (mainTimerDetik <= 0 || shortBreakDetik <= 0 || longBreakDetik <= 0) {
                    MyOptionPane.showWarning(popUp, "Nilai timer harus lebih besar dari 0.", "Input Tidak Valid");
                    return;
                }

                System.out.println("Pengaturan Baru - Main Timer: " + mainTimerDetik + " detik");
                System.out.println("Pengaturan Baru - Short Break: " + shortBreakDetik + " detik");
                System.out.println("Pengaturan Baru - Long Break: " + longBreakDetik + " detik");

                // PERBARUI NILAI DEFAULT TIMER DI POMODORO
                waktuSaatIni = mainTimerDetik;
                waktuPendek = shortBreakDetik;
                waktuPanjang = longBreakDetik;                   
                MyOptionPane.showInfo(this, "Pengaturan timer berhasil disimpan!", "Sukses");

            } catch (NumberFormatException ex) {
                MyOptionPane.showWarning(popUp, "Format input salah. Harap masukkan angka.", "Error Input");
                return;
            } catch (Exception ex) {
                MyOptionPane.showWarning(popUp, "Terjadi kesalahan: " + ex.getMessage(), "Error");
                ex.printStackTrace();
                return;
            }

            // MENYEMBUNYIKAN GLASSPANE JIKA BERHASIL
            glassPane.removeAll();
            glassPane.revalidate();
            glassPane.repaint();
            glassPane.setVisible(false);
        });        
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        System.out.println("CEK KONDISI UNTUK RESET: ");
        System.out.println("MAIN : " + isMainTimer);
        System.out.println("SHORT : " + isShortTimer);
        System.out.println("LONG : " + isLongTimer);        
        
        if (isMainTimer) {
            System.out.println("IF ONE");
            mainTimer.stop();
            waktuSaatIni = 25 * 60;
            l_mainTimer.setText("00:00:00");
            isMainTimer = true;
            isShortTimer = false;
            isLongTimer = false;
            return;
        }
        
        if (isShortTimer) {
            System.out.println("IF TWO");
            shortTimer.stop();
            waktuPendek = 5 * 60;
            l_shortTimer.setText("00:00:00");
            isShortTimer = true;
            isMainTimer = false;
            isLongTimer = false;
            return;
        }
        
        if (isLongTimer) {
            System.out.println("IF THREE");
            longTimer.stop();
            waktuPanjang = 15 * 60;
            l_longTimer.setText("00:00:00");
            isLongTimer = true;
            isShortTimer = false;
            isMainTimer = false;
            return;
        }
        
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_addMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addMusicActionPerformed
        int result = jFileChooser.showOpenDialog(this); // DIUBAH KE INTEGER UNTUK VALIDASI
        File selecFile = jFileChooser.getSelectedFile();
        
        if (result == JFileChooser.APPROVE_OPTION && selecFile != null) {
            // INISIALISASI MUSIC
            Song song = new Song(selecFile.getPath());
            SongRepository.addSong(song, Login.user.getId_user());                        
            
            songList.showSongList();
            cardLayout.show(p_songListPanel, "SongList");            
        }
    }//GEN-LAST:event_btn_addMusicActionPerformed
        
    public void getCurrentSong(Song song){
        this.currentSong = song;
        setLabelSongTitle(song.getSongTitle());
    }
    
    public void setLabelSongTitle(String text){
        l_songArtist.setText(text);
        l_songArtist.revalidate();
        l_songArtist.repaint();
    }    
    
    private void btn_pauseSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pauseSongActionPerformed
        ubahPauseJadiPlay();
        musicPlayer.pauseSong();
    }//GEN-LAST:event_btn_pauseSongActionPerformed

    private void btn_prevSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prevSongActionPerformed
        String currentSongTitle = l_songArtist.getText();
        Song currentSong = SongRepository.getSongByTitle(currentSongTitle);
        if (currentSong == null) {
            return;
        }
        if (SongRepository.getSongIndexPosition(currentSong) == 0) {
            System.out.println("Musik Ada Di Awal Playlist");
        } else {
            musicPlayer.pauseSong();
            Song nextSong = SongRepository.getListSong(Login.user.getId_user()).get(SongRepository.getSongIndexPosition(currentSong) - 1);
            musicPlayer.loadSong(nextSong);
            l_songArtist.setText(nextSong.getSongTitle());
        }
    }//GEN-LAST:event_btn_prevSongActionPerformed

    private void btn_nextSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextSongActionPerformed
        String currentSongTitle = l_songArtist.getText();
        Song currentSong = SongRepository.getSongByTitle(currentSongTitle);
        if (currentSong == null) {
            return;
        }
        if (SongRepository.getSongIndexPosition(currentSong) == SongRepository.getListSong(Login.user.getId_user()).size() - 1) {
            System.out.println("Musik Ada Di Akhir Playlist");
        } else {
            musicPlayer.pauseSong();
            Song nextSong = SongRepository.getListSong(Login.user.getId_user()).get(SongRepository.getSongIndexPosition(currentSong) + 1);
            musicPlayer.loadSong(nextSong);
            l_songArtist.setText(nextSong.getSongTitle());
        }
    }//GEN-LAST:event_btn_nextSongActionPerformed

    private void btn_playSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_playSongActionPerformed
        String currentSongTitle = l_songArtist.getText();
        Song currentSong = SongRepository.getSongByTitle(currentSongTitle);
        if (currentSong == null) {
            return;
        } else {
            ubahPlayJadiPause();
            musicPlayer.playCurrentSong();
        }
    }//GEN-LAST:event_btn_playSongActionPerformed

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

    private void btn_pomodoroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pomodoroMouseClicked
        ToDoFrame toDoFrame = (ToDoFrame) SwingUtilities.getWindowAncestor(this);
        if (toDoFrame != null) {
            toDoFrame.showPomodoro();
        }
    }//GEN-LAST:event_btn_pomodoroMouseClicked

    private void btn_myTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_myTaskMouseClicked
        ToDoFrame toDoFrame = (ToDoFrame) SwingUtilities.getWindowAncestor(this);
        if (toDoFrame != null) {
            musicPlayer.pauseSong();
            toDoFrame.showMyTask();
        }
    }//GEN-LAST:event_btn_myTaskMouseClicked

    private void btn_navIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_navIconMouseClicked
        ToDoFrame toDoFrame = (ToDoFrame) SwingUtilities.getWindowAncestor(this);
        if (toDoFrame != null) {
            musicPlayer.pauseSong();
            toDoFrame.showPomodoro();
        }
    }//GEN-LAST:event_btn_navIconMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.MyButton btn_addMusic;
    private component.MyButton btn_edit;
    private component.MyLabel btn_logout;
    private component.MyLabel btn_myTask;
    private component.MyLabel btn_navIcon;
    private component.MyButton btn_nextSong;
    private component.MyButton btn_pause;
    private component.MyButton btn_pauseSong;
    private component.MyButton btn_playSong;
    private component.MyLabel btn_pomodoro;
    private component.MyButton btn_prevSong;
    private javax.swing.JLabel btn_profile;
    private component.MyButton btn_reset;
    private component.MyButton btn_start;
    private component.MyLabel l_longBreak;
    private component.MyLabel l_longTimer;
    private component.MyLabel l_mainTimer;
    private component.MyLabel l_session;
    private component.MyLabel l_shortBreak;
    private component.MyLabel l_shortTimer;
    private component.MyLabel l_songArtist;
    private component.MyLabel l_songTitle;
    private component.MyLabel l_title;
    private component.MyLabel l_title2;
    private component.MyLabel myLabel1;
    private component.MyLabel myLabel2;
    private component.MyPanel myPanel1;
    private component.MyPanelCustBorder myPanelCustBorder1;
    private component.MyPanelCustBorder navbar;
    private component.MyPanel p_musicPlayer;
    private component.MyPanel p_songListPanel;
    private component.MyPanel playbackBtns;
    // End of variables declaration//GEN-END:variables
}
