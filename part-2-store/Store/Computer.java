
/**
 * A class Computer to represent a computer and its components 
 * and give a summmary about its soecifications and its price;
 * 
 * @author (Lana Barikhan) 
 * @version (2017-01-26)
 */
public class Computer
{
    private String serialNumber; 
    private Processor theProcessor;
    private HardDisk theHardDisk;
    private Monitor theDisplay;

    /**
     * Constructor for objects of class Computer
     * takes no parameters
     */
    public Computer()
    {
        serialNumber = "Unknown";
        theProcessor = new Processor();
        theHardDisk = new HardDisk();
        theDisplay = new Monitor();

    }

    /**
     * Constructor for objects of class Computer
     * takes parameters
     */
    public Computer(String serialNumber,Processor processor, HardDisk hardDisk, Monitor monitor)
    {
        this.serialNumber = serialNumber;
        this.theProcessor = processor;
        this.theHardDisk = hardDisk;
        this.theDisplay = monitor;

    }

    /** 
     * set the serial number
     * @param serialNumber The serial number.
     */
    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }

    /**
     * return the serial number
     * @return The serial number.
     */
    public String getSerialNumber(){
        return this.serialNumber;
    }

    /**
     * set the processor
     * @param processor The Processor object.
     */

    public void setProcessor(Processor processor){
        this.theProcessor = processor;
    }

    /**
     * return the processor
     * @return The processor
     */
    public Processor getProcessor(){
        return this.theProcessor;
    }

    /**
     * set the hard disk
     * @param hardDisk The hard disk
     */
    public void setHardDisk(HardDisk hardDisk){
        this.theHardDisk = hardDisk;
    }

    /**
     * return the hard disk
     * @return The hard disk
     */
    public HardDisk getHardDisk(){
        return this.theHardDisk;
    }

    /**
     * set the monitor
     * @param monitor The monitor.
     */
    public void setMonitor(Monitor monitor){
        this.theDisplay = monitor;
    }

    /**
     * return the monitor
     * @return The monitor
     */
    public Monitor getMonitor(){
        return this.theDisplay;
    }

    /**
     * A method to calculate the total cost of the computer
     * @return The total cost.
     */
    public double getTotalCost(){
        double totalCost;
        totalCost = this.theProcessor.getCost() + this.theHardDisk.getCost() + this.theDisplay.getCost();
        return totalCost;
    }

    /**
     * A method to print a summary of the Computer components and print its toral cost
     * 
     */
    public void printComputerSummmary()
    {
        // put your code here
        String specification = "SerialNumber :" + this.serialNumber +"\n"+
            this.theProcessor.getDescription() +"\n"+
            this.theHardDisk.getDescription() +"\n"+
            this.theDisplay.getDescription();

        System.out.println(specification);
        //print the total cost
        System.out.println("total cost :"+ this.getTotalCost()+" $");

    }
}
