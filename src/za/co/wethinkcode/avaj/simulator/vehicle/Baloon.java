package za.co.wethinkcode.avaj.simulator.vehicle;

import za.co.wethinkcode.avaj.simulator.WeatherTower;

public class Baloon extends Aircraft implements Flyable {

    private WeatherTower weatherTower;

    Baloon(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    public void updateConditions() {
        /*
         * SUN - Longitude increases with 2, Height increases with 4
         * RAIN - Height decreases with 5
         * FOG - Height decreases with 3
         * SNOW - Height decreases with 15
         * */
        String message = "Baloon#"+name+"("+id+"):";
        String weatherMessage = "";

        String weather = weatherTower.getWeather(coordinates);
        switch (weather) {
            case "SUN":
                weatherMessage += " The sun shining and the weather is great ouchea";
                super.coordinates.setHeight(super.coordinates.getHeight() + 2);
                super.coordinates.setLatitude(super.coordinates.getLongitude() + 4);
                break;
            case "SNOW":
                weatherMessage += " It's freezing balls out here";
                super.coordinates.setHeight(super.coordinates.getHeight() - 15);
                break;
            case "FOG":
                weatherMessage += " I can't see anything";
                super.coordinates.setLatitude(super.coordinates.getHeight() - 3);
                break;
            case "RAIN":
                weatherMessage += " The wind is slippery as hell due to this rain";
                super.coordinates.setHeight(super.coordinates.getHeight() - 5);
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