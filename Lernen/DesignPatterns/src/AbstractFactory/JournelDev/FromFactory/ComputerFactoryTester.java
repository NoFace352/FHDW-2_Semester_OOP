package AbstractFactory.JournelDev.FromFactory;

public class ComputerFactoryTester {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "Ryzen", "2 GB", "WD Black");
        Computer server = ComputerFactory.getComputer("seRvEr  ", "Threadripper", "128 GB", "WD Gold");

        System.out.println(pc);
        System.out.println(server);
    }
}
