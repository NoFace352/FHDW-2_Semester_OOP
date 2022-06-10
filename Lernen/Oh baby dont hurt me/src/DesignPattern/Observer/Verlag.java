package DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Verlag {
    private List<Abonnent> abonnentList = new ArrayList<>();

    public void aboHinzufuegen(Abonnent abonnent){
        abonnentList.add(abonnent);
    }

    public void aboEntfernen(Abonnent abonnent){
        abonnentList.remove(abonnent);
    }

    protected void verteileZeitung(Zeitung zeitung){
        for(Abonnent abonnent: abonnentList){
            abonnent.erhalteZeitung(zeitung);
        }
    }
}
