package Store_Game_System;

public class Store_Game_Exception extends RuntimeException {
    public Store_Game_Exception(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends Store_Game_Exception
{
    public InsufficientBalanceException(String message)
    {
        super(message);
    }
}

class GameNotFoundException extends Store_Game_Exception
{
    public GameNotFoundException(String message)
    {
        super(message);
    }
}

class InvalidDataException extends Store_Game_Exception
{
    public InvalidDataException(String message)
    {
        super(message);
    }
}

class GameNotAvailableException extends Store_Game_Exception
{
    public GameNotAvailableException(String message)
    {
        super(message);
    }
}

class DuplicateIdException extends Store_Game_Exception
{
    public DuplicateIdException(String message)
    {
        super(message);
    }
}