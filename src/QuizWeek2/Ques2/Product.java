package QuizWeek2.Ques2;

import java.awt.*;

public class Product {
    private String name;
    private double price;
    private double discount;

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

    private double getImportTax()
    {
        return price / 10;
    }

    public void displayInformation()
    {
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + "$" + price);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Import Tax: " +  "$" + getImportTax());
    }
}
