package Training.Costumers;

import Training.Accounts.Account;

public class Costumer{
    private String name;
    private static int id = 0;
    private final String uniqueID;

    private int age;
    private String email;
    private String number;

    private final Account account;

    public Costumer(String name, int age, String email, String number) {

        uniqueID = name.charAt(0) +""+ name.charAt(1)+ "" + ++id;
        this.account = new Account(getUniqueID(), this);
        this.name = name;
        this.age = age;
        this.email = email;
        this.number = number;
    }

    public Costumer(Costumer costumer) {

        uniqueID = costumer.uniqueID;
        this.account = costumer.account;
        this.name = costumer.name;
        this.age = costumer.age;
        this.email = costumer.email;
        this.number = costumer.number;
    }


    public WebCostumer signUp(String userName){
        return new WebCostumer(name, age, email, number, userName);
    }

    /////toString/////

    @Override
    public String toString() {
        return "Costumer{" +
                "name = '" + name + '\'' +
                ", uniqueID = '" + uniqueID + '\'' +
                ", age = " + age +
                ", email = '" + email + '\'' +
                ", number = '" + number + '\'' +
                ", account = " + account +
                '}';
    }


    /////GETTERS AND SETTERS/////


    public Account getAccount() {
        return account;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
