package vehicle;

import Towers.WeatherTower;

public class Helicopter extends Aircraft{

    private WeatherTower weatherTower;

    protected Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    static void Helicopter( String name, Coordinates coordinates ) {
        return;
    }

    public static void updateConditions() {

    }

    public static void registerTower(WeatherTower weatherTower) {

    }
}
