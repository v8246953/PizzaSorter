/** A class defining a pizza.
 *
 * Based on work created by Mark Truran.
 * SDP class
 */

package v8246953;

public abstract class Pizza
{

    /**
     * The radius of the pizza, in inches.
     */
    protected int radius;
    
    /**
     * The first pizza topping.
     */
    protected String topping1;
    
    /**
     * The second pizza topping.
     */
    protected String topping2;

    /** Initialises a generic pizza object.
     * 
     * @param radius  the radius of the pizza
     * @param topping1 the first topping on the pizza
     * @param topping2 the second topping on the pizza
     */
    public Pizza(int radius, String topping1, String topping2)
    {
        this.radius = radius;
        this.topping1 = topping1;
        this.topping2 = topping2;
    }
    
    /** This method gets the radius of the pizza, in inches.
     * 
     * @return the radius of the pizza, in inches
     */
    public int getRadius()
    {
        return radius;
    }
            
    /**
     * This method returns a textual description of the pizza.
     *
     * @return A textual description of the pizza
     */
    @Override
    public String toString()
    {
        return "A pizza (" + radius + " inches) with " + topping1 + " and " + topping2;
    }
}