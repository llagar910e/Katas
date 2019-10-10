import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    protected FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void verificationMultipleThree() {
        assertEquals(true, fizzBuzz.isMultipleThree(3));
    }

    @Test
    public void verificationMultipleFive() {
        assertEquals(true, fizzBuzz.isMultipleFive(5));
    }

    @Test
    public void verificationMultipleThreeFive() {
        assertEquals(true, fizzBuzz.isMultipleThreeFive(15));
    }



}