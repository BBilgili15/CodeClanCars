import Components.Engine;
import Components.Motor;
import Components.Tyre;
import Constants.Season;
import NonCars.Customer;
import NonCars.Dealership;
import NonCars.NonCar;
import Vehicle.ElectricCar;
import Vehicle.HybridCar;
import Vehicle.PetrolCar;
import Vehicle.Vehicle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class DealershipTest {
    private Dealership dealership;
    private Customer customer;
    private ElectricCar electricCar;
    private ElectricCar electricCar1;
    private PetrolCar petrolCar;
    private HybridCar hybridCar;
    private Tyre tyre;
    private Motor motor;
    private Engine engine;
    private ArrayList<Vehicle> vehicles;
    private ArrayList<Vehicle> vehicles1;

    @Before
    public void before() {
        vehicles = new ArrayList<>();
        vehicles1 = new ArrayList<>();
        tyre = new Tyre(Season.SUMMER, false);
        motor = new Motor(150, 122);
        electricCar = new ElectricCar(55000.50, "baby blue", "Mercedes", "Benz", motor, tyre, 1000.00);
        vehicles.add(electricCar);
        electricCar1 = new ElectricCar(35000.50, "leaf green", "VW", "ID.3", motor, tyre, 100.00);
        vehicles1.add(electricCar1);
        petrolCar = new PetrolCar(25000.50, "peach", "Tesla", "Model X", engine, tyre, 0.00);
        vehicles1.add(petrolCar);
        hybridCar = new HybridCar(95000.99, "space grey", "Fiat", "Panda", motor, engine, tyre, 0.00);
        vehicles1.add(hybridCar);
        dealership = new Dealership("CodeClan Dealers", 1000000.10, vehicles1);
        customer = new Customer("Bob", 40000.10, vehicles);

    }

    @Test
    public void canBuyFromDealership() {
        customer.trade(electricCar1, dealership);
        assertEquals(2, customer.getVehicles().size());
    }

    @Test
    public void notEnoughMoneyToBuy() {
        customer.trade(hybridCar, dealership);
        assertEquals(1, customer.getVehicles().size());
    }

    @Test
    public void canRepairVehicle() {
        dealership.repairVehicle(electricCar);
        assertEquals(999000.10, dealership.getMoney(), 0);
        assertEquals(0.00, electricCar.getDamage(), 0);
    }
}
