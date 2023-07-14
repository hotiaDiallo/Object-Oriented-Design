package bank_design;

/**
 * A Transaction will be tied to a customer and a teller
 * We will have a get_transaction_description method that will be implemented by the child classes.
 * This design follows the Open-Closed Principle since we can add new transaction types without modifying the Transaction class
 */
public abstract class Transaction {
    private int customerId;
    private int tellerId;

    public Transaction(int customerId, int tellerId) {
        this.customerId = customerId;
        this.tellerId = tellerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getTellerId() {
        return tellerId;
    }

    public abstract String getTransactionDescription();
}
