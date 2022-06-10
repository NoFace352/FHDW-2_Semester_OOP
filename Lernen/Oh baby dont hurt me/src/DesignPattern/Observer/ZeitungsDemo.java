package DesignPattern.Observer;

public class ZeitungsDemo {

    public static void main(String[] args) {
        FAZVerlag verlag = new FAZVerlag();
        verlag.aboHinzufuegen(new FamilieFischer());
        verlag.aboHinzufuegen(new FamilieMeier());
        FirmaXY firmaXY = new FirmaXY();
        verlag.aboHinzufuegen(firmaXY);

        verlag.setAktuelleZeitung(new Zeitung("Skandal!"));

        verlag.aboEntfernen(firmaXY);
        verlag.setAktuelleZeitung(new Zeitung("Doch alles halb so wild!"));
    }

}
