package bank_design;

public class Withdrawal extends Transaction{
    int amount;

    public Withdrawal(int customerId, int tellerId, int amount) {
        super(customerId, tellerId);
        this.amount = amount;
    }

    @Override
    public String getTransactionDescription() {
        return "Teller " + getTellerId() + " withdraw "+ amount + " from account "+ getCustomerId();
    }
}
