
/**
 * A class HardDisk to represent a hard disk for Computers. Use getDiscreption() method to get its specification.
 * 
 * @author (Lana Barikhan) 
 * @version (2017-01-25)
 */
public class HardDisk extends Component
{
    // instance variables 
    private String model;
    private double capacity; //GigaBytes

    /**
     * Constructor for objects of class HardDisk
     * that takes no parameters
     */
    public HardDisk()
    {
        super();
        this.model = "unknown";
        this.capacity = 0;

    }

    /**
     * Constructor for objects of class HardDisk
     * that takes parameters
     * @param manufacturer The manufacturer.
     * @param cost The cost.
     */
    public HardDisk(String manufacturer, double cost)
    {
        super(manufacturer,cost);
        this.model = "unknown";
        this.capacity = 0;

    }

    /**
     * Constructor for objects of class HardDisk
     * that takes parameters
     * @param model The model.
     * @param manufacturer The manufacturer.
     * @param capacity The capacity.
     * @param cost The cost.
     */
    public HardDisk(String model, String manufacturer, double capacity, double cost)
    {
        super(manufacturer,cost);
        this.model = model;
        this.capacity = capacity;

    }

    /**
     * set the model.
     * @param model The model.
     */
    public void setModel(String model){
        this.model = model;
    }

    /**
     * return the model.
     * @return The model.
     */
    public String getModel(){
        return this.model;
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
