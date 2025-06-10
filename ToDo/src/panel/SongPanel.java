package panel;

import component.MyOptionPane;
import java.awt.Component;
import javax.swing.SwingUtilities;
import objek.MusicPlayer;
import objek.Song;
import repository.SongRepository;
import repository.TaskRepository;

public class SongPanel extends javax.swing.JPanel {
    private int id_musik;
    private int id_user;
    private String judul;
    private String penyanyi;
    private String nama_file;
    
    private Pomodoro pomodoro;
    
    public SongPanel() {
        initComponents();
    }
    
    public SongPanel(String judul, String penyanyi, String nama_file, Pomodoro pomodoro){
        initComponents();
        
        this.pomodoro = pomodoro;
        this.judul = judul;
        this.penyanyi = penyanyi;
        this.nama_file = nama_file;
        
        l_songTitle.setText(judul);
        l_songArtist.setText(penyanyi);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_songPanel = new component.MyPanel();
        btn_deleteSong = new component.MyButton();
        l_songTitle = new component.MyLabel();
        l_songArtist = new component.MyLabel();

        setBackground((new java.awt.Color(255, 255, 255, 190)));
        setPreferredSize(new java.awt.Dimension(250, 80));

        p_songPanel.setBackground(new java.awt.Color(255, 255, 255));
        p_songPanel.setBackgroundColor((new java.awt.Color(255, 255, 255, 190)));
        p_songPanel.setBorderColor(new java.awt.Color(245, 245, 245));
        p_songPanel.setBorderWidth(3);
        p_songPanel.setCornerRadius(30);
        p_songPanel.setPreferredSize(new java.awt.Dimension(320, 80));
        p_songPanel.setLayout(null);

        btn_deleteSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        btn_deleteSong.setBorderColor(new java.awt.Color(204, 0, 0));
        btn_deleteSong.setColorClick(new java.awt.Color(255, 102, 102));
        btn_deleteSong.setColorOver(new java.awt.Color(255, 153, 153));
        btn_deleteSong.setRadius(1000);
        btn_deleteSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteSongActionPerformed(evt);
            }
        });
        p_songPanel.add(btn_deleteSong);
        btn_deleteSong.setBounds(270, 20, 38, 38);

        l_songTitle.setText("Title");
        l_songTitle.setColorClick(new java.awt.Color(0, 0, 153));
        l_songTitle.setColorOver(new java.awt.Color(0, 120, 215));
        l_songTitle.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        l_songTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l_songTitleMouseClicked(evt);
            }
        });
        p_songPanel.add(l_songTitle);
        l_songTitle.setBounds(30, 10, 230, 30);

        l_songArtist.setText("Artist");
        l_songArtist.setColorClick(new java.awt.Color(0, 0, 0));
        l_songArtist.setColorOver(new java.awt.Color(0, 0, 0));
        l_songArtist.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        p_songPanel.add(l_songArtist);
        l_songArtist.setBounds(30, 40, 230, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p_songPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p_songPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_deleteSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteSongActionPerformed
        System.out.println("Menghapus Musik : " + l_songTitle.getText());        
        if (pomodoro.musicPlayer.getCurrentSong() != null && pomodoro.musicPlayer.getCurrentSong().getSongTitle().equals(l_songTitle.getText())) {
            pomodoro.musicPlayer.pauseSong();
            Song firstSong = SongRepository.getListSong(Login.user.getId_user()).get(0);
            MyOptionPane.showConfirm(null, "Yakin ingin menghapus musik?", "Konfirmasi", result -> {
                if (result) {
                    SongRepository.deleteSong(SongRepository.getSongByTitle(l_songTitle.getText()).getId_musik());
                    pomodoro.musicPlayer.loadSong(firstSong);
                    pomodoro.getCurrentSong(firstSong);
                    
                    // MEREFRESH TAMPILAN ALL TASK
                    SwingUtilities.invokeLater(() -> {
                        Component parent = this.getParent(); // THIS MERUJUK KE TASK PANEL
                        while (parent != null && !(parent instanceof SongList)) {
                            parent = parent.getParent();
                        }


                        if (parent instanceof SongList songList) {
                            songList.showSongList();
                        }                                         
                    });
                } else {
                    System.out.println("Batal hapus.");
                }
            });
        } else {
            MyOptionPane.showConfirm(null, "Yakin ingin menghapus musik?", "Konfirmasi", result -> {
                if (result) {
                    SongRepository.deleteSong(SongRepository.getSongByTitle(l_songTitle.getText()).getId_musik());

                    // MEREFRESH TAMPILAN ALL TASK
                    SwingUtilities.invokeLater(() -> {
                        Component parent = this.getParent(); // THIS MERUJUK KE TASK PANEL
                        while (parent != null && !(parent instanceof SongList)) {
                            parent = parent.getParent();
                        }


                        if (parent instanceof SongList songList) {
                            songList.showSongList();
                        }                                         
                    });
                } else {
                    System.out.println("Batal hapus.");
                }
            });
        }
    }//GEN-LAST:event_btn_deleteSongActionPerformed

    private void l_songTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_songTitleMouseClicked
        String judulMusik = l_songTitle.getText();
        if (pomodoro.musicPlayer.getCurrentSong() != null) {
            pomodoro.musicPlayer.pauseSong();            
        } 
        Song selectedSong = SongRepository.getSongByTitle(judulMusik);
        Song song = new Song(
                selectedSong.getId_musik(), 
                selectedSong.getId_user(),
                selectedSong.getSongArtist(),
                selectedSong.getSongTitle(),
                selectedSong.getFilePath()
        );

        pomodoro.musicPlayer.loadSong(song);
        pomodoro.ubahPlayJadiPause();
        pomodoro.getCurrentSong(song);
        
    }//GEN-LAST:event_l_songTitleMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.MyButton btn_deleteSong;
    private component.MyLabel l_songArtist;
    private component.MyLabel l_songTitle;
    private component.MyPanel p_songPanel;
    // End of variables declaration//GEN-END:variables
}
