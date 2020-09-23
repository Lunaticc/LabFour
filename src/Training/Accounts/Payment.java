package Training.Accounts;

import Training.Enums.PType;

public class Payment {
    private static int staticid;
    private final int id;
    private PType pType;

    public Payment() {
        this.id = ++staticid;
    }
}
