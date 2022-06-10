package DesignPattern.Observer;

public class FamilieFischer implements Abonnent{
    @Override
    public void erhalteZeitung(Zeitung zeitung) {
        System.out.println("Familie Fischer hat " + zeitung.getTitel() + " erhalten");
    }
}
