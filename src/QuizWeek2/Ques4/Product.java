package QuizWeek2.Ques4;

import java.awt.*;
import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    private double discount;


    public Product()
    {

    }

    public Product(String name, double price, double discount)
    {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public Product(String name, double price)
    {
        this.name = name;
        this.price = price;
        this.discount = 0;
    }

    public void input(Scanner input)
    {
        System.out.println("Enter product name:");
        name = input.nextLine();
        System.out.println("Enter product price:");
        price = input.nextDouble();
        System.out.println("Enter product discount:");
        discount = input.nextDouble();

    }

    private double getImportTax()
    {
        return price / 10;
    }

    public void displayInformation()
    {
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " +  price);
        System.out.println("Discount: " + discount);
        System.out.println("Import Tax: " + getImportTax());
    }
}
