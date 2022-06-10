package DesignPattern.Observer;


public class FAZVerlag extends Verlag{
    private Zeitung aktuelleZeitung;


    public Zeitung getAktuelleZeitung(){
        return aktuelleZeitung;
    }

    public void setAktuelleZeitung(Zeitung zeitung){
        this.aktuelleZeitung = zeitung;
        verteileZeitung(zeitung);
    }


}
