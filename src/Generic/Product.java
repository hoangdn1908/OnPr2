package Generic;

import java.io.Serializable;

public class Product implements Serializable, Identifiable {
    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price)
    {
        setId(id);
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        if(name.trim().isEmpty())
            throw new IllegalArgumentException("Name can not be empty.");
        if(name.length() > 50)
            throw new IllegalArgumentException("Name can not be longer than 50.");
        for(char c : name.toCharArray())
        {
            if(!Character.isLetter(c))
                throw new RuntimeException("No a letter: " + c);
        }
        this.name = name;
    }

    public void setPrice(int price) {
        if(price < 0)
            throw new IllegalArgumentException("Invalid price");
        this.price = price;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id < 0)
            throw new IllegalArgumentException("Invalid id");
        this.id = id;
    }

    public String toString()
    {
        return "Id: " +id + "| Name: " + name +  "| Price: " + price + ".";
    }
}
