package za.co.wethinkcode.avaj.simulator.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordinatesTest {

    @Test
    void allCoordinatesShouldBePositive() {
        Coordinates coordinates = new Coordinates(-1, -54, -31);

        int expectedLon = 0;
        int expectedLat = 0;
        int expectedHeight = 0;
        assertEquals(expectedHeight, coordinates.getHeight());
        assertEquals(expectedLat, coordinates.getLatitude());
        assertEquals(expectedLon, coordinates.getLongitude());
    }

    @Test
    void ifHeightIsOneWeShouldExpectOne() {
        Coordinates coordinates = new Coordinates(900, 88, 1);

        int expectedOne = 1;
        assertEquals(expectedOne, coordinates.getHeight());
    }

    @Test
    void ifHeightIsBiggerThan100ThenMakeTheHeightEqualTo100() {
        Coordinates coordinates = new Coordinates(100, 100, 800);

        int expectedHeight = 100;

        assertEquals(100, coordinates.getHeight());
    }

    @Test
    void ifHeightIsNegativeOneWeShouldExpectZero() {
        Coordinates coordinates = new Coordinates(900, 88, -1);

        int expectedOne = 0;
        assertEquals(expectedOne, coordinates.getHeight());
    }

}