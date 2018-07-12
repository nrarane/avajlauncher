package za.co.wethinkcode.avaj.weather;

import za.co.wethinkcode.avaj.simulator.vehicle.Coordinates;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class WeatherProviderTest {
    @org.junit.jupiter.api.Test
    void getProvider() {
    }

    @org.junit.jupiter.api.Test
    void getCurrentWeather() {
        System.out.println(WeatherProvider.getProvider().getCurrentWeather(new Coordinates(3,3,5)));
    }

}