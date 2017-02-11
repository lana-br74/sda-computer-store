
/**
 * A class Memory represent a memory for Computers.Use getDiscreption() method to get its specification.
 * 
 * @author (Lana Barikhan) 
 * @version (2017-01-25)
 */
public class Monitor
{
    // instance variables 
    private String model;
    private String manufacturer;
    private double size; //inch
    private double cost;//$

    /**
     * Constructor for objects of class Monitor
     * that takes no parameters
     */
    public Monitor()
    {
        // initialise instance variables
        this.model = "unknown";
        this.manufacturer = "unknown";
        this.size = 0;
        this.cost = 0;

    }

    /**
     * Constructor for objects of class Monitor
     * that takes parameters
     */
    public Monitor(double size, double cost)
    {
        // initialise instance variables
        this.model = "unknown";
        this.manufacturer = "unknown";
        this.size = size;
        this.cost = cost;

    }

    /**
     * Constructor for objects of class Monitor
     * that takes parameters
     */
    public Monitor(String model, String manufacturer, double size, double cost)
    {
        // initialise instance variables
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.cost = cost;

    }

    /** set the model
     * @param model The model.
     */
    public void setModel(String model){
        this.model = model;
    }

    /** get the model
     * @return The model.
     */
    public String getModel(){
        return this.model;
    }

    /**
     * set the manufacturer
     * @param manufacturer The manufacturer.
     */
    public void setManufacturer(String model){
        this.manufacturer = manufacturer;
    }

    /**
     * retutrn the manufacturer
     * @return  The manufacturer.
     */
    public String getManufacturer(){
        return this.manufacturer;
    }

    /**
     * set the size
     * @param size The size
     */
    public void setSize(double size){
        this.size = size;
    }

    /**
     * return the size
     * @return The size.
     */
    public double getSize(){
        return this.size;
    }

    /**
     * set the cost
     * @param cost The cost
     */
    public void setCost(double cost){
        this.cost = cost;
    }

    /**
     * A method  to return the cost of the monitor
     * @return  The cost of the monitor
     */
    public double getCost(){
        return this.cost;
    }

    /**
     * A method  to return  a description for specificattions of the monitor
     * @return  A description for the specificattions of the monitor
     */
    public String getDescription(){
        String specification = "Monitor   :" +
            " model : "+ this.model+
            " manufacturer : " + this.manufacturer+"  "+   
            " size : "+ this.size +" inch";
        System.out.println(specification);
        return specification;
    }

}
