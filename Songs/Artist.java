import java.util.ArrayList;

public class Artist
{
    protected String name;
    private String recordLabel;
    private ArrayList<Song> songs;
    
    public Artist(String name){
        this.name = name;
        songs = new ArrayList<Song>();
    }
    
    public String getName(){
        return name;
    }
    
    public void addSong(Song song){
        songs.add(song);
    }
    
    public void printSongs(){
        for(Song song : songs){
            song.print();
        }
        
    }
    
    public Song mostRecentSong(){
//        Song mostRecent = new Song("phony");
 //       Song mostRecent = songs.get(0);
        Song mostRecent = null;
        
        for(Song song : songs){
            if(mostRecent == null || song.getYear() > mostRecent.getYear()){
                mostRecent = song;
            }
        }
        return mostRecent;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    public Artist clone(){
        Artist clone = new Artist(this.name);
        clone.recordLabel = this.recordLabel;
        clone.songs = new ArrayList<Song>();
        for(Song song : this.songs){
            clone.songs.add(song.clone());
        }

        return clone;
    }
}
