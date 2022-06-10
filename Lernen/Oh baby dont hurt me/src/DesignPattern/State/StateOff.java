package DesignPattern.State;

public class StateOff implements State{
    @Override
    public void handlePress(Taschenlampe taschenlampe) {
        taschenlampe.setAktuellerStatus(new StateLow());
        taschenlampe.setHelligkeit(1);
    }

    @Override
    public void handleHold(Taschenlampe taschenlampe) {
        throw new IllegalArgumentException("Schalte erst die Taschenlampe ein!");
    }
}
