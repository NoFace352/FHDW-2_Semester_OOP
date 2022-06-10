package DesignPattern.Observer;

public class FamilieMeier implements Abonnent{
    @Override
    public void erhalteZeitung(Zeitung zeitung) {
        System.out.println("Familie Meier hat " + zeitung.getTitel() + " erhalten");
    }
}
