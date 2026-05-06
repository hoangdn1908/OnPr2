package Store_Game_System;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private double balance;
    private List<Game> ownedGames;

    public User(int id, String name, double balance)
    {
        setId(id);
        setName(name);
        setBalance(balance);
        ownedGames = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(int id) {
        if(id < 0)
            throw new InvalidDataException("Id can not be negative.");
        this.id = id;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty())
            throw new InvalidDataException("Name can not be null or empty.");
        this.name = name;
    }

    public void setBalance(double balance) {
        if(balance < 0)
            throw new InvalidDataException("Balance can not be negative.");
        this.balance = balance;
    }

    public void buyGame(Game game, Store store)
    {
        if(game.calculatePrice() > this.balance)
        {
            throw new InsufficientBalanceException("User doesn't has enough money to buy this game.");
        }
        if(!store.isAvailable(game))
            throw new GameNotAvailableException("This game is not available in this store.");
        ownedGames.add(game);
        store.minusNumber(game);
        balance -= game.calculatePrice();
    }

    public void returnGame(Game game, Store store)
    {
        if (!ownedGames.contains(game))
            throw new GameNotFoundException("User doesn't buys this game.");
        ownedGames.remove(game);
        store.updateNumber(game);
    }

    public void showLibrary()
    {
        for(var game : ownedGames)
        {
            game.getInfo();
        }
    }
}
