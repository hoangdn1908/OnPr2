package I_O;

import java.io.*;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try
        {
            PrintWriter writer =  new PrintWriter(new File("src/I_O/data.txt"));
            String word = input.nextLine();
            writer.write(word);
            writer.close();
            BufferedReader reader = new BufferedReader(new FileReader("src/I_O/data.txt"));
            String line;
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }
            reader.close();
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
