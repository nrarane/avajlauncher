import vehicle.Coordinates;

public class WeatherProvider {

    private static WeatherProvider weatherProvider() {
        return null;
    }

    private static String[] weather() {
        return new String[0];
    }

    private WeatherProvider() {
    }

    public WeatherProvider getProvider() {
        return this.weatherProvider();
    }

    public String getCurrentWeather(Coordinates coordinates) {
        return null;
    }


}
