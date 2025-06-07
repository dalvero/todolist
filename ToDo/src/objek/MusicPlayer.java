package objek;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackEvent;
import javazoom.jl.player.advanced.PlaybackListener;

public class MusicPlayer extends PlaybackListener{
    private static final Object playSignal = new Object();
    
    // MENYIAPKAN OBJEK SONG/MUSIK
    private Song currentSong;
    
    // MENGGUNAKAN JLayer LIBRARY UNTUK MEMBUAT AdvancedPLayer YANG AKAN MENGHANDLE MUSIC
    private AdvancedPlayer advancedPlayer;
    
    private boolean isPaused;
    
    // KONSTRUKTOR
    public MusicPlayer(){
        
    }
    
    public Song getCurrentSong(){
        return this.currentSong;
    }
    
    public void loadSong(Song song){
        currentSong = song;
        
        //JIKA SONG TIDAK NULL/KITA BISA LANGSUNG PUTAR
        if (currentSong != null) {
            System.out.println(isPaused);
            playCurrentSong();
        }
        
    }
    
    public void pauseSong(){
        if (advancedPlayer != null) {
            isPaused = true;            
            stopSong();            
        }
    }
    
    public void stopSong(){
        if (advancedPlayer != null) {
            advancedPlayer.stop();
            advancedPlayer.close();
            advancedPlayer = null;
        }
    }
    
    public void playCurrentSong(){
        try {
            // MEMBACA MUSIC.mp3            
            FileInputStream fileInputStream = new FileInputStream(currentSong.getFilePath());
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            
            // MEMBUAT AdvancedPlayer BARU;
            advancedPlayer = new AdvancedPlayer(bufferedInputStream);
            advancedPlayer.setPlayBackListener(this);
            
            // MAINKAN MUSIK
            startMusicThread();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // MEMBUAT THREAD YANG AKAN MENGATUR JALANNYA MUSIK
    public void startMusicThread(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    advancedPlayer.play();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    @Override
    public void playbackFinished(PlaybackEvent evt) {
        // DIPANGGIL KETIKA MUSIK BERAKHIR
        System.out.println("Musik Berakhir");   
    }

    @Override
    public void playbackStarted(PlaybackEvent evt) {
        // DIPANGGIL KETIKA MUSIK PERTAMA KALI DIMULAI
        System.out.println("Musik Dimulai");
        
    }
    
    
}