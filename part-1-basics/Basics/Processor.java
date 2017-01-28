
/**
 * A description of class Processor .
 * 
 * @author (Lana Barikhan) 
 * @version (2017-01-25)
 */
public class Processor
{
    // instance variables 
    private String manufacturer;
    private String model;
    private double clockSpeed; //GHZ
    private String cache;//MB
  //  private String internalMemory;
   // private String busSpeed;
    private double cost;//$

    /**
     * Constructor for objects of class Processor
     */
    public Processor(){
        this.manufacturer = "AMD";
        this.model = "A8-7670K";
        this.clockSpeed = 3.6;
        this.cost = 100;
        this.cache = "4";
    }
    
    public Processor( String manufacturer,String model)
    {
        // initialise instance variables
        this.manufacturer = manufacturer;
        this.model = model;
        this.clockSpeed = 2;
        this.cost = 100;
        this.cache = "unknown";
        
    }
    public Processor( String manufacturer, String model , double speed, double cost)
    {
        // initialise instance variables
        this.manufacturer = manufacturer;
        this.model = model;
        this.clockSpeed = speed;
        this.cost = cost;
        this.cache = "unknown";
        
    }
    
    public Processor( String manufacturer, String model , double speed, double cost,  String cache)
    {
        // initialise instance variables
        this.manufacturer = manufacturer;
        this.model = model;
        this.clockSpeed = speed;
        this.cost = cost;
        this.cache = cache;
        
    }
    
    
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    
    public String getManufacturer(){
     return this.model;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    public String getModel(){
     return this.manufacturer;
    }
    
    public void setClockSpeed(double clocdSpeed){
        this.clockSpeed = clockSpeed;
    }
    
    public double getClockSpeed(){
        return this.clockSpeed;
    }
    
     public void setCost(double cost){
        this.cost = cost;
    }
     
    public double getCost(){
        return this.cost;
    }
    
    public void setCache(String csche){
        this.cache = cache;
    }
    
    public String getCache(){
        return this.cache;
    }
    
     /**
     * A method  to return the cost of the processor
     * 
     * @param  y   a sample parameter for a method
     * @return  double the cost of the processor
     */
    public String toString(){
        
        String specification = "processor : "+this.manufacturer +
                               "  "+ this.model+ 
                               " clock speed : "+ this.clockSpeed +"HZ "+
                               " cache :"+ this.cache +" Mb";
         
         return specification;
    }

}
