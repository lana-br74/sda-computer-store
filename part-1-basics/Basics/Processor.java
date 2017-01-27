
/**
 * Write a description of class Processor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Processor
{
    // instance variables - replace the example below with your own
    private String manufacturer;
    private String model;
    private int clockSpeed; //GHZ
    private String cache;
  //  private String internalMemory;
   // private String busSpeed;
    private double cost;

    /**
     * Constructor for objects of class Processor
     */
    public Processor(){
        this.manufacturer = "unknown";
        this.model = "unknown";
        this.clockSpeed = 0;
        this.cost = 0.0;
        this.cache = "unknown";
    }
    
    public Processor( String manufacturer,String model)
    {
        // initialise instance variables
        this.manufacturer = manufacturer;
        this.model = model;
        this.clockSpeed = 0;
        this.cost = 0.0;
        this.cache = "unknown";
        
    }
    public Processor( String manufacturer, String model , int speed, double cost)
    {
        // initialise instance variables
        this.manufacturer = manufacturer;
        this.model = model;
        this.clockSpeed = speed;
        this.cost = cost;
        this.cache = "unknown";
        
    }
    
    public Processor( String manufacturer, String model , int speed, double cost,  String cache)
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
    
    public void setClockSpeed(int clocdSpeed){
        this.clockSpeed = clockSpeed;
    }
    
    public int getClockSpeed(){
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
    
    public String toString(){
        
        String specification = "processor : "+this.manufacturer +
         "  "+ this.model+ 
         " clock speed : "+ this.clockSpeed +
         " cache :"+ this.cache;
         
         return specification;
    }

     /**
     * A method  to return the cost of the processor
     * 
     * @param  y   a sample parameter for a method
     * @return  double the cost of the processor
     */
   
}
