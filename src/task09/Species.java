package task09;

public class Species {
    private String name;
    private String planetOfOrigin;
    private int baseDangerousnessLevel;

    public Species(String name, String planetOfOrigin, int baseDangerousness) {
        this.name = name;
        this.planetOfOrigin = planetOfOrigin;
        this.baseDangerousnessLevel = baseDangerousness;
    }

    public String getName() {
        return name;
    }

    public String getPlanetOfOrigin() {
        return planetOfOrigin;
    }

    public int getBaseDangerousnessLevel() {
        return baseDangerousnessLevel;
    }
}
