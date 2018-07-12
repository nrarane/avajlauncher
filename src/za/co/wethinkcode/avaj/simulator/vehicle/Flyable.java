package za.co.wethinkcode.avaj.simulator.vehicle;

import za.co.wethinkcode.avaj.simulator.WeatherTower;

public interface Flyable {

    void updateConditions();

    void registerTower(WeatherTower weatherTower);

}