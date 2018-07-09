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

    }

    public static void registerTower(WeatherTower weatherTower) {

    }
}