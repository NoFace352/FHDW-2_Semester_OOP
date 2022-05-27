package Homework_Week_9.State;

public class StateOff implements State {
    @Override
    public void handlePressEvent(FlashLight f) {
        // 1. Was ist nächster State von f?
        f.setCurrentState(new StateLow());
        // 2. Seiteneffekte aufrufen
        f.getBulb().turnOn(1);
    }

    @Override
    public void handleHoldEvent(FlashLight f) {
        // nichts
    }
}
