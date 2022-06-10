package DesignPattern.State;

public interface State {
    void handlePress(Taschenlampe taschenlampe);
    void handleHold(Taschenlampe taschenlampe);
}
