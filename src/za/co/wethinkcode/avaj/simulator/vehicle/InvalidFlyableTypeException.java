package za.co.wethinkcode.avaj.simulator.vehicle;

public class InvalidFlyableTypeException extends Exception {
    public InvalidFlyableTypeException() {
        super("Not a valid flyable type");
    }
}
