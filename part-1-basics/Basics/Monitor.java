
/**
 * Write a description of class Memory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monitor
{
    // instance variables 
    private String model;
    private String manufacturer;
    private double size; // GigaByte
    private double cost;

    /**
     * Constructor for objects of class Memory
     */
    public Monitor()
    {
        // initialise instance variables
        this.model = "unknown";
        this.manufacturer = "unknown";
        this.size = 100;
        this.cost = 0;
        
    }
    
     public Monitor(double size, double cost)
    {
        // initialise instance variables
        this.model = "unknown";
        this.manufacturer = "unknown";
        this.size = size;
        this.cost = cost;
        
    }
    
     public Monitor(String model, String manufacturer, double size, double cost)
    {
        // initialise instance variables
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.cost = cost;
        
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    public String getModel(){
    return this.model;
    }
    
     public void setManufacturer(String model){
        this.manufacturer = manufacturer;
    }
    
    public String getManufacturer(){
    return this.manufacturer;
    }
    
    
    public void setSize(double size){
        this.size = size;
    }
    
    public double getSize(){
        return this.size;
    }
    
    public void setCost(double cost){
        this.cost = cost;
    }
     
    public double getCost(){
        return this.cost;
    }
    
    public String toString(){
        String specification = "Monitor :"+
        this.model+
        "  "+ this.manufacturer+"  "+   
        "size :"+
        this.size;
        
        return specification;
    }

    /**
     * A method  to return the cost of the memory
     * 
     * @param  y   a sample parameter for a method
     * @return  double the cost of the memory
     */
    
    
    /**
     * 
     * 
     * 
     * 
ntel Core i7-5820K

Six cores pack with power

Processor Cores: 6 | Thermal Design Power: 140W | Graphics Controller: None | Clock Speed: 3.3GHz | Processor Socket: LGA 2011-v3 | L2 Cache: 6 x 256KB


AMD Athlon x4-860K

Ideal for upgrading an existing AMD rig

Processor Cores: 4 | Thermal Design Power: 95W | Graphics Controller: None | Clock Speed: 3.7GHz | Processor Socket: FM2+ | L2 Cache: 4MB


AMD A8-7670K

Ideal for laptop users

Processor Cores: 4 | Thermal Design Power: 95W | Graphics Controller: Radeon R7 Series | Clock Speed: 3.6GHz | Processor Socket: FM2+ | L2 Cache: 4MB


*/
     
   
}
