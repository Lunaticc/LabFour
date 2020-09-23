package Training.Accounts;

import Training.Costumers.Interfaces.CalculatePrices;

public class LineItem implements CalculatePrices {
    private int quantity;

    private Product product;

    //Two constructors for items outside of shoppingCarts/Orders, and one for shoppingCarts/Orders
    public LineItem(Product product) {
        this.quantity = 0;
        this.product = product;
    }
    public LineItem(LineItem item){
        this.quantity = 0;
        this.product = item.product;
        addItem();
    }

    public void addItem(){
        quantity++;
    }

    @Override
    public double calculatePrices() {
        return product.getItemPrice() * quantity;
    }

    /////GETTERS SETTERS AND toString/////
    @Override
    public String toString() {
        return  product.getItemName() +
                ": quantity = " + quantity +
                ", product: " + product +
                ", total price = " + calculatePrices();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
