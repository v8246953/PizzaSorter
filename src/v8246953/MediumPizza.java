/*
 *  
 */
package v8246953;

/**
 *
 * @author Leo
 */
public class MediumPizza extends Pizza{
    
    private final String crust;
    
    public MediumPizza(int radius, String topping1, String topping2, String crust) {
        super(radius, topping1, topping2);
        this.crust = crust;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " and a " + crust + " crust";
    }
    
}
