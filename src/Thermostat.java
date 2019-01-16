//Hansel buys a dynamic thermostat bracelet. The instruction manual says that when you start it you can set up a trigger
// condition and also customize the display message.  His idea is to use it to get warnings when he goes skiing and the
// weather is too cold, or when he goes to the sauna and it gets too hot.
//Develop the following code:
//      . Create the Thermostat class.
//      . The Thermostat has a trigger condition and a display function. It receives them via constructor, so they can be
//  customized every time a new one is created.
//      . The Thermostat has the sense method that receives the temperature in degrees Celsius as a Double and returns a
//  String with a message. As long as the condition doesn’t get triggered, the message provided by the display function
// is returned. If the condition gets triggered, then the message “Warning!” is returned.
//      . Create the ThermostatTest class to make sure the Thermostat works correctly in the scenarios provided by Hansel.
//
//Scenarios provided by Hansel:
//      > Hansel goes skiing and creates his Thermostat to warn him when the temperature is under 0 degrees Celsius. The display
// message should show the temperature received by the sense method followed by the right temperature measurement kind,
// as in “12.3 degrees Celsius”.
//              - He checks the Thermostat when the temperature is 2 degrees Celsius and the message says “2.0 degrees Celsius”.
//              - He checks the Thermostat when the temperature is -1 degrees Celsius and the message says “Warning!”.
//      > Hansel goes to the sauna and creates his Thermostat to warn him when the temperature is at least 80 degrees
// Celsius. The display message should show the temperature received by the sense method transformed in degrees Kelvin
// followed by the right temperature measurement kind, as in “352.15 degrees Kelvin”.
//              - He checks the Thermostat when the temperature is 79 degrees Celsius and the message says “352.15
// degrees Kelvin”.
//              - He checks the Thermostat when the temperature is 80 degrees Celsius and the message says “Warning!”.
//
//      Hints:
//To transform degrees Celsius into degrees Kelvin, simply add 273.15.
//Don’t create an Application class or any main method. You don’t need it. All you need is to create the test class and
// make sure you test the scenarios provided by Hansel.
import java.util.function.Function;
import java.util.function.Predicate;
//      =Create the Thermostat class.
public class Thermostat {
//      =The Thermostat has a trigger condition and a display function. It receives them via constructor, so they can be
// customized every time a new one is created.
    private Predicate<Double> trigger;
    private Function<Double, String> display;
    public Thermostat(Predicate<Double> trigger, Function<Double, String> display) {
        this.trigger = trigger;
        this.display = display;
    }
//      =The Thermostat has the sense method that receives the temperature in degrees Celsius as a Double and returns a
// String with a message. As long as the condition doesn’t get triggered, the message provided by the display function
// is returned. If the condition gets triggered, then the message “Warning!” is returned.
    public String scene(Double temoereture) {
        if (trigger.test(temoereture)) {
            return "Warning!";
        }
    return display.apply(temoereture);}
}
