package I_O;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        try {
            FileOutputStream fos = new FileOutputStream("src/I_O/data.txt");
            fos.write(s.getBytes(StandardCharsets.UTF_8));
            fos.close();
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        input.close();
    }
}
