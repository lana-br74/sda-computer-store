
/**
 * A class HardDisk to represent a hard disk for Computers. Use getDiscreption() method to get its specification.
 * 
 * @author (Lana Barikhan) 
 * @version (2017-01-25)
 */
public class HardDisk
{
    //instance variables
    private String model;
    private String manufacturer;
    private double capacity; //GigaBytes
    private double cost;//$

    /**
     * Constructor for objects of class HardDisk
     * that takes no parameters
     */
    public HardDisk()
    {
        // initialise instance variables
        this.model = "unknown";
        this.manufacturer = "unknown";
        this.capacity = 0;
        this.cost = 0;

    }

    /**
     * Constructor for objects of class HardDisk
     * that takes parameters
     */

    public HardDisk(double capacity, double cost)
    {
        // initialise instance variables
        this.model = "unknown";
        this.manufacturer = "unknown";
        this.capacity = capacity;
        this.cost = cost;

    }

    /**
     * Constructor for objects of class HardDisk
     * that takes parameters.
     */
    public HardDisk(String model, String manufacturer, double capacity, double cost)
    {
        // initialise instance variables
        this.model = model;
        this.manufacturer = manufacturer;
        this.capacity = capacity;
        this.cost = cost;

    }

    /**
     * set The model.
     * @param model The model.
     */
    public void setModel(String model){
        this.model = model;
    }

    /**
     * return The model.
     * @return The model.
     */
    public String getModel(){
        return this.model;
    }

    /** set the manufacturer for the hard disk
     * @param manufacturer The manufacturer of the hard disk.
     */
    public void setManufacturer(String model){
        this.manufacturer = manufacturer;
    }

    /**
     * return the manufacturer of the hard disk.
     * @return The manufacturer.
     */
    public String getManufacturer(){
        return this.manufacturer;
    }

    /**
     * set The capacity.
     * @param size The capacity.
     */
    public void setCapacity(double size){
        this.capacity = capacity;
    }

    /**
     * return The capacity.
     * @return The capacity.
     */
    public double getCapacity(){
        return this.capacity;
    }

    /**
     * set the cost for the hard disk
     * @param cost The cost.
     */
    public void setCost(double cost){
        this.cost = cost;
    }

    /**return the cost of the hard disk
     * 
     * @return  The cost of the hard disk
     */

    public double getCost(){
        return this.cost;
    }

    /**
     * A method  to return a descreption for the hard disk's specifications.
     * 
     * @return  A description for the specifications of the hard disk
     */

    public String getDescription(){
        String specification = "Hard disk :" +
            " model : " + this.model +
            " manufacturer : " + this.manufacturer +
            " capacity : " + this.capacity + " Gb";

        return specification;
    }

}
