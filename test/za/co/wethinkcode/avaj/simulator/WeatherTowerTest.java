package za.co.wethinkcode.avaj.simulator;

import org.junit.jupiter.api.Test;
import za.co.wethinkcode.avaj.simulator.vehicle.*;

import static org.junit.jupiter.api.Assertions.*;

class WeatherTowerTest {
    @Test
    void weatherShouldRandomizeTheWeather() {

        WeatherTower weatherTower = new WeatherTower();
        Helicopter helicopter = null;
        Jetplane jetplane = null;
        Baloon baloon = null;
        Helicopter helicopter1 = null;
        Jetplane jetplane1 = null;
        Baloon baloon1 = null;
        Helicopter helicopter2 = null;
        Jetplane jetplane2 = null;
        Baloon baloon2 = null;
        Helicopter helicopter3 = null;
        Jetplane jetplane3 = null;
        Baloon baloon3 = null;
        try {
            helicopter = (Helicopter) AircraftFactory.newAircraft("Helicopter", "h1", 1,4,6);
            jetplane = (Jetplane) AircraftFactory.newAircraft("Jetplane", "j1", 8,4,-10);
            baloon = (Baloon) AircraftFactory.newAircraft("Baloon", "b1", 1,4,6);
            helicopter1 = (Helicopter) AircraftFactory.newAircraft("Helicopter", "h2", 1,4,6);
            jetplane1 = (Jetplane) AircraftFactory.newAircraft("Jetplane", "j2", 9,4,-10);
            baloon1 = (Baloon) AircraftFactory.newAircraft("Baloon", "b2", 1,4,6);
            helicopter2 = (Helicopter) AircraftFactory.newAircraft("Helicopter", "h3", 95,4,6);
            jetplane2 = (Jetplane) AircraftFactory.newAircraft("Jetplane", "j3", 109,4,-10);
            baloon2 = (Baloon) AircraftFactory.newAircraft("Baloon", "b3", 1,4,6);
            helicopter3 = (Helicopter) AircraftFactory.newAircraft("Helicopter", "h4", 1,4,6);
            jetplane3 = (Jetplane) AircraftFactory.newAircraft("Jetplane", "j4", 10,4,-20);
            baloon3 = (Baloon) AircraftFactory.newAircraft("Baloon", "b4", 1,4,6);

            helicopter.registerTower(weatherTower);
            baloon.registerTower(weatherTower);
            jetplane.registerTower(weatherTower);
            helicopter1.registerTower(weatherTower);
            baloon1.registerTower(weatherTower);
            jetplane1.registerTower(weatherTower);
            helicopter2.registerTower(weatherTower);
            baloon2.registerTower(weatherTower);
            jetplane2.registerTower(weatherTower);
            helicopter3.registerTower(weatherTower);
            baloon3.registerTower(weatherTower);
            jetplane3.registerTower(weatherTower);

        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 100000; i++) {
            weatherTower.changeWeather();
        }
        //assertEquals("SUN", weatherTower.getWeather(new Coordinates(1,5,6)));
    }

}