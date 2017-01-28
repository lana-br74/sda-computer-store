
/**
 * A description of class HardDisk here.
 * 
 * @author (Lana Barikhan) 
 * @version (2017-01-25)
 */
public class HardDisk
{
    // instance variables 
    private String model;
    private String manufacturer;
    private double capacity; //GigaBytes
    private double cost;
   // private double volume;//cm^3
   // private double weight;//gram
   // private double transferSpeed;
   // private double averageAccessTime;
   // private double aveageLifeSpan; //hours 
   // private String type; // external or internal
   // private String vendor;
   // private String version;
   // private String serialNumber;
   // private String busInfo;

    /**
     * Constructor for objects of class HardDisk
     */
    public HardDisk()
    {
        // initialise instance variables
        this.model = "P300";
        this.manufacturer = "Seagate";
        this.capacity = 500;
        this.cost = 200;
       
    }
    
     
     public HardDisk(double capacity, double cost)
    {
        // initialise instance variables
        this.model = "unknown";
        this.manufacturer = "unknown";
        this.capacity = capacity;
        this.cost = cost;
        
    }
    
     public HardDisk(String model, String manufacturer, double capacity, double cost)
    {
        // initialise instance variables
        this.model = model;
        this.manufacturer = manufacturer;
        this.capacity = capacity;
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
    
    
    public void setCapacity(double size){
        this.capacity = capacity;
    }
    
    public double getCapacity(){
        return this.capacity;
    }
    
    public void setCost(double cost){
        this.cost = cost;
    }
     
    public double getCost(){
        return this.cost;
    }

    /**
     * A method  to return the cost of the hard disk
     * 
     * @param  y   a sample parameter for a method
     * @return  double the cost of the hard disk
     */
    
     public String toString(){
        String specification = "Hard disk:" +
                                this.model +
                                "  " + this.manufacturer +
                                "  " + "capacity :" +
                                this.capacity + " Gb";
        
        return specification;
    }
   
}
