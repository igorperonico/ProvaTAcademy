package task09;

import java.time.LocalDateTime;


/*Control system to monitor the entry and exit of aliens on planet Earth.*/
public class Alien {
    private String id;
    private String name;
    private Species species;
    private int dangerousnessLevel;
    private LocalDateTime entryTime;
    /*Specific attributes*/
    private int intelligence;
    private int strength;
    private boolean isInQuarentine;


    public Alien() {
    }

    public Alien(String id, String name, Species species, LocalDateTime entryTime, int intelligence, int strength) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.entryTime = entryTime;
        this.intelligence = intelligence;
        this.strength = strength;
        this.dangerousnessLevel = evaluateDangerousness();
        this.isInQuarentine = this.dangerousnessLevel > 7;

        if (isInQuarentine) {
            AlienRegistry.registerAlien(this);
        }
    }

    public int evaluateDangerousness(){
        return species.getBaseDangerousnessLevel() + (strength + intelligence)/2;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Species getSpecies() {
        return species;
    }

    public int getDangerousnessLevel() {
        return dangerousnessLevel;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public boolean isInQuarentine() {
        return isInQuarentine;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "id='" + id + '\'' +
                ", Name='" + name + '\'' +
                ", Species=" + species +
                ", Dangerousness Level=" + dangerousnessLevel +
                ", Entry Time=" + entryTime +
                ", Intelligence=" + intelligence +
                ", Strength=" + strength +
                ", IsInQuarentine=" + isInQuarentine +
                '}';
    }
}
