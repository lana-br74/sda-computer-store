
/**
 * a class to simulate the computer components and give a summmary about the components and the price;
 * 
 * @author (Lana Barikhan) 
 * @version (2017-01-26)
 */
public class Computer
{
    // 
   private Processor theProcessor;
   private HardDisk theHardDisk;
   private Monitor theDisplay;

    /**
     * Constructor for objects of class Computer
     * takes no parameter
     */
    public Computer()
    {
        //
        
        theProcessor = new Processor();
        theHardDisk = new HardDisk();
        theDisplay = new Monitor();
        
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
        String specification = this.theProcessor.toString() +"\n"+
                               this.theHardDisk.toString() +"\n"+
                               this.theDisplay.toString();
        
        System.out.println(specification);
        //print the total cost
        System.out.println("total cost :"+ this.getTotalCost());
       
    }
}
