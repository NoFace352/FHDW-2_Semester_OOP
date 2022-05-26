package AbstractFactory;

import AbstractFactory.FromFactory.Computer;

public class ComputerAbstractFactoryClass {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
