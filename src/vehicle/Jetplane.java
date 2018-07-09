package vehicle;

import Towers.WeatherTower;

public class Jetplane extends Aircraft{

    private WeatherTower weatherTower;

    protected Jetplane(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    static void Jetplane( String name, Coordinates coordinates ) {
        return;
    }

    public static void updateConditions() {
        /*
         ◦ SUN - Latitude increases with 10, Height increases with 2
         ◦ RAIN - Latitude increases with 5
         ◦ FOG - Latitude increases with 1
         ◦ SNOW - Height decreases with 7
         * */
    }

    public static void registerTower(WeatherTower weatherTower) {

    }
}