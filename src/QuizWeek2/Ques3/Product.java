package QuizWeek2.Ques3;

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

    private double calculateImportTax()
    {
        return price / 10;
    }

    public void displayInformation()
    {
        System.out.println("Product Name: " + name);
        System.out.println("Unit Price: " + "$" + price);
        System.out.println("Discount: " + discount + "%");
    }
}
