package Homework_Week_9.Strategy;

public class Kunde {

    private final String name;
    private final String surname;
    private final int iD;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getiD() {
        return iD;
    }

    public Kunde(String name, String surname, int iD) {
        this.name = name;
        this.surname = surname;
        this.iD = iD;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "name='" + name + '\'' +
                ", sirname='" + surname + '\'' +
                ", iD=" + iD +
                '}';
    }
}
