package Final;

import java.io.Serializable;

public class Vehicle implements Serializable {
    private String model;
    private int speed;

    public Vehicle(String model, int speed)
    {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Vehicle " + model + ", speed : " + speed;
    }
}
