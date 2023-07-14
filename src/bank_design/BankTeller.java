package bank_design;

/**
 * A BankTeller primarily exists to associate their ID with each transaction they perform.
 */
public class BankTeller {
    private int id;

    public BankTeller(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
