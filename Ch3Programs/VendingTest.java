

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingTest
{
    /** description of instance variable x (add comment for each instance variable) */

    /**
     * Default constructor for objects of class VendingTest
     */
    public VendingTest()
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
    public void testFillUp()
    {
      VendingMachine v = new VendingMachine(0,50);
      v.fillUp(50);
    }

    @Test
    public void testInsertToken()
    {
      VendingMachine v = new VendingMachine(0,50);
      v.insertToken();
    }

}
