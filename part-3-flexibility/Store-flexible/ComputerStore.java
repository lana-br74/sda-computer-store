import java.util.ArrayList;
import java.util.Iterator;
/**
 * A class ComputerStore to represent a store that stores a list of computers,and components.
 * The methods are to add ,remove computers or components,
 * to print all the computers , to get the total cost of them,
 * and to get the total cost of all components .
 * 
 * @author (Lana Barikhan) 
 * @version (2017-01-28)
 */

public class ComputerStore
{
    // instance variables 
    private ArrayList <Computer> computers;
    private ArrayList <Component> components;

    /**
     * Constructor for objects of class ComputerStore
     */
    public ComputerStore()
    {
        // initialise instance variables
        computers = new ArrayList<>();
        components = new ArrayList<>();
    }

    /**
     * Constructor for objects of class ComputerStore
     * that takes parameters
     * @param computers The list of computers.
     * @param components The list of components.
     */
    public ComputerStore(ArrayList<Computer> computers, ArrayList<Component> components)
    {
        // initialise instance variables
        this.computers = computers;
        this.components = components;
    }

    /**
     * A method - to add computer to the computer list
     * 
     * @param  newComputer   a computer object to be added
     * @return  boolean      true if the computer is added successfully, false otherwise.
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
     * @param  index   The index of the computer to be removed
     * @return  boolean true if the computer is removed successfully, false otherwise.
     */
    ///////using iterator for remove
    public boolean removeComputer(int index){
        if((index >= 0) && (index < computers.size())){
            computers.remove(index); 
            return true;
        }else{
            System.out.println("the specified index doesn't exist ");
            return false;
        }
    }

    /** prints out all the details of each computer in store
     * 
     */
    public void printAllComputers(){

        if(computers.size()< 1){
            System.out.println("No computers in the store.");
        }

        for(Computer computer:computers){
            computer.printComputerSummmary();
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

    /**
     * A method to add computer to the computer list
     * 
     * @param  newComputer   a computer object to be added
     * @return  boolean      true if the computer is added successfully, false otherwise.
     */

    public boolean addComponent(Component newComponent){
        if(newComponent != null){
            components.add(newComponent);
            return true;
        }
        return false;
    }

    /**
     * A method - to remove a computer from the computer list
     * 
     * @param  index   int the index of the computer to be removed
     * @return  boolean  true if the computer is removed successfully, false otherwise.
     */
    ///////using iterator for remove
    public boolean removeComponent(int index){
        if((index >= 0) && (index < components.size())){
            components.remove(index); 
            return true;
        }else{
            System.out.println("the specified index doesn't exist");
            return false;
        }
    }

    /** prints out all the details of each components in store
     * 
     */
    public void printAllComponents(){

        if(components.size()< 1){
            System.out.println("No components in the store.");
        }
        int counter =1;   
        for(Component component:components){
            System.out.println("Description for comoponent  "+ counter);
            System.out.println(component.getDescription());
            counter++;
        }

    }

    /**prints the total cost for all components in the store.
     * 
     */
    public void totalCostOfComponents(){
        double totalValue = 0;
        for(Component component:components){
            totalValue += component.getCost();
        }

        System.out.println("the total cost for all components :" + totalValue + "$");

    } 

    /**prints the total cost for all components of a specific type in the store.
     * @param componentType The type of the component
     */
    //First version : compares all the components in the store with the given type as string.
   
    public void totalCostOfComponents(String componentType){

        double totalValue = 0;
        boolean  found = false;
        for(Component component:components){
            if(component.getClass().getName().equalsIgnoreCase(componentType)){
                totalValue += component.getCost();
                found = true;
            }
        }
        if(found){
            System.out.println("the total cost for all components of type  " + componentType +"  :" + totalValue + "$");

        } else{
            System.out.println("no such component is existed in the store.");
        }

    }

    /**prints the total cost for all components of a specific type in the store.
     * @param componentType The type of the component
     */
    //second version: checking first if the desired type is existed as a subclass of Component class and then comparing
    // it with the components that are existed in the store.
   
    public void totalCostOfComponentsV2(String componentType){

        double totalValue = 0;
        boolean found = false;
        if(componentType.length() < 2)
        {
            System.out.println("Enter a valid type name");
            return;
        }
        // this step is to avoid giving a wrong result when the user wants a type and enter a name that begins with small letter
        // ex: looking for Processor and entering processor
        String type = componentType.substring(0,1).toUpperCase()+ componentType.substring(1); 

        try{

            if(existClass(type)){
                Class<?> cl = Class.forName(type) ;
                if( Component.class.isAssignableFrom( cl ))
                {

                    for(Component component:components){
                        if(component.getClass() == cl ){
                            totalValue += component.getCost();
                            found = true;
                        }
                    }
                }
            }

            if(found){
                System.out.println("the total cost for all components of type  " + componentType +"  :" + totalValue + "$");

            } else{
                System.out.println("no such component is existed in the store.");
            }

        } catch (Exception E){
            System.out.println("Oops! Somethoing wrong happen.");
        }
    }

    /**prints the total cost for all components of a specific type in the store.
     * @param componentType The type of the component
     */
    //Third version : checking first if the desired type is existed as a class and then comparing it 
    //with the existed components in the store.
   
    public void totalCostOfComponentsV3(String componentType){

        double totalValue = 0;
        boolean  found = false;
        // this step is to avoid giving a wrong result when the user wants a type and enter a name that begins with small letter
        // ex: looking for Processor and entering processor
        String type = componentType.substring(0,1).toUpperCase()+ componentType.substring(1); 
        try{
            if(existClass(type)){
                Object obj = Class.forName(type).newInstance();
                if(obj instanceof Component){
                    for(Component component:components){
                        if(component.getClass() == obj.getClass()){
                            totalValue += component.getCost();
                            found = true;
                        }
                    }  
                }
            }

            if(found){
                System.out.println("the total cost for all components of type  " + componentType +"  :" + totalValue + "$");

            } else{
                System.out.println("no such component is existed in the store.");
            }

        }catch (Exception E){
            System.out.println("Oops! Somethoing wrong happen.");
        }

    }

    private boolean existClass(String className){
        Class<?> classname= null;
        try {
            classname = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally{
            if(classname == null) 
                return false;
            else 
                return true;
        }
    }
}
