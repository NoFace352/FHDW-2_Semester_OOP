package Lernen.Factory;

import java.util.ArrayList;
import java.util.List;

public class CarFactory implements Factory {

    List<Car> carList = new ArrayList<>();
    @Override
    public Car erstelleFahrzeug(String carName) {
        return switch (carName.toLowerCase()) {
            case "bmw" -> new BMW("i8", 4);
            case "skoda" -> new Skoda("Pelikan", 4);
            default -> throw new IllegalArgumentException();
        };
    }
}
