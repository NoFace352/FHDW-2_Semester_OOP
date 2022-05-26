package Homework_Week_6;

import java.util.ArrayList;
import java.util.List;

public class Kunde {

    private final String name;
    private final String id;

    List<Ausleihe> ausleiheList;

    public Kunde(String name, String id) {
        this.name = name;
        this.id = id;
        this.ausleiheList = new ArrayList<>();
    }

    public void addAusleihe(Ausleihe _ausleihe) {
        this.ausleiheList.add(_ausleihe);
        _ausleihe.setKunde(this);
    }

    public List<Ausleihe> getAusleihen() {
        return ausleiheList;
    }

    public List<Exemplar> returnExemplare() {
        List<Exemplar> exemplarList = new ArrayList<>();
        for (Ausleihe ausleiheElem : ausleiheList) {
            for (Exemplar exemElem : ausleiheElem.getExemplare()) {
                exemplarList.add(exemElem);
            }
        }
        return exemplarList;
    }

    public void removeAusleihe(Ausleihe _ausleihe) {
        this.ausleiheList.remove(_ausleihe);
        _ausleihe.removeKunde();
    }
}
