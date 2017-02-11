
/**
 * A class Main  that prints some examples using the methods of the Component,Computer and computerStore classes.
 * 
 * @author (Lana Barikha) 
 * @version  (2017-01-28)
 */
public class Main
{

    /**
     * Constructor 
     */
    public Main()
    {
        // initialise instance variables

    }

    public void test(){

        // create some components.
        Component hdd1 = new HardDisk("Desktop SSHD", "Seagate", 1000, 80);
        Component hdd2 = new HardDisk("Enterprise Capacity v4", "Seagate", 1000, 90);
        Component hdd3 = new HardDisk("Desktop HDD", "Seagate", 3000, 180);
        Component hdd4 = new HardDisk("P300 Desktop", "Toshiba", 4000, 200);
        Component hdd5 = new HardDisk("X300 Desktop", "Toshiba", 1000, 150);

        Component display1 = new Monitor("PA328Q", "Asus",32, 250);
        Component display2 = new Monitor("U3417W", "Dell",28, 500);
        Component display3 = new Monitor("38UC99-W", "LG",32, 650);
        Component display4 = new Monitor("U2417H ", "Dell",52, 700);
        Component display5 = new Monitor("Pavilion", "HP",28, 400); 

        Component processor1 = new Processor("A8-7670K", "AMD",3.6, 250);
        Component processor2 = new Processor("Xeon E5-2660", "Intel",2.2, 220);
        Component processor3 = new Processor("Core i3-7100", "Intel",3.9, 130);
        Component processor4 = new Processor("Sempron 3850", "AMD",1.3, 85);
        Component processor5 = new Processor("Pentium G4400", "Intel",3.3, 90);

        // create some computers
        Computer PC1= new Computer( );
        PC1.setSerialNumber("123A");
        PC1.addComponent("hard disk 1", hdd1);
        PC1.addComponent("hard disk 2", hdd2);
        PC1.addComponent("display", display1);
        PC1.addComponent("processor", processor1);
        System.out.println("summary of the first computer");
        PC1.printComputerSummmary();

        System.out.println();

        Computer PC2= new Computer( );
        PC2.setSerialNumber("123B");
        PC2.addComponent("hard disk 1", hdd3);
        PC2.addComponent("hard disk 2", hdd2);
        PC2.addComponent("display", display3);
        PC2.addComponent("processor 1", processor2);
        PC2.addComponent("processor 2", processor4);
        System.out.println("summary of the second computer");
        PC2.printComputerSummmary();

        System.out.println();

        System.out.println("creating computer store and add 2 computers ans 15 componennts to it");
        //creae computer store
        ComputerStore myStore = new ComputerStore();
        // add some computers to the store
        myStore.addComputer(PC1);
        myStore.addComputer(PC2);

        // add some components to the store
        myStore.addComponent(hdd1);
        myStore.addComponent(hdd2);
        myStore.addComponent(hdd3);
        // myStore.addComponent(hdd4);
        //myStore.addComponent(hdd5);
        myStore.addComponent(display1);
        myStore.addComponent(display2);
        myStore.addComponent(display3);
        //myStore.addComponent(display4);
        //myStore.addComponent(display5);
        myStore.addComponent(processor1);
        myStore.addComponent(processor2);
        myStore.addComponent(processor3);
        //myStore.addComponent(processor4);
        //myStore.addComponent(processor5);

        //print all the computers in the store 
        System.out.println("print information about the computers in the store");
        myStore.printAllComputers();
        // print the total price of all computers
        myStore.printTotalValue();
        //print all the componenra in the store 
        System.out.println("print information about the computers in the store");
        myStore.printAllComponents();
        // print the total price of all components
        myStore.totalCostOfComponents();
        // print the total price of all components of type Monitor
        System.out.println("print the total price of all components of type Monitor");
        myStore.totalCostOfComponents("Monitor");
        // print the total price of all components of type Mouse
        System.out.println("print the total price of all components of type Mouse");
        myStore.totalCostOfComponents("Mouse");}

}
