package Store_Game_System;

public class Main {
    public static void main(String[] args) {
        Game gameOn = new GameOnline(1,"Genshin", 10,"Mihoyo", 2);
        Game gameOf = new GameOffline(2,"Hollow Knight",5,50);
        Store store = new Store();
        User hoang = new User(1,"Hoang", 100);
        User hung = new User(2,"Hung", 100);
        store.addGame(gameOf,1);
        store.addGame(gameOn,2);
        store.showStore();
    }
}
