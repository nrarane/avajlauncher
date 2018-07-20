package za.co.wethinkcode.avaj.simulator;

import za.co.wethinkcode.avaj.simulator.vehicle.AircraftFactory;
import za.co.wethinkcode.avaj.simulator.vehicle.Flyable;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Simulator {

    public static WeatherTower weatherTower;
    public static List<Flyable> flyables = new ArrayList<>();
    static Writer writer = new Writer();

    public static void main(String[] args) throws InterruptedException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            String line = reader.readLine();
            if (line != null) {
//                System.out.println("Did we even get here?");
                int lines = 0;
                weatherTower = new WeatherTower();
                int simulations = Integer.parseInt(line.split(" ")[0]);
                if (simulations < 0) {
                    System.out.println("Invalid simulations count " + simulations);
                    System.exit(1);
                }
                while ((line = reader.readLine()) != null) {
                    System.out.println("Did we even get here?");
                    lines++;
                    try {
                        Flyable flyable = AircraftFactory.newAircraft(line.split(" ")[0], line.split(" ")[1],
                                Integer.parseInt(line.split(" ")[2]), Integer.parseInt(line.split(" ")[3]),
                                Integer.parseInt(line.split(" ")[4]));
                        flyables.add(flyable);
                    } catch (Exception e) {
                        System.out.println("Could not register " + line.split(" ")[0] +
                                "#" + line.split(" ")[1] + ", Error on line " + lines);
                    }

                }

                for (Flyable flyable : flyables) {
                    flyable.registerTower(weatherTower);
                }

                for (int i = 0; i < simulations; i++) {

                    writer.writeln("-------------");
                    int j = i + 1;
                    writer.writeln("simulation " + j);
                    writer.writeln("-------------");
                    weatherTower.changeWeather();
                    System.out.println();
                    writer.writeln("");

                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Could not find file " + args[0]);
        } catch (IOException e) {
            System.out.println("There was an error reading file " + args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Specify simulation file");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            writer.close();
            System.out.println("done... ");
        }
    }

}
