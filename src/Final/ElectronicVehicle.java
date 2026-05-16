package Final;

import java.io.Serializable;

public class ElectronicVehicle extends Vehicle implements Serializable {
    private int battery;

    public ElectronicVehicle(String model, int speed, int battery) {
        super(model, speed);
        this.battery = battery;
    }

    @Override
    public String toString() {
        return super.toString() + "battery: " + battery;
    }
}
