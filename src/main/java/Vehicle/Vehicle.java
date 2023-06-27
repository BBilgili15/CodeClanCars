package Vehicle;

import Components.Tyre;

import java.util.Date;

public abstract class Vehicle {
    private double price;
    private String colour;
    private final String brand;
    private final String model;
    private Tyre tyre;
    private double damage;

    public Vehicle(double price, String colour, String brand, String model, Tyre tyre, double damage) {
        this.price = price;
        this.colour = colour;
        this.brand = brand;
        this.model = model;
        this.tyre = tyre;
        this.damage = damage;
    }

    public double getPrice() {
        return price - damage;
    }

    public String getColour() {
        return colour;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public double getDamage() {
        return damage;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDamage(double damage) {
        this.damage += damage;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
}
