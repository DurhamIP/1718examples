

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

/**
 * The test class SongTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SongTest
{
    Song song;
    /**
     * Default constructor for test class SongTest
     */
    public SongTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
            song = new Song("Sally Wheatley");
            song.setYear(1763);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void folkGenre()
    {
    
        song.setGenre("folk");
        assertEquals(true, song.isFolk());
    }

    @Test
    public void folkGenreUpper()
    {
 
        song.setGenre("Folk");
        assertEquals(true, song.isFolk());
    }
    
    
    @Test
    public void folkGenreFolkRock()
    {
  
        song.setGenre("Folk rock");
        assertEquals(true, song.isFolk());
    }

    @Test
    public void testSongsList()
    {
        Artist artist1 = new Artist("Pat");
        Song song1 = new Song("Postman");
        artist1.addSong(song1);
    }

    @Test
    public void testMostRecent()
    {
        Song song1 = new Song("A");
        Song song2 = new Song("B");
        song1.setYear(2016);
        song2.setYear(2017);
        Artist artist1 = new Artist("Debs");
        artist1.addSong(song1);
        artist1.addSong(song2);
        assertEquals(song2, artist1.mostRecentSong());
    }

    @Test
    public void printBand()
    {
        Band band1 = new Band("Led Zeppelin");
        Soloist rp = new Soloist("Robert Plant");
        band1.addMember(rp);
        System.out.println(band1);
    }

    @Test
    public void equalsthing()
    {
        Song song1 = new Song("Sally Wheatley");
        song1.setYear(1763);
        assertEquals(true, song1.equals(song));
    }
    
    @Test
    public void sortSort(){
        Song song1 = new Song("Sally Wheatley");
        song1.setYear(1763);
        Song song2 = new Song("Why Worry");
        song2.setYear(1983);
        Song song3 = new Song("Angels");
        song3.setYear(2005);
        List<Song> songs = new ArrayList<>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        System.out.println(songs);
        Collections.sort(songs);
        System.out.println(songs);
        assertEquals(songs.get(0), song1);
        Collections.sort(songs, new NameSongComparator());
        System.out.println(songs);
        assertEquals(songs.get(0), song3);
        
        
    }
}






