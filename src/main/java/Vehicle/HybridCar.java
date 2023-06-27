package Vehicle;

import Components.Engine;
import Components.Motor;
import Components.Tyre;

public class HybridCar extends Vehicle {
    private Motor motor;
    private Engine engine;

    public HybridCar(double price, String colour, String brand, String model, Motor motor, Engine engine, Tyre tyre, double damage) {
        super(price, colour, brand, model, tyre, damage);
        this.motor = motor;
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public Motor getMotor() {
        return motor;
    }
}