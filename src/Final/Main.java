package Final;

public class Main {
    public static void main(String[] args) {
        Box<Vehicle> box = new Box<>();
        Vehicle vehicle = new ElectronicVehicle("Mazda", 100,100);
        box.save(vehicle);
        box.load();
    }
}
