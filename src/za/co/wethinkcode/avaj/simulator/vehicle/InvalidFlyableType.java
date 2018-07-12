package za.co.wethinkcode.avaj.simulator.vehicle;

public class InvalidFlyableType extends Exception {
    public InvalidFlyableType() {
        super("Not a valid flyable type");
    }
}
