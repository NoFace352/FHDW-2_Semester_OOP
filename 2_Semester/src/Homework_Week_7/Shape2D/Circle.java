package Homework_Week_7.Shape2D;

public class Circle extends Shape2D {
    private double radius;

    public Circle(double xPos, double yPos, double radius) {
        super(xPos, yPos);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void scale(double factor) {
        radius *= factor;
    }

    @Override
    public void shift(double x, double y) {
        setYPos(y);
        setXPos(x);
    }

    @Override
    public double area() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double getArea() {
        return area();
    }
}
