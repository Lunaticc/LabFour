package Training.Accounts;

import Training.Costumers.Costumer;

public class Account {
    private final String uniqueID;
    private final Costumer costumer;

    private ShoppingCart cart;
    private Orders orders;


    public Account(String uniqueID, Costumer costumer) {
        this.cart = new ShoppingCart();
        this.orders = new Orders();
        this.uniqueID = uniqueID;
        this.costumer = costumer;
    }

    @Override
    public String toString() {
        return "Account{" +
                "uniqueID='" + uniqueID + '\'' +
                ", cart=" + cart +
                '}';
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public Orders getOrders() {
        return orders;
    }
}
