package Homework_Week_9.State;

public interface State {
    void handlePressEvent(FlashLight flashLight);

    void handleHoldEvent(FlashLight flashLight);
}
