package Homework_Week_7.Shape2D;

public class Rectangle extends Shape2D {
    private double width;
    private double height;

    public Rectangle(double xPos, double yPos, double width, double height) {
        super(xPos, yPos);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public void changeHeightAndWidth(double height, double width) {
        setWidth(width);
        setHeight(height);
    }

    @Override
    public void scale(double factor) {
        width *= factor;
        height *= factor;
    }

    @Override
    public double area() {
        return width * height;
    }

    public double getArea() {
        return area();
    }

}
