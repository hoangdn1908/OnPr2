package I_O;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/I_O/data.dat";
        double a = 9.0;
        int b = 8;
        int[] arr = {1,2,3};
        try
        {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            objectOutputStream.writeDouble(a);
            objectOutputStream.writeInt(b);
            objectOutputStream.writeObject(arr);
            objectOutputStream.close();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
            System.out.println(objectInputStream.readDouble());
            System.out.println(objectInputStream.readInt());
            System.out.println(Arrays.toString((int[])objectInputStream.readObject()));
            objectInputStream.close();
        }
        catch (IOException | ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
