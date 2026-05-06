package Bank_System;

import java.lang.classfile.AnnotationValue;

public class SavingAccount extends BankAccount{
    private double interestRate;

    public SavingAccount(int id, String name, double balance, double interestRate)
    {
        super(id, name, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
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
        return super.toString() + "| Interest rate: " + interestRate + ".";
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
