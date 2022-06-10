package DesignPattern.State;

public class Taschenlampe {
    private State aktuellerStatus;
    private LED lampe;

    public Taschenlampe(){
        this.lampe = new LED();
        this.aktuellerStatus = new StateOff();
    }

    public void setAktuellerStatus(State status){
        this.aktuellerStatus = status;
    }

    public void getAktuelleHelligkeit(){
        lampe.getHelligkeit();
    }

    public void setHelligkeit(int helligkeit){
        lampe.setHelligkeit(helligkeit);
    }

}
