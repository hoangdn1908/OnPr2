package Bank_System;

public class BankEcxeption extends RuntimeException {
    public BankEcxeption(String message) {
        super(message);
    }
}

class InsufficientFundsException extends BankEcxeption // khong du tien
{
    public InsufficientFundsException(String m)
    {
        super(m);
    }
}

class InvalidAmountException extends BankEcxeption
{
    public InvalidAmountException(String m)
    {
        super(m);
    }
}

class AccountNotFoundException extends BankEcxeption
{
    public AccountNotFoundException(String m)
    {
        super(m);
    }
}

class DuplicateIdException extends BankEcxeption
{
    public DuplicateIdException(String m)
    {
        super(m);
    }
}
