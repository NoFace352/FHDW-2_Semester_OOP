package Lernen.Factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTest {

    Factory mustafa = new CarFactory();
    @Test
    void mustafaMachtauto(){
        mustafa.erstelleFahrzeug("Bmw");
        assertTrue(mustafa.erstelleFahrzeug("bmw") instanceof BMW);
    }
}