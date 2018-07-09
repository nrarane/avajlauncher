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

    }

    public static void registerTower(WeatherTower weatherTower) {

    }
}