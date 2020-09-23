package Training.Accounts;

import Training.Costumers.Interfaces.AddItem;
import Training.Costumers.Interfaces.PrintLineItem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements PrintLineItem, AddItem {
    private static int genID = 0;
    private final int id;
    private List<LineItem> itemList;

    public ShoppingCart() {
        this.id = ++genID;
        itemList = new ArrayList<>();
    }

    // Overriding an interface because I will need this method again in cart
    @Override
    public boolean addItem(LineItem item){
//        if (itemList.size() != 0) {
            if (item != null) {
                for (LineItem lineItem : itemList) {
                    /*If the item already exists in the list, upp the quantity instead of
                    adding a new row of items completely.
                    * */
                    if (item.getProduct().getItemID().equalsIgnoreCase(lineItem.getProduct().getItemID())) {
                        itemList.get(getItemIndex(lineItem)).addItem();
                        return true;
                    }
                }
                addItemToList(item);
                return true;
            }
//        }else {
//            addItemToList(item);
//        }
        return false;
    }

    private void addItemToList(LineItem item){

        itemList.add(new LineItem(item));
        //item.addItem();
    }
    private int getItemIndex(LineItem item){
        return itemList.indexOf(item);
    }

    //Overriding from interface for the sole reason that I need it elsewhere.
    @Override
    public void printItems() {
        for (LineItem item : itemList){
            System.out.println(item);
        }

        //Print out the list of items you have, but add a quantity of items you have more of!
    }

    /////GETTERS/////
    public int getId() {
        return id;
    }

    public List<LineItem> getItemList() {
        return itemList;
    }
}
