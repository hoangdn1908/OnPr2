package Final;

import java.io.*;

public class Box<T> implements Serializable {


    public void save(T item)
    {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("data.dat"));
            objectOutputStream.writeObject(item);
            objectOutputStream.close();
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void load()
    {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("data.dat"));
            T item = (T) objectInputStream.readObject();
            System.out.println(item);
            objectInputStream.close();
        }catch (IOException | ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
