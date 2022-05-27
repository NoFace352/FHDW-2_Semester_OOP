package AbstractFactory.JournelDev;

import AbstractFactory.JournelDev.FromFactory.Computer;

public class ComputerAbstractFactoryTester {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerAbstractFactoryClass.getComputer(new PCFactory("Ryzen", "5 GB", "WD Black"));
        Computer server = ComputerAbstractFactoryClass.getComputer(new ServerFactory("Threadripper", "555 GB", "WD GOLDEN"));

        System.out.println(pc);
        System.out.println(" -  -  -  -  - ");
        System.out.println(server);
    }
}
