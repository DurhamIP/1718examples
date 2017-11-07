

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestPerson.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestPerson
{
    /**
     * Default constructor for test class TestPerson
     */
    public TestPerson()
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
    public void testGrandmother()
    {
        Person person1 = new Person("Elizabeth");
        Person di = new Person("Diana");
        Person charles = new Person("Charles");
        Person phil = new Person("Philip");
        charles.setFather(phil);
        charles.setMother(person1);
        charles.getMother();
        charles.getMaternalGrandmother();
        person1.getMaternalGrandmother();
    }
}

