package DesignPattern.State;

public class StateLow implements State{
    @Override
    public void handlePress(Taschenlampe taschenlampe) {
        taschenlampe.setAktuellerStatus(new StateOff());
        taschenlampe.setHelligkeit(0);
    }

    @Override
    public void handleHold(Taschenlampe taschenlampe) {
        taschenlampe.setAktuellerStatus(new StateHigh());
        taschenlampe.setHelligkeit(2);
    }
}
