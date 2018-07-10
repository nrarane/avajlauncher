package ro.academy.avaj.simulator.vehicle;

import ro.academy.avaj.simulator.WeatherTower;
import ro.academy.avaj.simulator.vehicle.Aircraft;

public class Baloon extends Aircraft {

    private WeatherTower weatherTower;

    protected Baloon(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    static void Baloon( String name, Coordinates coordinates ) {
        return;
    }

    public static void updateConditions() {
        /*
        ◦ SUN - Longitude increases with 2, Height increases with 4
        ◦ RAIN - Height decreases with 5
        ◦ FOG - Height decreases with 3
        ◦ SNOW - Height decreases with 15
        * */
        Coordinates coordinates = new Coordinates();

        int lat = Coordinates.getLatitude();
        int lon = Coordinates.getLongitude();
        int height = Coordinates.getHeight();

        if ( WeatherTower.getWeather(coordinates) == "SUN") {
            lon = lon -  2;
            height = height + 4;
        } else if ( WeatherTower.getWeather(coordinates) == "RAIN" ) {
            height = height - 5;
        } else if ( WeatherTower.getWeather(coordinates) == "FOG" ) {
            height = height - 3;
        } else if ( WeatherTower.getWeather(coordinates) == "SNOW" ) {
            height = height - 15;
        }
    }

    public static void registerTower(WeatherTower weatherTower) {

    }

}