
/**
 * A class Processor to represent the hard disk, methods to set and get the its fields,
 * its cost and its specification.
 * 
 * @author (Lana Barikhan) 
 * @version (2017-01-25)
 */
public class Processor extends Component
{
    // instance variables 

    private String model;
    private double clockSpeed; //GHZ
    private String cache;//MB

    /**
     * Constructor for objects of class Processor
     * that takes no parmeter.
     */
    public Processor()
    {
        super();
        this.model = "unknown";
        this.clockSpeed = 0;
        this.cache = "unknown";

    }

    /**
     * Constructor for objects of class Processor
     * @param manufacturer The manufacturer.
     * @param cost The cost.
     */
    public Processor( String manufacturer, double cost)
    {
        super(manufacturer,cost);
        this.model = "unknown";
        this.clockSpeed = 0;
        this.cache = "unknown";

    }

    /**
     * Constructor for objects of class Processor
     * takes parameters
     * @param model The model.
     * @param manufacturer The manufacturer.
     * @param speed The speed.
     * @param cost The cost.
     */
    public Processor(String model ,String manufacturer, double speed, double cost)
    {
        super(manufacturer,cost);
        this.model = model;
        this.clockSpeed = speed;
        this.cache = "unknown";

    }

    /**
     * Constructor for objects of class Processor
     * takes parameters
     * @param model The model.
     * @param manufacturer The manufacturer.
     * @param capacity The capacity.
     * @param cost The cost.
     */
    public Processor( String model ,String manufacturer, double speed, double cost,  String cache)
    {
        super(manufacturer,cost);
        this.model = model;
        this.clockSpeed = speed;
        this.cache = cache;

    }

    /**
     * set The model.
     * @prameter model The model.
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

    /**
     * set the clock speed.
     * @parameter clockSpeed The clock speed.
     */
    public void setClockSpeed(double clocdSpeed){
        this.clockSpeed = clockSpeed;
    }

    /**
     * return The clock speed.
     * @return The clock speed.
     */
    public double getClockSpeed(){
        return this.clockSpeed;
    }

    /**
     * set the clock speed.
     * @parameter cache The clock speed.
     */
    public void setCache(String cache){
        this.cache = cache;
    }

    /**
     * return The cache.
     * @return The cache.
     */
    public String getCache(){
        return this.cache;
    }

    /** A method to return a description for the specifications of the processor
     * @return A description for the specifications of the processor.
     */
    public String getDescription(){

        String specification = "Processor :"+ 
            " model : "+ this.model +
            " manufacturer : "+ this.manufacturer +
            " clock speed : "+ this.clockSpeed +"HZ "+
            " cache :"+ this.cache +" Mb";

        return specification;
    }
}
