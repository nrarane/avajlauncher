package za.co.wethinkcode.avaj.weather;

import za.co.wethinkcode.avaj.simulator.vehicle.Coordinates;

import java.util.Random;

public class WeatherProvider {

    private static WeatherProvider weatherProvider;

    private static String[] weather;

    private WeatherProvider() {
        weather = new String[]{ "SUN", "FOG", "SNOW", "RAIN" };
    }

    public static WeatherProvider getProvider() {

        if (weatherProvider == null) {
            weatherProvider = new WeatherProvider();
        }
        return weatherProvider;

    }

    public String getCurrentWeather(Coordinates coordinates) {

        long i;
        int randNum = (int) (Math.random() * 4);

        i = (long)((randNum + coordinates.getHeight() * coordinates.getLatitude() * coordinates.getLongitude()) % 4);
        return weather[(int)i];

    }

}
