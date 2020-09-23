package Training;

import Training.Accounts.LineItem;
import Training.Accounts.Product;
import Training.Accounts.ShoppingCart;
import Training.Costumers.Costumer;

public class Main {
    public static void main(String[] args) {

        Product cola = new Product("Cola", 10);
        Product fanta = new Product("Fanta", 12);
        LineItem colaItem = new LineItem(cola);
        LineItem fantaItem = new LineItem(fanta);
        LineItem chips = new LineItem(new Product("Chips", 15));


        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(colaItem);
        shoppingCart.addItem(colaItem);
        shoppingCart.addItem(fantaItem);

        System.out.println(shoppingCart);
        shoppingCart.printItems();



        Costumer costumerDavid = new Costumer("David", 27, "h19davth@du.se", "0722118024");
        Costumer costumerRobin = new Costumer("Malte", 27, "Mal@yahoo.se", "07088944923");
        costumerDavid = costumerDavid.signUp("Davth");

        printBetween();
        System.out.println("Adding/Printing items for costumer david");
        costumerDavid.getAccount().getCart().addItem(colaItem);
        costumerDavid.getAccount().getCart().addItem(colaItem);
        costumerDavid.getAccount().getCart().addItem(fantaItem);
        costumerDavid.getAccount().getCart().printItems();
        printBetween();
        System.out.println("Adding/printing items for costumer Malte");
        costumerRobin.getAccount().getCart().addItem(chips);
        costumerRobin.getAccount().getCart().addItem(colaItem);
        costumerRobin.getAccount().getCart().printItems();
        printBetween();

        System.out.println(costumerDavid);
        System.out.println(costumerRobin);
    }

    private static void printBetween(){
        System.out.println("=================================================================");
    }
}
