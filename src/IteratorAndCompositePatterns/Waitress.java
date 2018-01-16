package IteratorAndCompositePatterns;

public class Waitress {

    PancakeHouseMenu phm;
    DinerMenu dm;

    public Waitress(PancakeHouseMenu phm, DinerMenu dm){
        this.phm = phm;
        this.dm = dm;
    }

    public void printMenu(){
        Iterator pi = phm.createIterator();
        Iterator di = dm.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pi);
        System.out.println("\nLUNCH");
        printMenu(di);
    }

    private void printMenu(Iterator it) {
        while(it.hasNext()){
            MenuItem menuItem = (MenuItem) it.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getDescription()+ ", ");
            System.out.println(menuItem.getPrice());
        }
    }
}
