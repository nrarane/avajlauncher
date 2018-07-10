package ro.academy.avaj.simulator;

import ro.academy.avaj.simulator.Tower;
import ro.academy.avaj.simulator.vehicle.Coordinates;

public class WeatherTower extends Tower {

    public static String getWeather(Coordinates coordinates) {
        return String.valueOf(coordinates);
    }

    static void changeWeather() {}
}
