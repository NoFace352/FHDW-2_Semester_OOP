package Homework_Week_9.State;

public class StateLow implements State {
    @Override
    public void handlePressEvent(FlashLight f) {
        f.setCurrentState(new StateOff());
        f.getBulb().turnOff();
    }

    @Override
    public void handleHoldEvent(FlashLight f) {
        f.setCurrentState(new StateHigh());
        f.getBulb().turnOn(2);
    }
}