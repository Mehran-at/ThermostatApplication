import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//=Create the ThermostatTest class to make sure the Thermostat works correctly in the scenarios provided by Hansel.
class ThermostatTest {

    @Test
    void testGoesSkiing() {
        Thermostat thermostat = new Thermostat(t -> t < 0.0, t -> t + " degrees Celsius");

        String message = thermostat.scene(2.0);
        Assertions.assertEquals("2.0 degrees Celsius", message);

        message = thermostat.scene(-1.0);
        Assertions.assertEquals("Warning!", message);
    }

    @Test
    void testGoesToTheSauna() {
        Thermostat thermostat = new Thermostat(t -> t >= 80.0, t -> t + 273.15 + " degrees Kelvin");

        String message = thermostat.scene(79.0);
        Assertions.assertEquals("352.15 degrees Kelvin", message);

        message = thermostat.scene(80.0);
        Assertions.assertEquals("Warning!", message);
    }
}