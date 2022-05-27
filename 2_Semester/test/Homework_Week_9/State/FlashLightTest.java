package Homework_Week_9.State;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FlashLightTest {

    @Test
    void testOffLowHighLowHighOff() {
        FlashLight f = new FlashLight(new StateOff());
        assertTrue(f.getCurrentState() instanceof StateOff);
        f.press();
        assertTrue(f.getCurrentState() instanceof StateLow);
        f.hold();
        assertTrue(f.getCurrentState() instanceof StateHigh);
        f.hold();
        assertTrue(f.getCurrentState() instanceof StateLow);
        f.hold();
        assertTrue(f.getCurrentState() instanceof StateHigh);
        f.press();
        assertTrue(f.getCurrentState() instanceof StateOff);
    }
}