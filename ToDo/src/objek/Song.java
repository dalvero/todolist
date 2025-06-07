package objek;

import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;

import java.io.File;
import java.io.IOException;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.KeyNotFoundException;
import org.jaudiotagger.tag.TagException;

// class used to describe a song
public class Song {
    // ATRIBUT FROM DATABASE
    private int id_musik;
    private int id_user;    
    
    private String songTitle;
    private String songArtist;
    private String songLength;
    private String filePath;
    private Mp3File mp3File;
    private double frameRatePerMilliseconds;   
    
    public Song(int id_musik, int id_user, String penyanyi, String judul, String nama_file){
        this.id_musik = id_musik;
        this.id_user = id_user;
        this.songArtist = penyanyi;
        this.songTitle = judul;
        this.filePath = nama_file;
    }
    
    public Song(String filePath){                
        this.filePath = filePath;
        try{
            mp3File = new Mp3File(filePath);
            frameRatePerMilliseconds = (double) mp3File.getFrameCount() / mp3File.getLengthInMilliseconds();
            songLength = convertToSongLengthFormat();

            AudioFile audioFile = AudioFileIO.read(new File(filePath));

            Tag tag =  audioFile.getTag();
            if(tag != null){
                songTitle = tag.getFirst(FieldKey.TITLE);
                songArtist = tag.getFirst(FieldKey.ARTIST);
            }else{

                songTitle = "N/A";
                songArtist = "N/A";
            }
        }catch(InvalidDataException | UnsupportedTagException | IOException | CannotReadException | InvalidAudioFrameException | ReadOnlyFileException | KeyNotFoundException | TagException e){
        }
    }        
    
    private String convertToSongLengthFormat(){
        long minutes = mp3File.getLengthInSeconds() / 60;
        long seconds = mp3File.getLengthInSeconds() % 60;
        String formattedTime = String.format("%02d:%02d", minutes, seconds);

        return formattedTime;
    }

    // SETTER GETTER
    public String getSongTitle() {
        return songTitle;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public String getSongLength() {
        return songLength;
    }

    public String getFilePath() {
        return filePath;
    }

    public int getId_musik() {
        return id_musik;
    }

    public void setId_musik(int id_musik) {
        this.id_musik = id_musik;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
               
    public Mp3File getMp3File(){return mp3File;}
    public double getFrameRatePerMilliseconds(){return frameRatePerMilliseconds;}
    
    
}















