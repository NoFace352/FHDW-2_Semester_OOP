package de.fhdw.auebung.observerZeitung;

public class ExplizitesSubjektNachrichtenAgentur extends AbstractObserveeZeitung {
    // Die ZeitungsAgentur wird als Subject (ein Observee) von den Zeitungen (als Observer) beobachtet

    private String name; //Name der Agentur
    private int verkaufteZeitungen;
    private String nachrichten; // Änderung in der ExplizitenZeitung


    public ExplizitesSubjektNachrichtenAgentur(String name, int verkaufteZeitungen, String nachrichten) {
        this.name = name;
        this.verkaufteZeitungen = verkaufteZeitungen;
        this.nachrichten = nachrichten;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVerkaufteZeitungen() {
        return verkaufteZeitungen;
    }

    public void setVerkaufteZeitungen(int verkaufteZeitungen) {
        this.verkaufteZeitungen = verkaufteZeitungen;
    }

    public String getNachrichten() {
        return nachrichten;
    }

    public void setNachrichten(String nachrichten) {
        this.nachrichten = nachrichten;
        this.notifyObservers(nachrichten);
    }

}
