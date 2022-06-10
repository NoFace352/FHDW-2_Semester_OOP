package DesignPattern.Observer;

public class FirmaXY implements Abonnent{
    @Override
    public void erhalteZeitung(Zeitung zeitung) {
        System.out.println("FirmaXY hat " + zeitung.getTitel() + " erhalten");
    }
}
