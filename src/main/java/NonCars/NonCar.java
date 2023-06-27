package NonCars;

import Constants.ITrade;
import Vehicle.Vehicle;

import java.util.ArrayList;

public abstract class NonCar implements ITrade {
    private String name;
    private double money;
    private ArrayList<Vehicle> vehicles;

    public NonCar(String name, double money, ArrayList<Vehicle> vehicles) {
        this.name = name;
        this.money = money;
        this.vehicles = vehicles;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public double getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public void trade(Vehicle vehicle, NonCar nonCar) {
        if (money >= vehicle.getPrice()) {
            nonCar.vehicles.remove(vehicle);
            vehicles.add(vehicle);
            money -= vehicle.getPrice();
            nonCar.money += vehicle.getPrice();
        }
    }

    public void repairVehicle(Vehicle vehicle) {
        money -= vehicle.getDamage();
        vehicle.setDamage(- vehicle.getDamage());
    }



}
