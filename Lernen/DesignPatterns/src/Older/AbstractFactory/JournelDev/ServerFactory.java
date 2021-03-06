package Older.AbstractFactory.JournelDev;

import Older.AbstractFactory.JournelDev.FromFactory.Computer;
import Older.AbstractFactory.JournelDev.FromFactory.Server;

public class ServerFactory extends ComputerAbstractFactory{
    private String cpu;
    private String ram;
    private String hdd;

    public ServerFactory(String cpu, String ram, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public Computer createComputer(){
        return new Server(cpu, ram, hdd);
    }
}
