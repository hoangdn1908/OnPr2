package Bank_System;

import java.util.ArrayList;
import java.util.List;

public class BankManager {
    private List<BankAccount> listBankAccount;

    public BankManager()
    {
        listBankAccount = new ArrayList<>();
    }

    public BankAccount findById(int id)
    {
        for(var account : listBankAccount)
        {
            if(account.getId() == id)
                return account;
        }
        return null;
    }

    public void addAccount(BankAccount account)
    {
        var checkAccount = findById(account.getId());
        if(checkAccount != null)
            throw new DuplicateIdException("Duplicate id: " + account.getId());
        listBankAccount.add(account);
    }

    public void removeAccountById(int id)
    {
        var account = findById(id);
        if(account == null){
            throw new AccountNotFoundException("Not found by id: " + id);
        }
        listBankAccount.remove(account);
    }


    public void transfer(int idTo, int idFrom, double amount)
    {
        var accountTo = findById(idTo);
        if(accountTo == null){
            throw new AccountNotFoundException("Not found by id: " + idTo);
        }
        var accountFrom = findById(idFrom);
        if(accountFrom == null){
            throw new AccountNotFoundException("Not found by id: " + idFrom);
        }
        accountTo.withdraw(amount);
        accountFrom.deposit(amount);
    }

    public void displayInfo()
    {
        for(var account : listBankAccount)
        {
            account.getAccountSummary();
            System.out.println();
        }
    }
}
