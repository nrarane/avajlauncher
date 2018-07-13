package za.co.wethinkcode.avaj.simulator;

import za.co.wethinkcode.avaj.simulator.vehicle.Aircraft;
import za.co.wethinkcode.avaj.simulator.vehicle.Flyable;

import java.util.ArrayList;
import java.util.Iterator;

public class Tower {

    public Tower() {
        this.observers = new ArrayList<>();
    }

    public ArrayList<Flyable> getObservers() {
        return observers;
    }

    private ArrayList<Flyable> observers;

    public void register(Flyable flyable) {
        observers.add(flyable);
        Aircraft aircraft = (Aircraft)flyable;
        System.out.println("Weather tower says: " + aircraft.getName() + " registered to weather tower.");
    }

    public void unregister(Flyable flyable) {
        observers.remove(flyable);
        Aircraft aircraft = (Aircraft)flyable;
        System.out.println("Weather tower says: " + aircraft.getName() + " unregistered from weather tower.");
    }

    protected void conditionsChanged() {
        Iterator<Flyable> iterator = observers.iterator();
        while (iterator.hasNext())
        {
           Flyable flyable = iterator.next();
           flyable.updateConditions();
           Aircraft aircraft = (Aircraft)flyable;
           if (aircraft.getCoordinates().getHeight() == 0) {
               iterator.remove();
               unregister(flyable);
           }
        }
        if (observers.size() == 0)
        {
            System.out.println("Every aircraft has landed");
            System.exit(0);
        }
    }
}


