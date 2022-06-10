package de.fhdw.auebung.observerZeitung;

public class ExplizieterObserverAlsZeitungZeitung implements ObserverZeitung {

    private String titel;
    private String nachrichten = null;
    private int seitenzahl;
    private int zaehler = 0;

    public ExplizieterObserverAlsZeitungZeitung(String titel, int seitenzahl) {
        this.titel = titel;
        this.seitenzahl = seitenzahl;
    }


    @Override
    public void update(String nachrichten) {
        zaehler += 1;
        this.nachrichten = nachrichten;
    }


    public String getNachrichten() {
        return nachrichten;
    }

    public String getTitel() {
        return titel;
    }

    public int getZaehler() {
        return zaehler;
    }
}
