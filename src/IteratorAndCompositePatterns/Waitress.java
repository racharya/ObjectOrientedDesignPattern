package IteratorAndCompositePatterns;
import java.util.Iterator;

public class Waitress {

    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterator pi = pancakeHouseMenu.createIterator();
        Iterator di = dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pi);
        System.out.println("\nLUNCH");
        printMenu(di);
    }

    private void printMenu(Iterator it) {
        while(it.hasNext()){
            MenuItem menuItem = (MenuItem) it.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice()+ " -- ");
            System.out.println(menuItem.getDescription());

        }
    }
}
