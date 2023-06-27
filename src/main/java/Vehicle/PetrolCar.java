package Vehicle;

import Components.Engine;
import Components.Tyre;

public class PetrolCar extends Vehicle {
    private Engine engine;

    public PetrolCar(double price, String colour, String brand, String model, Engine engine, Tyre tyre, double damage) {
        super(price, colour, brand, model, tyre, damage);
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }


}
