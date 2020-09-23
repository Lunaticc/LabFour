package Training;

import Training.Costumers.Costumer;

public class Main {
    public static void main(String[] args) {
        Costumer costumer = new Costumer("David", 27, "David.thiman@gmail.com", "072-211 80 24");
        Costumer costumer1 = new Costumer(costumer);
        Costumer costumer2 = new Costumer(costumer1);
        System.out.println(costumer);
        System.out.println(costumer1);
    }
}
