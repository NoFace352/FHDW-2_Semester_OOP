package Homework_Week_9.State;

public interface State {
    void handlePressEvent(FlashLight f);

    void handleHoldEvent(FlashLight f);
}
