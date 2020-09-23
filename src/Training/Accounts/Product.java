package Training.Accounts;


import java.util.*;

public class Product {
    private static int idGen;
    private final String itemID;
    private String itemName;
    private double itemPrice;

    private final List<LineItem> lineItems;

    public Product(String itemName, double itemPrice) {
        this.itemID = "pd" + ++idGen;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        lineItems = new ArrayList<>();
    }

    @Override
    public String toString() {

        return  "Item name = " + itemName +
                ", itemID = " + itemID +
                ", item Price = " + itemPrice +
                " sek";
    }

    public String getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }
}
