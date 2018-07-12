package za.co.wethinkcode.avaj.simulator.vehicle;

import org.junit.jupiter.api.Test;
import za.co.wethinkcode.avaj.simulator.WeatherTower;

import static org.junit.jupiter.api.Assertions.*;

class HelicopterTest {
    @Test
    void registerTower() {
        WeatherTower weatherTower = new WeatherTower();

        Helicopter helicopter = new Helicopter("H1", new Coordinates(1,3,45));
        helicopter.registerTower(weatherTower);

        assertEquals(weatherTower, helicopter.getWeatherTower());
    }

    @Test
    void updateConditions() {
        WeatherTower weatherTower = new WeatherTower();

        Helicopter helicopter = new Helicopter("H1", new Coordinates(1,3,45));
        helicopter.registerTower(weatherTower);
        helicopter.updateConditions();

        assertEquals(weatherTower, helicopter.getWeatherTower());
    }

    @Test
    void checkIfAircraftLands() {
        WeatherTower weatherTower = new WeatherTower();

        Helicopter helicopter = new Helicopter("H2", new Coordinates(1,3,0));
        helicopter.registerTower(weatherTower);
        helicopter.updateConditions();

        assertEquals(weatherTower, helicopter.getWeatherTower());
    }

}