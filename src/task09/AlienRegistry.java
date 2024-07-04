package task09;

import java.util.ArrayList;
import java.util.List;

public abstract class AlienRegistry {
    private static List<Alien> aliens = new ArrayList<>();
    private static List<Species> speciesList = new ArrayList<>();
    private static List<Alien> inQuarentine = new ArrayList<>();


    public static void registerAlien(Alien alien) {
        aliens.add(alien);
    }

    public static void registerSpecies(Species species) {
        speciesList.add(species);
    }

    public static void registerAlienInQuatentine(Alien alien) {
        inQuarentine.add(alien);
    }


    public static void listAliens() {
        for (Alien alien : aliens) {
            System.out.println(alien);
        }
    }

    public static void listSpecies() {
        for (Species species : speciesList) {
            System.out.println(species);
        }
    }

    public static Alien findAlienById(String id) {
        for (Alien alien : aliens) {
            if (alien.getId().equals(id)) {
                return alien;
            }
        }
        return null;
    }

    public static Species findSpeciesByName(String name) {
        for (Species species : speciesList) {
            if (species.getName().equals(name)) {
                return species;
            }
        }
        return null;
    }

    public static void monitorAliens() {
        System.out.println("Monitoring dangerous aliens in quarantine:");
        for (Alien alien : inQuarentine) {
            System.out.println(alien);
        }
    }

    public static void generateAlienReport() {
        System.out.println("============ Alien Report ==========");
        for (Alien alien : aliens) {
            System.out.println("Alien ID: " + alien.getId());
            System.out.println("Name: " + alien.getName());
            System.out.println("Species: " + alien.getSpecies().getName());
            System.out.println("Quarantine Status: " + (alien.isInQuarentine() ? "In Quarantine" : "Not in Quarantine"));
            System.out.println("Danger Level: " + alien.getDangerousnessLevel());
            System.out.println("====================================");
        }
    }
}
