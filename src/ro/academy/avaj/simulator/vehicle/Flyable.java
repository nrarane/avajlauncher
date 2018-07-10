package ro.academy.avaj.simulator.vehicle;

import ro.academy.avaj.simulator.WeatherTower;

public interface Flyable {

    static void updateConditions() { }

    static void registerTower(WeatherTower weatherTower) { }

    // public static void registerTower(WeatherTower weatherTower);

}