package za.co.wethinkcode.avaj.simulator.vehicle;

import java.util.InvalidPropertiesFormatException;

public class AircraftFactory {

    public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height ) throws Exception {

        Coordinates coordinates = new Coordinates(longitude, latitude, height);

        if (type.equals("Helicopter")) {
            return (new Helicopter(name, coordinates));
        }
        if (type.equals("Baloon")) {
            return (new Baloon(name, coordinates));
        }
        if (type.equals("Jetplane")) {
            return (new Jetplane(name, coordinates));
        }
        throw new InvalidFlyableType();

    }

}
