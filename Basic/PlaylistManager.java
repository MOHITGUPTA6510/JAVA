import java.util.ArrayList;
class Song{
    String title;
    String artist;
    
    public Song (String title , String artist){
        this.title = title;
        this.artist = artist;
    }
    
    void displaySong(){
        System.out.println("title: "+title);
        System.out.println("artist: "+artist);
    }
}

public class PlaylistManager{
    public static void main(String[] args){
        ArrayList<Song> name = new ArrayList<>();
        
        name.add(new Song("Chaiya Chaiya","A.R Rahman"));
        name.add(new Song("song A","artist A"));
        name.add(new Song("song B","artist B"));
        
        for()
    }
}