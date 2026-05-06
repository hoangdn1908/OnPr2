package Bank_System;

public class Main {
    public static void main(String[] args) {
        BankAccount saveAcc = new SavingAccount(1,"Hoang", 100, 0.5);
        BankAccount checkAcc = new CheckingAccount(2,"Hung", 200, 10);
        BankManager bankManager  = new BankManager();
        bankManager.addAccount(saveAcc);
        bankManager.addAccount(checkAcc);
        saveAcc.deposit(100);
        checkAcc.withdraw(50);
        bankManager.transfer(1,3,50);
        bankManager.displayInfo();
    }
}
