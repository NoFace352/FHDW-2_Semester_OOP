package AbstractFactory.JournelDev;

import AbstractFactory.JournelDev.FromFactory.Computer;

public class ComputerAbstractFactoryClass {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
