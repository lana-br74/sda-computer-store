import java.util.HashMap;
import java.util.Iterator;
/**
 * A class Computer to represent a computer ,
 *  it contains of a list of components ,and it gives a summmary about its components and its total price;
 * 
 * @author (Lana Barikhan) 
 * @version (2017-01-26)
 */
public class Computer
{
   private String serialNumber;
   private HashMap<String ,Component> components;

    /**
     * Constructor for objects of class Computer
     * takes no parameter
     */
    public Computer()
    {
       serialNumber = "unknown";
       components = new HashMap<>();
        
    }
    
     /**
     * Constructor for objects of class Computer
     * that takes parameter
     * @param serialNumber The serialNumber of the computer.
     */
    public Computer(String serialNumber)
    {
       this.serialNumber = serialNumber;
       components = new HashMap<>();
        
    }
    
     /**
     * Constructor for objects of class Computer
     * that takes parameters
     * @param serialNumber The serialNumber of the computer.
     * @param newComponents The list of components to be added.
     */
    public Computer(HashMap<String,Component> newComponents )
    {
       serialNumber = "unknown";
       this.components = newComponents;
        
    }
    
    
    /** 
     * set the serial number
     * @param serialNumber The serial number.
     */
    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }
    
    /**
     * return the serial number
     * @return The serial number.
     */
    public String getSerialNumber(){
        return this.serialNumber;
    }
    
    /**A method to add a component to the compute
     * @param name The name of the component
     * @param component The component object to be added.
     */
    public boolean addComponent(String name, Component component){
        if(component != null){
            components.put(name,component);
            return true;
        }
        System.out.println("No componentt was added.");
        return false;
    }
    
    /** A method to remove a component from a computer
     * @param name The name of the component to be removed from the computer.
     */
    public boolean removeComponent(String name){
        boolean found = false;
        Iterator<String> iter = components.keySet().iterator();
        while(!found && iter.hasNext()){
            String key = iter.next();
            if (key.equals(name)){
                components.remove(key);
                return true;
            }
        }
        System.out.println("No componentt has such name.");
        return false;
    }
    
    
     /**
     * A method  to return the cost of the computers,
     * it calculates the cost by adding the costs of all its components.
     * @return  The total cost of the computer
     */
    public double getTotalCost(){
        double totalCost = 0;
       for(Component component:components.values()){
           totalCost += component.getCost();
        }
        return totalCost;
    }
    
    /**
     * A method to print a summary of the Computer components and print its toral cost
     * 
     */
    public void printComputerSummmary()
    {
       String description ="computer serial number :" + this.serialNumber + "\n";
       for(Component component:components.values( )){
        //print the total cost
        description += component.getDescription() + "\n";
        
    }
        description += "total cost :"+ this.getTotalCost()+" $";
        
        System.out.println(description);
       
    }
}
