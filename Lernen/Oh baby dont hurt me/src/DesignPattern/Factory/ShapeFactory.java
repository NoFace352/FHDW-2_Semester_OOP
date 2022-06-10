package DesignPattern.Factory;

public class ShapeFactory {
    public Shape createShape(String type) {
        return switch (type.toLowerCase()) {
            case "rectangle" -> new Rectangle();
            case "circle" -> new Circle();
            case "square" -> new Square();
            default -> throw new IllegalArgumentException();
        };
    }
}
