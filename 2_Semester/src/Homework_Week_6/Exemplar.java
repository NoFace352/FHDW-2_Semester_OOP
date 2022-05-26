package Homework_Week_6;

public abstract class Exemplar {

    private final String id;

    private final String regalplatz;

    public Exemplar(String id, String regalplatz) {
        this.id = id;
        this.regalplatz = regalplatz;
    }

    public String getExemplarId() {
        return this.id;
    }

    public String getRegalplatz() {
        return this.regalplatz;
    }

    @Override
    public String toString() {
        return id + ";" + regalplatz;
    }
}
