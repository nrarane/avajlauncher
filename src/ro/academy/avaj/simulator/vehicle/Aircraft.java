package ro.academy.avaj.simulator.vehicle;

import ro.academy.avaj.simulator.vehicle.Coordinates;
import ro.academy.avaj.simulator.vehicle.Flyable;

public class Aircraft implements Flyable {

    protected long id;
    protected String name;
    protected Coordinates coordinates;

    private long idCounter;

    protected Aircraft(String name, Coordinates coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    }

    private long nextId() {
        return id;
    }

}
