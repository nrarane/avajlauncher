package za.co.wethinkcode.avaj.simulator.vehicle;

public class Coordinates {

    private int longitude;
    private int latitude;
    private int height;

    public Coordinates(int longitude, int latitude, int height) {
        //some code in here to get coordinates
        setLongitude(longitude);
        setLatitude(latitude);
        setHeight(height);
    }

    public int getLongitude() { return longitude; }

    public int getLatitude() {
        return latitude;
    }

    public int getHeight() {
        return height;
    }

    public void setLongitude(int longitude) {
        if (longitude < 0)
            longitude = 0;
        this.longitude = longitude;
    }

    public void setLatitude(int latitude) {
        if (latitude < 0)
            latitude = 0;
        this.latitude = latitude;
    }

    public void setHeight(int height) {
        if (height > 100) {
            height = 100;
        } else if (height < 0) {
            height = 0;
        }
        this.height = height;
    }
}
