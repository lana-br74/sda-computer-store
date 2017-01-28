
/**
 * a class to simulate the computer components and give a summmary about the components and the price;
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
     * takes no parameter
     */
    public Computer()
    {
        serialNumber = "123ABC";
        theProcessor = new Processor();
        theHardDisk = new HardDisk();
        theDisplay = new Monitor();
        
    }
    
    public Computer(String serialNumber,String ProcessorManufacturer, String processorModel , double processorSpeed, double ProcessorCost
                    ,double hardDiskCapacity, double hardDiskCost,double monitorSize, double monitorCost)
    {
        this.serialNumber = serialNumber;
        this.theProcessor = new Processor(ProcessorManufacturer,processorModel ,processorSpeed,ProcessorCost);
        this.theHardDisk = new HardDisk(hardDiskCapacity,hardDiskCost);
        this.theDisplay = new Monitor(monitorSize,monitorCost);
        
    }
    
    public Computer(String serialNumber,String ProcessorManufacturer, String processorModel , double processorSpeed, double ProcessorCost
                    ,String hardDiskmodel, String hardDiskmanufacturer ,double hardDiskCapacity, double hardDiskCost,
                    String monitorModel, String monitorManufacturer,double monitorSize, double monitorCost)
    {
        this.serialNumber = serialNumber;
        this.theProcessor = new Processor(ProcessorManufacturer,processorModel ,processorSpeed,ProcessorCost);
        this.theHardDisk = new HardDisk(hardDiskmodel,hardDiskmanufacturer, hardDiskCapacity,hardDiskCost);
        this.theDisplay = new Monitor(monitorModel,monitorManufacturer ,monitorSize,monitorCost);
        
    }
    
    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }
    
    public String getSerialNumber(){
        return this.serialNumber;
    }
    
    public void setProcessor(Processor processor){
        this.theProcessor = processor;
    }
    
    public Processor getProcessor(){
        return this.theProcessor;
    }
    public void setHardDisk(HardDisk hardDisk){
        this.theHardDisk = hardDisk;
    }
    
    public HardDisk getHardDisk(){
        return this.theHardDisk;
    }
    
    public void setMonitor(Monitor monitor){
        this.theDisplay = monitor;
    }
    
    public Monitor getMonitor(){
        return this.theDisplay;
    }
    
    public double getTotalCost(){
        double totalCost;
        totalCost = this.theProcessor.getCost() + this.theHardDisk.getCost() + this.theDisplay.getCost();
        return totalCost;
    }
    
    /**
     * A method to print a summary of the Computer components and calculate a toral cost
     * 
     */
    public void printComputerSummmary()
    {
        // put your code here
        String specification = "SerialNumber :" + this.serialNumber +"\n"+
                               "Procssor :" + this.theProcessor.toString() +"\n"+
                               "Hard Disk :" + this.theHardDisk.toString() +"\n"+
                               "Monitor :" + this.theDisplay.toString();
        
        System.out.println(specification);
        //print the total cost
        System.out.println("total cost :"+ this.getTotalCost()+" $");
       
    }
}
