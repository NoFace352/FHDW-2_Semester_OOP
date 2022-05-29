package Homework_Week_9.State;

public class StateOff implements State {
    @Override
    public void handlePressEvent(FlashLight flashLight) {
        // 1. Was ist nächster State von f?
        flashLight.setCurrentState(new StateLow());
        // 2. Seiteneffekte aufrufen
        flashLight.getBulb().turnOff();
    }

    @Override
    public void handleHoldEvent(FlashLight flashLight) {
        // nichts
    }
}
