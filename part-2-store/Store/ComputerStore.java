import java.util.ArrayList;
import java.util.Iterator;
/**
 * A class ComputerStore to represent a store that stores a list of computers,and methods to add or remove computers,
 * to print all the computers , to get the total cost, and to get the most expensive computer.
 * 
 * @author (Lana Barikhan) 
 * @version (2017-01-28)
 */

public class ComputerStore
{
    // instance variables 
    private ArrayList <Computer> computers;

    /**
     * Constructor for objects of class ComputerStore
     * that takes mo parameters
     */
    public ComputerStore()
    {
        // initialise instance variables
        computers = new ArrayList<>();
    }

    /**
     * Constructor for objects of class ComputerStore
     * that takes arary list of computers as parameter
     */
    public ComputerStore(ArrayList<Computer> computers)
    {
        // initialise instance variables
        this.computers = computers;
    }

    /**
     * A method to add computer to the computer list
     * 
     * @param  newComputer   The computer object to be added
     * @return  boolean True if the computer is added successfully, false otherwise.
     */

    public boolean addComputer(Computer newComputer){
        if(newComputer != null){
            computers.add(newComputer);
            return true;
        }
        return false;
    }

    /**
     * A method to remove a computer from the computer list
     * 
     * @param  index The index of the computer to be removed
     * @return  boolean  True if the computer is removed successfully, false otherwise.
     */
    public boolean removeComputer(int index){
        if((index >= 0) && (index < computers.size())){
            computers.remove(index); 
            return true;
        }else{
            System.out.println("the specified index doesn't exist");
            return false;
        }
    }

    /** prints out all the details of each computer in the store
     * 
     */
    public void printAllComputers(){

        if(computers.size()< 1){
            System.out.println("No computers in the store.");
        }
        int counter = 1; 
        for(Computer computer:computers){
            System.out.println(counter + " ");
            computer.printComputerSummmary();
            counter++;
        }

    }

    /**prints the total cost for all computers in the store.
     * 
     */
    public void printTotalValue(){
        double totalValue = 0;
        for(Computer computer:computers){
            totalValue += computer.getTotalCost();
        }

        System.out.println("the total cost for all computers :" + totalValue + "$");

    } 

    /** A method to find the most expensive computer
     *  using an ordinary for loop
     *  @return The computer with the highest cost.
     */
    public Computer findMostExpenxiveComputerV1(){

        double max = 0;
        Computer mostExpensiveComputer = null;
        for(int i = 0; i<computers.size(); i++){
            Computer computer = computers.get(i);
            if(computer.getTotalCost() > max){
                mostExpensiveComputer = computer;
                max = computer.getTotalCost();
            }
        }
        System.out.println(mostExpensiveComputer.getTotalCost());
        return mostExpensiveComputer;

    }

    /** A method to find the most expensive computer
     *  using an ordinary while loop
     *  @return The computer with the highest cost.
     */
    public Computer findMostExpenxiveComputerV2(){

        double max = 0;
        Computer mostExpensiveComputer = null;
        int counter = 0;
        while(counter < computers.size()){
            Computer computer = computers.get(counter);
            if(computer.getTotalCost() > max){
                mostExpensiveComputer = computer;
                max = computer.getTotalCost();
            }
            counter++;
        }
        System.out.println(mostExpensiveComputer.getTotalCost());
        return mostExpensiveComputer;
    }

    /** A method to find the most expensive computer
     *  using a for each loop
     *  @return The computer with the highest cost.
     *  
     *  
     */
    public Computer findMostExpenxiveComputerV3(){

        double max = 0;
        Computer mostExpensiveComputer = null;
        for(Computer computer:computers){
            if(computer.getTotalCost() > max){
                mostExpensiveComputer = computer;
                max = computer.getTotalCost();
            }
        }
        System.out.println(mostExpensiveComputer.getTotalCost());
        return mostExpensiveComputer;
    }

    /** A method to find the most expensive computer
     *  using an iterator object with while loop
     *  @return The computer with the highest cost. 
     */
    public Computer findMostExpenxiveComputerV4(){

        double max = 0;
        Computer mostExpensiveComputer = null;
        Iterator <Computer> iter = computers.iterator();
        while(iter.hasNext()){
            Computer computer = iter.next();
            if(computer.getTotalCost() > max){
                mostExpensiveComputer = computer;
                max = computer.getTotalCost();
            }
        }
        System.out.println(mostExpensiveComputer.getTotalCost());   
        return mostExpensiveComputer;

    }

}
