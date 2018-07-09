package vehicle;

import Towers.WeatherTower;

public class Baloon extends Aircraft{

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
    }

    public static void registerTower(WeatherTower weatherTower) {

    }
}