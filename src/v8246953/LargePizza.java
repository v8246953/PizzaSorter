/*
 *  
 */
package v8246953;

/**
 *
 * @author Leo
 */
public class LargePizza extends Pizza{
    
    private final String crust;
    private final String thickness;
    
    public LargePizza(int radius, String topping1, String topping2, String crust, String thickness) {
        super(radius, topping1, topping2);
        this.crust = crust;
        this.thickness = thickness;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+ " and a " + crust + " crust, " + thickness;
    }
    
}
