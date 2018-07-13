package za.co.wethinkcode.avaj.simulator;

import org.junit.jupiter.api.Test;
import za.co.wethinkcode.avaj.simulator.vehicle.AircraftFactory;
import za.co.wethinkcode.avaj.simulator.vehicle.Coordinates;
import za.co.wethinkcode.avaj.simulator.vehicle.Helicopter;

import static org.junit.jupiter.api.Assertions.*;

class TowerTest {
    @Test
    void ifIRegisterTwoHelicoptersIShouldExpectTwoHelicoptersInTheRegisterTowerObserver() {
        Tower tower = new Tower();
        Helicopter helicopter = null;
        Helicopter helicopter1 = null;
        try {
            helicopter = (Helicopter) AircraftFactory.newAircraft("Helicopter","h1",1,2,4);
            helicopter1 = (Helicopter) AircraftFactory.newAircraft("Helicopter", "h2", 2,5,3);
            tower.register(helicopter);
            tower.register(helicopter1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(2,tower.getObservers().size());
    }

    @Test
    void ifIRegisterTwoHelicoptersAndUnregisterOneIShouldExpectOneHelicopterToRemainInTowerObserver() {
        Tower tower = new Tower();
        Helicopter helicopter = null;
        Helicopter helicopter1 = null;
        try {
            helicopter = (Helicopter) AircraftFactory.newAircraft("Helicopter","h1",1,2,4);
            helicopter1 = (Helicopter) AircraftFactory.newAircraft("Helicopter", "h2", 2,5,3);
            tower.register(helicopter);
            tower.register(helicopter1);
            tower.unregister(helicopter1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(1,tower.getObservers().size());
    }

    @Test
    void conditionsChanged() {
        Tower tower = new Tower();
        Helicopter helicopter = null;
        Helicopter helicopter1 = null;
        try {
            helicopter = (Helicopter) AircraftFactory.newAircraft("Helicopter","h1",1,2,0);
            helicopter1 = (Helicopter) AircraftFactory.newAircraft("Helicopter", "h2", 2,5,32);
            tower.register(helicopter);
            tower.register(helicopter1);
            tower.conditionsChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //assertEquals(1,tower.getObservers().size());
    }

}