/** A set of test cases to check the output of the PizzaSorter class.
 *
 * Based on work created by Mark Truran.
 * SDP class
 */

package v8246953;

import v8246953.PizzaSorter;
import v8246953.Pizza;
import java.io.File;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

public class PizzaSorterTest
{
    /**
     * The radius, in inches, of a small pizza.
     */
    final static int SMALL = 9;
    
    /**
     * The radius, in inches, of a medium pizza.
     */
    final static int MEDIUM = 12;
    
    /**
     * The radius, in inches, of a large pizza.
     */
    final static int LARGE = 15;

    /**
     * Testing the parse method with a valid file.
     */
    
    @Test
    public void testParseValidFile()
    {
        System.out.println("Parsing valid file");
        final PizzaSorter ps = new PizzaSorter();
        final ArrayList<Pizza> listOfPizzas = ps.parseFile(new File("pizza.txt"));
        final int expectedResult = 9;
        final int actualResult = listOfPizzas.size();
        assertEquals(expectedResult, actualResult);
    }
    
    /**
     * Testing the parse method with a invalid file.
     */
    
    @Test
    public void testParseInvalidFileName()
    {
        System.out.println("Parsing non-existent file");
        final PizzaSorter ps = new PizzaSorter();
        final ArrayList<Pizza> listOfPizzas = ps.parseFile(new File("non-existent.txt"));
        assertNull(listOfPizzas);
    }
    
    /**
     * Testing the parse method with a valid file containing invalid data.
     */
    
    @Test
    public void testParseInvalidData()
    {
        System.out.println("Parsing file with invalid data");
        final PizzaSorter ps = new PizzaSorter();
        final ArrayList<Pizza> listOfPizzas = ps.parseFile(new File("wrong-num.txt"));
        assertNull(listOfPizzas);
    }

    /**
     * Testing  the listAllPizzas method.
     */
    
    @Test
    public void testListAllPizzas()
    {
        System.out.println("Listing all pizzas");
        String actualResult, expectedResult;
        final PizzaSorter ps = new PizzaSorter();
        actualResult = ps.listAllPizzas("pizza.txt");
        expectedResult = "A pizza (9 inches) with cheese and tomato\nA pizza "
                + "(12 inches) with chicken and mushroom and a cheese crust\nA "
                + "pizza (15 inches) with sausage and bacon and a cheese "
                + "crust, deep-pan\nA pizza (12 inches) with ham and tomato "
                + "and a spicy crust\nA pizza (9 inches) with ham and mushroom\nA "
                + "pizza (12 inches) with sweetcorn and peppers and a cheese "
                + "crust\nA pizza (15 inches) with tuna and sweetcorn and a "
                + "spicy crust, thin-pan\nA pizza (9 inches) with banana "
                + "and pineapple\nA pizza (12 inches) with ham and pineapple "
                + "and a cheese crust\n";
        System.out.println("\n\nEXPECTED \n" + expectedResult);
        System.out.println("ACTUAL \n" + actualResult);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Testing the filterPizzas method, radius 9.
     */
    
    @Test
    public void testFilterPizzas9()
    {    
        System.out.println("Listing all pizzas with radius 9in.");
        String actualResult, expectedResult;
        final PizzaSorter ps = new PizzaSorter();
        expectedResult = "A pizza (9 inches) with cheese and tomato\n"
                + "A pizza (9 inches) with ham and mushroom\nA pizza "
                + "(9 inches) with banana and pineapple\n";
        actualResult = ps.filterPizzas("pizza.txt", SMALL);
        //System.out.println(expectedResult);
        //System.out.println(actualResult);
        assertEquals(actualResult, expectedResult);
    }
    
    /**
     * Testing the filterPizzas method, radius 12.
     */
    
    @Test
    public void testFilterPizzas12()
    {    
        System.out.println("Listing all pizzas with radius 12in.");
        String actualResult, expectedResult;
        final PizzaSorter ps = new PizzaSorter();
        expectedResult = "A pizza (12 inches) with chicken and mushroom and a cheese crust\nA "
                + "pizza (12 inches) with ham and tomato and a spicy crust\nA "
                + "pizza (12 inches) with sweetcorn and peppers and a cheese crust\nA "
                + "pizza (12 inches) with ham and pineapple and a cheese crust\n";
        actualResult = ps.filterPizzas("pizza.txt", MEDIUM);
        //System.out.println(expectedResult);
        //System.out.println(actualResult);
        assertEquals(actualResult, expectedResult);
    }
    
    /**
     * Testing the filterPizzas method, radius 15.
     */
    
    @Test
    public void testFilterPizzas15()
    {    
        System.out.println("Listing all pizzas with radius 15in.");
        String actualResult, expectedResult;
        final PizzaSorter ps = new PizzaSorter();
        expectedResult = "A pizza (15 inches) with sausage and bacon and a "
                + "cheese crust, deep-pan\nA pizza (15 inches) with "
                + "tuna and sweetcorn and a spicy crust, thin-pan\n";
        actualResult = ps.filterPizzas("pizza.txt", LARGE);
        //System.out.println(expectedResult);
        //System.out.println(actualResult);
        assertEquals(actualResult, expectedResult);
    }
}
