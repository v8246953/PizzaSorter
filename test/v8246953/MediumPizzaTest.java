/*
 *  
 */
package v8246953;

import v8246953.MediumPizza;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Leo
 */
public class MediumPizzaTest {    
    /**
     * Testing the toString method.
     */
    @Test
    public void testToString()
    {
        System.out.println("Check toString output in SmallPizza");
        String expectedResult, actualResult;
        final MediumPizza mp = new MediumPizza(9, "cheese", "tomato","cheese");
        expectedResult = "A pizza (9 inches) with cheese and tomato and a cheese crust";
        actualResult = mp.toString();
        System.out.println("Expected result: \n" + expectedResult);
        System.out.println("Actual result: \n" + actualResult);
        assertEquals(expectedResult, actualResult);
    }
}

