package DesignPattern.State;

public class StateHigh implements State {
    @Override
    public void handlePress(Taschenlampe taschenlampe) {
        taschenlampe.setAktuellerStatus(new StateOff());
        taschenlampe.setHelligkeit(0);
    }

    @Override
    public void handleHold(Taschenlampe taschenlampe) {
        taschenlampe.setAktuellerStatus(new StateLow());
        taschenlampe.setHelligkeit(1);
    }
}
