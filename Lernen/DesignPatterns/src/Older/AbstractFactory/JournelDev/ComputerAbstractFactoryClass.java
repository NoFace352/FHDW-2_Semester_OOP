package Older.AbstractFactory.JournelDev;

import Older.AbstractFactory.JournelDev.FromFactory.Computer;

public class ComputerAbstractFactoryClass {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
