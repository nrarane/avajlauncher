package vehicle;

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
