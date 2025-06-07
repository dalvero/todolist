package panel;

import objek.Song;
import component.MyScrollPane;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import repository.SongRepository;

public class SongList extends javax.swing.JPanel {
    private Pomodoro pomodoro;
    private JPanel containerPanel;

    public SongList(Pomodoro pomodoro) {
        initComponents();
        this.pomodoro = pomodoro;
        containerPanel = new JPanel();        
        containerPanel.setLayout(new BoxLayout(containerPanel, BoxLayout.Y_AXIS));
        containerPanel.setBackground(new java.awt.Color(255, 255, 255));

        MyScrollPane scrollPane = new MyScrollPane(containerPanel);       
        scrollPane.setBounds(5, 5, 390, 315); // MENGATUR UKURAN DAN POSISI SCROLLPANE
                
        setLayout(null);
        add(scrollPane);        
        showSongList();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(340, 330));
        setLayout(null);
    }// </editor-fold>//GEN-END:initComponents

    public void showSongList(){        
        containerPanel.removeAll();
        for (Song song : SongRepository.getListSong(Login.user.getId_user())) {                        
            SongPanel songPanel = new SongPanel(song.getSongTitle(), song.getSongArtist(), song.getFilePath(), pomodoro);
            songPanel.setAlignmentX(Component.LEFT_ALIGNMENT);            
            songPanel.setBorder(null); // MEMASTIKAN TIDAK ADA PADDING
            songPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, songPanel.getPreferredSize().height));
            containerPanel.add(songPanel);
        }
        containerPanel.revalidate();
        containerPanel.repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
