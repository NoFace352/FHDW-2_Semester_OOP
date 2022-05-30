package Homework_Week_9.Strategy;

public class Kunde {

    private final String name;
    private final String sirname;
    private final int iD;

    public String getName() {
        return name;
    }

    public String getSirname() {
        return sirname;
    }

    public int getiD() {
        return iD;
    }

    public Kunde(String name, String sirname, int iD) {
        this.name = name;
        this.sirname = sirname;
        this.iD = iD;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "name='" + name + '\'' +
                ", sirname='" + sirname + '\'' +
                ", iD=" + iD +
                '}';
    }
}
