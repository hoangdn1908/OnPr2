package Bank_System;

public class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    public CheckingAccount(int id, String name, double balance, double overdraftLimit)
    {
        super(id, name, balance);
        this.overdraftLimit  = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(amount < 0)
            throw new InvalidAmountException("Amount must be positive.");
        if(amount > getBalance())
            throw new InsufficientFundsException("Not enough to withdraw.");
        balance -= amount;
        transactions.add(new Transaction("WithDraw", amount));
    }

    public String toString()
    {
        return super.toString() + "| Overdraft Limit: " + overdraftLimit + ".";
    }

    @Override
    public void getAccountSummary() {
        System.out.println(toString());
        System.out.println("-----Transaction-----");
        if(transactions.isEmpty())
        {
            System.out.println("None");
            return;
        }
        for(var tran : transactions)
        {
            System.out.println(tran);
        }
    }
}
