package za.co.wethinkcode.avaj.simulator;

import za.co.wethinkcode.avaj.simulator.vehicle.Coordinates;
import za.co.wethinkcode.avaj.weather.WeatherProvider;

public class WeatherTower extends Tower {

    private WeatherProvider weatherprovider = WeatherProvider.getProvider();

    public String getWeather(Coordinates coordinates) {
        return weatherprovider.getCurrentWeather(coordinates);
    }

    void changeWeather() {
        conditionsChanged();
    }

}
