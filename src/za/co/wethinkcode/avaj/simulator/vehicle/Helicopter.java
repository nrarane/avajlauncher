package za.co.wethinkcode.avaj.simulator.vehicle;

import za.co.wethinkcode.avaj.simulator.WeatherTower;

public class Helicopter extends Aircraft implements Flyable {

    private WeatherTower weatherTower;

    public WeatherTower getWeatherTower() {
        return weatherTower;
    }

    Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    public void updateConditions() {
        /*
         * SUN - Latitude increases with 10, Height increases with 2
         * RAIN - Latitude increases with 5
         * FOG - Latitude increases with 1
         * SNOW - Height decreases with 12
         * */
        String message = "Helicopter#"+name+"("+id+"):";
        String weatherMessage = "";

        String weather = weatherTower.getWeather(coordinates);
        switch (weather) {
            case "SUN":
                weatherMessage += " The sun shining and the weather is great ouchea";
                super.coordinates.setHeight(super.coordinates.getHeight() + 2);
                super.coordinates.setLatitude(super.coordinates.getLatitude() + 10);
                break;
            case "SNOW":
                weatherMessage += " It's freezing balls out here";
                super.coordinates.setHeight(super.coordinates.getHeight() - 12);
                break;
            case "FOG":
                weatherMessage += " I can't see anything";
                super.coordinates.setLatitude(super.coordinates.getLatitude() + 1);
                break;
            case "RAIN":
                weatherMessage += " The wind is slippery as hell due to this rain";
                super.coordinates.setHeight(super.coordinates.getLatitude() + 5);
                break;
            default:
                break;
        }

        if (coordinates.getHeight() <= 0) {
            weatherMessage = " landing";
        }
        System.out.println(message + weatherMessage);


    }

    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        weatherTower.register(this);
    }
}
