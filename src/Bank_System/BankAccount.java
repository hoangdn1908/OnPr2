package Bank_System;

import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount implements Transactable{
    private int id;
    private String name;
    protected double balance;
    protected List<Transaction> transactions;

    public BankAccount(int id, String  name, double balance)
    {
        this.id = id;
        this.name = name;
        this.balance = balance;
        transactions = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return new ArrayList<>(transactions);
    }

    public String getName()
    {
        return name;
    }

    @Override
    public void deposit(double amount) {
        if(amount < 0)
            throw new InvalidAmountException("Amount must be positive.");
        balance += amount;
        transactions.add(new Transaction("Deposit", amount));
    }

    public String toString()
    {
        return "ID: " + id +  "| Name: "  + name + "| Balance: " + balance;
    }
    @Override
    public abstract void withdraw(double amount);

    public abstract void getAccountSummary();
}
