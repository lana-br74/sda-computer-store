
/**
 * A class Component to represent a component of a computer.
 * 
 * @author (Lana Barikhan) 
 * @version (2017-01-28)
 */
public class Component
{
    // instance variables - replace the example below with your own
    protected String manufacturer;
    protected double cost;

    /**
     * Constructor for objects of class Component 
     * that takes no parameters.
     */
    public Component()
    {
        // initialise instance variables
        this.manufacturer = "unknown";
        this.cost = 0;
    }

    /**
     * Constructor for objects of class Component 
     * that takes parameters.
     * @param manufacturer The manufacturer.
     * @param cost The cost.
     */
    public Component(String manufacturer, double cost)
    {
        // initialise instance variables
        this.manufacturer = manufacturer;
        this.cost = cost;
    }

    /**
     * set the manufacturer
     * @param manufacturer The manufacturer.
     */
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    /**
     * return the manufacturer
     * @return The manufacturer.
     */
    public String getManufacturer(){
        return  this.manufacturer;
    }

    /**
     * set the cost
     * @param cost The cost for the component.
     */
    public void setCost(double cost){
        if(cost >= 0){
            this.cost = cost;
        }else{
            System.out.println("Enter a positive number for the price.");
        }
    }

    /**
     * A method  to return the cost
     * @return  The cost of the component.
     */
    public double getCost(){
        return this.cost;
    }

    /**
     * A method  to return a description of the component's manufacturer and cost 
     * @return A description of the component's manufacturer and cost.
     */
    public String getDescription(){

        String specification = "manufacturer : "+this.manufacturer +
            " cost : "+ this.cost +"$ ";

        return specification;
    }
}
