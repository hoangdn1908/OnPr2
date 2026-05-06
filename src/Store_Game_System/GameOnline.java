package Store_Game_System;

public class GameOnline extends Game{
    private String server;
    private double monthlyFee;

    public GameOnline(int id, String title, double price, String server, double monthlyFee)
    {
        super(id, title, price);
        setServer(server);
        setMonthlyFee(monthlyFee);
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public String getServer() {
        return server;
    }

    public void setMonthlyFee(double monthlyFee) {
        if(monthlyFee < 0)
            throw new InvalidDataException("Monthly fee can not be negative.");
        this.monthlyFee = monthlyFee;
    }

    public void setServer(String server) {
        if(server == null || server.trim().isEmpty())
            throw new InvalidDataException("Server can not be null or empty.");
        this.server = server;
    }

    @Override
    public void getInfo() {
        System.out.print(super.toString() + "| Server: " + server + "| Monthly Fee: "  + monthlyFee + "| Price: " + calculatePrice() + ".");
    }

    @Override
    public double calculatePrice() {
        return super.price + monthlyFee;
    }
}
