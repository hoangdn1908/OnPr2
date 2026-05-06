package Store_Game_System;

import java.util.HashMap;

public class Store{
    private HashMap<Game, Integer> store;

    public Store()
    {
        store = new HashMap<>();
    }

    public void addGame(Game game, int numberOfGames)
    {
        Game gameCheck = findGameById(game.getId());
        if(gameCheck != null)
            throw new DuplicateIdException("Duplicate id: " + game.getId());
        store.put(game, store.getOrDefault(game, 0) + numberOfGames);
    }

    public void removeGame(Game game)
    {
        if(!game.equals(findGameById(game.getId())))
            throw new GameNotAvailableException("Can not find this game in store.");
        store.remove(game);
    }

    public void minusNumber(Game game)
    {
        store.put(game, store.get(game) - 1);
    }

    public void updateNumber(Game game)
    {
        store.put(game, store.get(game) + 1);
    }

    public Game findGameById(int id)
    {
        for(var game : store.entrySet())
        {
            if (game.getKey().getId() == id)
            {
                return game.getKey();
            }
        }
        return null;
    }

    public boolean isAvailable(Game game)
    {
        return store.get(game) > 0;
    }

    public void showStore()
    {
        for(var game : store.entrySet())
        {
            game.getKey().getInfo();
            System.out.print(" Numbers: " + game.getValue());
            System.out.println();
        }
    }
}
