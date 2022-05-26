package Homework_Week_6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ausleihe {

    private final LocalDate startDatum;
    private final AusleiheStatus status;
    private final List<Exemplar> exemplarList = new ArrayList<>();
    private LocalDate endDatum;
    private Kunde kunde;

    public Ausleihe() {
        this.startDatum = LocalDate.now();
        this.endDatum = startDatum.plusWeeks(4);
        this.status = AusleiheStatus.NORMAL;
    }

    public void removeKunde() {
        this.kunde = null;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        if (kunde == null) {
            this.kunde.removeAusleihe(this);
            return;
        }
        this.kunde = kunde;
        if (!kunde.getAusleihen().contains(this)) {
            kunde.addAusleihe(this);
        }
    }

    public void addExemplar(Exemplar _exemplar) {
        this.exemplarList.add(_exemplar);
    }

    public List<Exemplar> getExemplare() {
        return exemplarList;
    }


    public void verlaengern(LocalDate newEndDatum) {
        this.endDatum = newEndDatum;
    }


    public void anKundenUebertragen(Kunde _kunde) {
        this.kunde.removeAusleihe(this);
        _kunde.addAusleihe(this);
    }
}
