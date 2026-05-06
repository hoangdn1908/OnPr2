package Store_Game_System;

public class GameOffline extends Game{
    private double size;

    public GameOffline(int id, String title, double price, double size)
    {
        super(id, title, price);
        setSize(size);
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if (size < 0)
            throw new InvalidDataException("Size can not be negative");
        this.size = size;
    }

    @Override
    public void getInfo() {
        System.out.print(super.toString() + "| Size: " + size + "| Price" + calculatePrice() + ".");
    }

    @Override
    public double calculatePrice() {
        return super.getPrice();
    }
}
