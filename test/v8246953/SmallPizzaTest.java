/** A set of test cases to check the output of the SmallPizza class.
 *
 * Based on work created by Mark Truran.
 * SDP class
 */

package v8246953;

import v8246953.SmallPizza;
import static org.junit.Assert.*;
import org.junit.Test;

public class SmallPizzaTest
{    
    /**
     * Testing the toString method.
     */
    @Test
    public void testToString()
    {
        System.out.println("Check toString output in SmallPizza");
        String expectedResult, actualResult;
        final SmallPizza sp = new SmallPizza(9, "cheese", "tomato");
        expectedResult = "A pizza (9 inches) with cheese and tomato";
        actualResult = sp.toString();
        System.out.println(expectedResult);
        System.out.println(actualResult);
        assertEquals(expectedResult, actualResult);
    }
}
