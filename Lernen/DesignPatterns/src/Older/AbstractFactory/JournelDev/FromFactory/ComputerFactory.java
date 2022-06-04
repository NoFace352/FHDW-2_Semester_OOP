package Older.AbstractFactory.JournelDev.FromFactory;

public class ComputerFactory {
    public static Computer getComputer(String typ, String cpu, String ram, String hdd){
        return switch (typ.toLowerCase().trim()) {
            case ("pc") -> new PC(cpu, ram, hdd);
            case ("server") -> new Server(cpu, ram, hdd);
            default -> throw new IllegalArgumentException("Deine Eingabe scheint fehlerhaft zu sein!");
        };
    }
}
