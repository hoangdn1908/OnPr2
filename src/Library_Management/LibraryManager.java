package Library_Management;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager<T extends LibraryItem<?>>{
    private List<T> listItem;

    public LibraryManager()
    {
        listItem = new ArrayList<>();
    }

    public List<T> getListItem() {
        return listItem;
    }

    public void addItem(T item)
    {
        listItem.add(item);
        System.out.println("Added:  " + item.getTitle());
    }

    public void removeItem(T item)
    {
        listItem.remove(item);
        System.out.println("Removed: " + item.getTitle());
    }

    public T findById(String id)
    {
        for(T  item : listItem)
        {
            if(item.getId().equals(id)) return item;
        }
        return null;
    }

    public void printAllItems()
    {
        System.out.println("===== Library Catalog =====");
        for(T item : listItem)
        {
            System.out.println(item);
        }
        System.out.println("===========================");
    }
}
