

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
}



