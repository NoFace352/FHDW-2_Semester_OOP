package Older.AbstractFactory.JournelDev;

import Older.AbstractFactory.JournelDev.FromFactory.Computer;
import Older.AbstractFactory.JournelDev.FromFactory.PC;

public class PCFactory extends ComputerAbstractFactory{
    private String cpu;
    private String ram;
    private String hdd;

    public PCFactory(String cpu, String ram, String hdd){
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public Computer createComputer(){
        return new PC(cpu, ram, hdd);
    }
}
