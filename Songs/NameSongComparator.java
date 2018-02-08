import java.util.*;

public class NameSongComparator implements Comparator<Song>
{
    public int compare(Song song1, Song song2){
        return song1.getName().compareTo(song2.getName());
    }
}
