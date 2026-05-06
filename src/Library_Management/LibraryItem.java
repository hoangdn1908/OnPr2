package Library_Management;

public abstract class LibraryItem<T>{
    private T  id;
    private String title;
    private boolean available;

    public LibraryItem(T id, String title)
    {
        this.id = id;
        this.title = title;
        available = true;
    }

    public T getId()
    {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void checkOut()
    {
        if(!isAvailable())
        {
            throw new ItemNotAvailable("Item " + getTitle() + " is not available for checkout.");
        }
        this.available = false;
    }

    public void returnItem()
    {
        this.available = true;
    }

    public abstract String getInfo();

    public String  toString()
    {
        return getInfo() + "| Available: " +this.available;
    }
}
