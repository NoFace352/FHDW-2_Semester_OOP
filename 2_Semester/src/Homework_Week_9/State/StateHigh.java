package Homework_Week_9.State;

public class StateHigh implements State {
    @Override
    public void handlePressEvent(FlashLight flashLight) {
        flashLight.setCurrentState(new StateOff());
        flashLight.getBulb().turnOff();
    }

    @Override
    public void handleHoldEvent(FlashLight flashLight) {
        flashLight.setCurrentState(new StateHigh2());
        flashLight.getBulb().turnOn(2);
    }
}
