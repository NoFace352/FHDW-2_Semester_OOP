package de.fhdw.auebung.observerZeitung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExplizitesSubjektNachrichtenAgenturTest {
    @Test
    void Test(){
        ExplizitesSubjektNachrichtenAgentur dailyExpress = new ExplizitesSubjektNachrichtenAgentur
                                                            ("DailyExpress", 300, null);
        ExplizieterObserverAlsZeitungZeitung zeitung1 = new ExplizieterObserverAlsZeitungZeitung("DrecksBalttEins", 200);

        ExplizieterObserverAlsZeitungZeitung zeitung2 = new ExplizieterObserverAlsZeitungZeitung("KackblattZwei", 150);

        dailyExpress.registerObserver(zeitung1);
        dailyExpress.registerObserver(zeitung2);

        dailyExpress.setNachrichten("Putin kackt auf Bär");

        assertEquals(dailyExpress.getNachrichten(), zeitung1.getNachrichten());
        assertEquals(dailyExpress.getNachrichten(), zeitung2.getNachrichten());

        dailyExpress.setNachrichten("Heute sogar in einen Kinderwagen...");

        assertEquals(dailyExpress.getNachrichten(), zeitung1.getNachrichten());
        assertEquals(dailyExpress.getNachrichten(), zeitung2.getNachrichten());
        assertEquals(2, zeitung1.getZaehler());
        assertEquals(2, zeitung2.getZaehler());
    }

}