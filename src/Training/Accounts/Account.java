package Training.Accounts;

public class Account {
    private final String uniqueID;

    public Account(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    @Override
    public String toString() {
        return "Account{" +
                "uniqueID='" + uniqueID + '\'' +
                '}';
    }
}
