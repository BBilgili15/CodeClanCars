import Components.Motor;
import Components.Tyre;
import Constants.Season;
import Vehicle.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {
    private ElectricCar electricCar;
    private Motor motor;
    private Tyre tyre;


    @Before
    public void before() {
        tyre = new Tyre(Season.SUMMER, false);
        motor = new Motor(150, 122);
        electricCar = new ElectricCar(55000.50, "baby blue", "Mercedes", "Benz", motor, tyre, 1000.00);
    }

    @Test
    public void canAddDamage() {
        electricCar.setDamage(1000.00);
        assertEquals(2000.0, electricCar.getDamage(), 0);
        assertEquals(53000.5, electricCar.getPrice(), 0);
    }
}
