package I_O;

import java.io.FileInputStream;
import java.io.IOException;

public class Bai2 {
    public static void main(String[] args) {
        try
        {
            FileInputStream fileInputStream  = new FileInputStream("src/I_O/data.txt");
            int data;
            while ((data = fileInputStream.read()) != -1)
            {
                System.out.print((char) data);
            }
            fileInputStream.close();
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
