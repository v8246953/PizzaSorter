/** A class to sort pizzas by their radius.
 *
 * Based on work created by Mark Truran.
 * SDP class
 */

package v8246953;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PizzaSorter
{

    /**
     * This method parses the named data file and creates pizza objects.
     *
     * @param file the file containing the data
     * @return an array list of pizza objects
     */
    public ArrayList<Pizza> parseFile(File file)
    {   
        ArrayList<Pizza> list = new ArrayList();
        try {
            Scanner scan = new Scanner(file);
        
        
        Boolean next = true;
        
        while(next == true){
            
            if(!scan.hasNextInt()){
                return null;
            }
            int size = scan.nextInt();
            
            switch (size) {
                case 9: {
                        String top1 = scan.next();
                        String top2 = scan.next();
                        SmallPizza sp = new SmallPizza(size, top1, top2);
                        list.add(sp);
                        
                        break;
                    }
                case 12: {
                        String top1 = scan.next();
                        String top2 = scan.next();
                        String crust = scan.next();
                        MediumPizza mp = new MediumPizza(size, top1, top2, crust);
                        list.add(mp);
                        
                        break;
                    }
                case 15: {
                        String top1 = scan.next();
                        String top2 = scan.next();
                        String crust = scan.next();
                        String thick = scan.next();
                        LargePizza lp = new LargePizza(size, top1, top2, crust, thick);
                        list.add(lp);
                        
                        break;
                    }
                default:
                    return null;
            }
            
            if(scan.hasNextInt()){
                scan.nextLine();
                next = true;
            }else{
                next = false;
            }
        }
            
        
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PizzaSorter.class.getName()).log(Level.SEVERE, null, ex);
            return null;            
        } 
        
        return list;
    }

    /**
     * This method returns a list of all the pizzas in the named data file.
     *
     * @param fileName The name of the file containing the data
     * @return A list of pizzas
     */
    public String listAllPizzas(final String fileName)
    {
        ArrayList<Pizza> arraydList = parseFile(new File(fileName));
        String list = "";
        
        for(int i = 0; i < arraydList.size(); i ++){
            list = list + arraydList.get(i).toString() + "\n";
        }
        return list;
    }

    /**
     * This method returns a list of all the pizzas of a given size.
     *
     * @param fileName The name of the file containing the data
     * @param radius the radius of the pizza
     * @return A list of pizzas
     */
    public String filterPizzas(final String fileName, int radius)
    {
        ArrayList<Pizza> arraydList = parseFile(new File(fileName));
        String list = "";
        
        for(int i = 0; i < arraydList.size(); i ++){
            if(radius == 9 && arraydList.get(i).radius == 9){
                list = list + arraydList.get(i).toString() + "\n";
            } else if(radius == 12 && arraydList.get(i).radius == 12){
                list = list + arraydList.get(i).toString() + "\n";
            }else if(radius == 15 && arraydList.get(i).radius == 15){
                list = list + arraydList.get(i).toString() + "\n";
            }
            
            
        }
        return list;
    }
}