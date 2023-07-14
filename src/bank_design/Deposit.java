package bank_design;

public class Deposit extends Transaction{
    private int amount;
    public Deposit(int customerId, int tellerId, int amount) {
        super(customerId, tellerId);
        this.amount = amount;
    }


    @Override
    public String getTransactionDescription() {
        return "Teller " + getTellerId() + " deposit "+ amount + " to account "+ getCustomerId();
    }
}
