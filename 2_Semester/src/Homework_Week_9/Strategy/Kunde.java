package Homework_Week_9.Strategy;

public class Kunde {
    private final String name;
    private final String nachname;
    private final int kundennummer;

    public Kunde(String name, String nachname, int kundennummer) {
        this.name = name;
        this.nachname = nachname;
        this.kundennummer = kundennummer;
    }

    @Override
    public String toString(){
        return name + ", " + nachname + " - " + kundennummer;
    }

    public String getName() {
        return name;
    }

    public String getNachname() {
        return nachname;
    }

    public int getKundennummer() {
        return kundennummer;
    }
}
