package Towers;

import vehicle.Coordinates;

public class WeatherTower extends Tower {

    public String getWeather(Coordinates coordinates) {
        return String.valueOf(coordinates);
    }

    static void changeWeather() {}
}
