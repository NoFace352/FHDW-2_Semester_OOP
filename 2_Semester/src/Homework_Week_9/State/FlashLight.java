package Homework_Week_9.State;

public class FlashLight {

    private Bulb bulb;

    private State currentState;

    public FlashLight(State initialState) {
        currentState = initialState;
        bulb = new Bulb();
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void press() {
        currentState.handlePressEvent(this);
    }

    public void hold() {
        currentState.handleHoldEvent(this);
    }

    public Bulb getBulb() {
        return bulb;
    }
}
