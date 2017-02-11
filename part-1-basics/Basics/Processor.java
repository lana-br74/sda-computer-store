
/**
 * A class Processor to represent a processor for Computers .Use getDiscreption() method to get its specifications.
 * 
 * @author (Lana Barikhan) 
 * @version (2017-01-25)
 */
public class Processor
{
    // instance variables
    private String model;
    private String manufacturer;
    private double clockSpeed; //GHZ
    private double cache;//MB
    private double cost;//$

    /**
     * Constructor for objects of class Processor
     * that takes no parameters
     */
    public Processor(){
        this.manufacturer = "unkmown";
        this.model = "unknown";
        this.clockSpeed = 0;
        this.cost = 0;
        this.cache = 0;
    }

    /**
     * Constructor for objects of class Processor
     * that takes parameters
     */
    public Processor( String manufacturer,String model)
    {
        // initialise instance variables
        this.manufacturer = manufacturer;
        this.model = model;
        this.clockSpeed = 0;
        this.cost = 0;
        this.cache = 0;

    }

    /**
     * Constructor for objects of class Processor
     * that takes parameters
     */
    public Processor( String manufacturer, String model , double speed, double cost)
    {
        // initialise instance variables
        this.manufacturer = manufacturer;
        this.model = model;
        this.clockSpeed = speed;
        this.cost = cost;
        this.cache = 0;

    }

    /**
     * Constructor for objects of class Processor
     * that takes parameters
     */
    public Processor( String manufacturer, String model , double speed, double cost,  double cache)
    {
        // initialise instance variables
        this.manufacturer = manufacturer;
        this.model = model;
        this.clockSpeed = speed;
        this.cost = cost;
        this.cache = cache;

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
        return this.model;
    }

    /**
     * set the model
     * @param model The moodel.
     */
    public void setModel(String model){
        this.model = model;
    }

    /**
     * return the model
     * @return The model.
     */
    public String getModel(){
        return this.manufacturer;
    }

    /**
     * set the clock speed
     * @param clockSpeed The clock speed.
     */
    public void setClockSpeed(double clocdSpeed){
        this.clockSpeed = clockSpeed;
    }

    /**
     * return the clock speed
     * @return The clock speed.
     */
    public double getClockSpeed(){
        return this.clockSpeed;
    }

    /**
     * set the cost
     * @param cost The cost
     */
    public void setCost(double cost){
        this.cost = cost;
    }

    /**
     * A method  to return the cost of the processor
     * @return  The cost of the processor
     */
    public double getCost(){
        return this.cost;
    }

    /**
     * set the cache
     * @param cache The cache .
     */
    public void setCache(String csche){
        this.cache = cache;
    }

    /**
     * return the cache of the processou
     * @return The cache.
     */
    public double getCache(){
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
        System.out.println(specification);

        return specification;
    }

}
