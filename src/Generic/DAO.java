package Generic;

import java.util.ArrayList;
import java.util.List;

public abstract class DAO<T extends Identifiable> {
    protected List<T> list;

    public DAO()
    {
        list = new ArrayList<>();
    }

    public void addItem(T object)
    {
        if(!list.isEmpty())
        {
            for(T item : list)
            {
                if(item.getId() == object.getId())
                {
                    throw new IllegalArgumentException("Duplicate id: " + object.getId());
                }
            }
        }
        list.add(object);
    }

    public void removeItem(int id)
    {
        if(list.isEmpty())
            throw new IllegalArgumentException("The list is empty");
        for(T item : list)
        {
            if(item.getId() == id)
            {
                list.remove(item);
                return;
            }
        }
        throw new IllegalArgumentException("Can not find by id:" +id);
    }

    public void displayAll()
    {
        for(T item : list)
        {
            System.out.println(item.toString());
        }
    }

    public abstract void updateItem(T newObject, int id);
    public abstract T findItem(int id);
}
