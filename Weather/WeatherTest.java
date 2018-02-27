

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class WeatherTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class WeatherTest
{
    /**
     * Default constructor for test class WeatherTest
     */
    public WeatherTest()
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
    public void obesrvationFromText()
    {
        Observation observat1 = Observation.fromHistoryLine("   1998  11    8.3     1.7       6    64.9    76.1");
        assertEquals(6, observat1.getAirfrost());
        assertEquals(1998, observat1.getYear());
        assertEquals(11, observat1.getMonth());
    }

    @Test
    public void stationFromWebAirFrost () throws Exception
    {
        Station durham = new Station("Durham");
        durham.loadObservations();
        assertEquals(44, durham.totalafYear(1884));
        
    }
}


