package DesignPattern.Factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.createShape("rectangle");

        rectangle.draw();
    }
}
