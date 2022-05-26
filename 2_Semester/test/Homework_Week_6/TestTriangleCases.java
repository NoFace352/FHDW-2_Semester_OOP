package Homework_Week_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTriangleCases {

    @Test
    void testAusleiheSetKunde() {
        Ausleihe ausleihe = new Ausleihe();
        Kunde kunde = new Kunde("Hans", "c9Kj4x");

        ausleihe.setKunde(kunde);

        assertTrue(kunde.getAusleihen().contains(ausleihe));
        assertSame(ausleihe.getKunde(), kunde);

        ausleihe.setKunde(null);

        assertFalse(kunde.getAusleihen().contains(ausleihe));
        assertNull(ausleihe.getKunde());
    }

    @Test
    void testKundeAddAusleihe() {
        Ausleihe ausleihe = new Ausleihe();
        Kunde kunde = new Kunde("Hans", "c9Kj4x");

        kunde.addAusleihe(ausleihe);

        assertTrue(kunde.getAusleihen().contains(ausleihe));
        assertSame(ausleihe.getKunde(), kunde);

        kunde.removeAusleihe(ausleihe);

        assertFalse(kunde.getAusleihen().contains(ausleihe));
        assertNull(ausleihe.getKunde());
    }

    @Test
    void testExemplarAusleiehe() {
        Ausleihe ausleihe = new Ausleihe();
        Kunde kunde = new Kunde("Hans", "c9Kj4x");

        AudiobuchExemplar ae = new AudiobuchExemplar("Hallo", "hinten");
        AudiobuchExemplar aeF = new AudiobuchExemplar("Nicht", "vorhanden");

        kunde.addAusleihe(ausleihe);
        ausleihe.addExemplar(ae);

        assertTrue(ausleihe.getExemplare().contains(ae));
        assertTrue(kunde.returnExemplare().contains(ae));

        assertFalse(kunde.returnExemplare().contains(aeF));
    }

    @Test
    void testUerbgebenAnAnderenKunden() {
        Ausleihe ausleihe = new Ausleihe();
        Kunde kundeOld = new Kunde("Hans", "c9Kj4x");
        Kunde kundeNew = new Kunde("Neu", "Peter");

        kundeOld.addAusleihe(ausleihe);

        assertTrue(kundeOld.getAusleihen().contains(ausleihe));
        assertFalse(kundeNew.getAusleihen().contains(ausleihe));

        ausleihe.anKundenUebertragen(kundeNew);

        assertFalse(kundeOld.getAusleihen().contains(ausleihe));
        assertTrue(kundeNew.getAusleihen().contains(ausleihe));


    }
}