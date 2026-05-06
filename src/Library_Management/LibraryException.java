package Library_Management;

public class LibraryException extends RuntimeException {
    public LibraryException(String message) {
        super(message);
    }
}

class ItemNotAvailable extends LibraryException
{
    public ItemNotAvailable(String message)
    {
        super(message);
    }
}

class ItemAlreadyBorrow extends LibraryException
{
    public ItemAlreadyBorrow(String message)
    {
        super(message);
    }
}

class MemberBorrowLimitExceededException extends LibraryException
{
    public MemberBorrowLimitExceededException(String message)
    {
        super(message);
    }
}
