package Store_Game_System;

import java.io.Serializable;
import java.util.HashMap;

public abstract class Game implements Serializable {
    protected int id;
    protected String title;
    protected double price;

    public Game(int id, String title, double price)
    {
        setId(id);
        setTitle(title);
        setPrice(price);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        if(id < 0)
            throw new InvalidDataException("Id can not be negative.");
        this.id = id;
    }

    public void setPrice(double price) {
        if(price < 0)
            throw new InvalidDataException("Price can not be negative.");
        this.price = price;
    }

    public void setTitle(String title) {
        if(title == null || title.trim().isEmpty())
            throw new InvalidDataException("Title can not be null or empty.");
        this.title = title;
    }


    public abstract void getInfo();

    public abstract double calculatePrice();

    @Override
    public String toString() {
        return "ID: " + id + "| Title: " + title;
    }
}
