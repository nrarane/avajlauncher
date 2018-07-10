package Towers;

import vehicle.Coordinates;

public class WeatherTower extends Tower {

    public static String getWeather(Coordinates coordinates) {
        return String.valueOf(coordinates);
    }

    static void changeWeather() {}
}
