package Homework_Week_6;

public class AusleiheVerwaltung {

    //Für eine gegebene Liste von ein oder mehreren Exemplaren und einen Kunden
    //wird ein neues AusleiheObjekt erzeugt und der ausleihe-Liste (→ Assoziation ausleihe) hinzugefügt.
    //Der Status ist normal.
    //Das Startdatum ist der aktuelle Tag (nutzen Sie die Klasse java.time.LocalDate); das
    //Enddatum ist vier Wochen später
    public Ausleihe exemplareAusleihen(Exemplar _exemplar, Kunde _kunde) {
        return null;
    }

    //Die Ausleihe wird aus der ausleihe-Liste
    //entfernt und die Beziehung zum Kunden entfernt. (Testen!)
    public void ausleiheLoeschen(Ausleihe _ausleihe) {

    }

    //Liefert den Wert der ausleihe-Liste zurück.
    public Ausleihe returnAlleAusleihen() {
        return null;
    }

    //Liefert alle Ausleihen in der ausleiheListe zurück, die dem spezifizierten Kunden zugeordnet sind.
    public Ausleihe returnAlleAusleihenVonKunden(Kunde _kunde) {
        return null;
    }

    //Liefert alle Ausleihen in der ausleiheListe zurück, deren Enddatum in der Vergangenheit liegt
    public Ausleihe returnVerspaeteteAusleihen() {
        return null;
    }
}
