/*
 *  
 */
package v8246953;

import v8246953.LargePizza;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Leo
 */
public class LargePizzaTest {    
    /**
     * Testing the toString method.
     */
    @Test
    public void testToString()
    {
        System.out.println("Check toString output in SmallPizza");
        String expectedResult, actualResult;
        final LargePizza lp = new LargePizza(9, "cheese", "tomato","cheese","deep-pan");
        expectedResult = "A pizza (9 inches) with cheese and tomato and a cheese crust, deep-pan";
        actualResult = lp.toString();
        System.out.println("Expected result: \n" + expectedResult);
        System.out.println("Actual result: \n" + actualResult);
        assertEquals(expectedResult, actualResult);
    }
}

