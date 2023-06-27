package Vehicle;

import Components.Motor;
import Components.Tyre;

public class ElectricCar extends Vehicle {
    private Motor motor;

    public ElectricCar(double price, String colour, String brand, String model, Motor motor, Tyre tyre, double damage) {
        super(price, colour, brand, model, tyre, damage);
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }


}