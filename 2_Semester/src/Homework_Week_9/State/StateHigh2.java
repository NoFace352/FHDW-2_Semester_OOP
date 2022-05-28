package Homework_Week_9.State;

public class StateHigh2 implements State{
    @Override
    public void handlePressEvent(FlashLight flashLight) {
        flashLight.setCurrentState(new StateOff());
        flashLight.getBulb().turnOff();
    }

    @Override
    public void handleHoldEvent(FlashLight flashLight) {
        flashLight.setCurrentState(new StateLow());
        flashLight.getBulb().turnOn(3);
    }
}