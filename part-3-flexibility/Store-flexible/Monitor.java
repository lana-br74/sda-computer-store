
/**
 * A class Memory to represent the hard disk ,methods to set and get its fields,
 * its cost and its specification.
 * @author (Lana Barikhan) 
 * @version (2017-01-25)
 */
public class Monitor extends Component
{
    // instance variables 
    private String model;
    private double size; //inch

    /**
     * Constructor for objects of class Monitor
     * that takes no parameters
     */
    public Monitor()
    {
        super();
        this.model = "unknown";
        this.size = 0;

    }
    /**
     * Constructor for objects of class Monitor
     * that takes  parameters
     * @param manufacturer The manufacturer.
     * @param cost The cost.
     */
    public Monitor(String manufacturer, double cost)
    {
        super(manufacturer,cost);
        this.model = "unknown";
        this.size = 0;

    }
    /**
     * Constructor for objects of class Monitor
     * that takes parameters
     * @param model The model.
     * @param manufacturer The manufacturer.
     * @param size The size.
     * @param cost The cost.
     */
    public Monitor(String model, String manufacturer, double size, double cost)
    {
        super(manufacturer,cost);
        this.model = model;
        this.size = size;

    }
    /**
     * set The model
     * @param model The model.
     */
    public void setModel(String model){
        this.model = model;
    }

    /**
     * return The model
     * @return The model.
     */
    public String getModel(){
        return this.model;
    }

    /**
     * set The size.
     * @param size The size.
     */
    public void setSize(double size){
        this.size = size;
    }

    /**
     * return The size.
     * @return The size.
     */
    public double getSize(){
        return this.size;
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
        return specification;
    }

}
