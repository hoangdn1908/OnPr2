package Store_Game_System;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Game game1 = new GameOffline(1, "Minecraft", 20, 5);
        Game game2 = new GameOnline(2, "Valorant", 0, "Asia", 10);
        store.addGame(game1, 5);
        store.addGame(game2, 10);
        User user = new User(1, "Hoang", 100);
        user.buyGame(game1, store);
        store.saveStore("src/Store_Game_System/store.dat");
        user.saveUser("src/Store_Game_System/user.dat");

        Store newStore = new Store();
        newStore.loadStore("src/Store_Game_System/store.dat");

        User newUser = new User(2, "Temp", 0);
        newUser.loadUser("src/Store_Game_System/user.dat");

        System.out.println("===== STORE =====");
        newStore.showStore();

        System.out.println("===== USER =====");
        newUser.showLibrary();
        System.out.println();
        System.out.println(newUser.getBalance());
    }
}
