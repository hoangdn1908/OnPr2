package Generic;

public class Demo {
    public static void main(String[] args) {
        Product toy = new Product(1,"ElectronicCar", 100);
        Product drink = new Product(2,"Coca",15);
        Product car = new Product(3, "Oto", 200);
        Product food = new Product(5,"Pizza",20);
        ProductDAO listProduct = new ProductDAO();
        listProduct.addItem(toy);
        listProduct.addItem(drink);
        listProduct.addItem(car);
        listProduct.updateItem(food, food.getId());
        listProduct.displayAll();
    }
}
