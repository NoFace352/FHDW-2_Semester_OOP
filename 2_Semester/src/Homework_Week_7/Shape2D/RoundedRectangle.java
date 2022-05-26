package Homework_Week_7.Shape2D;

public class RoundedRectangle extends Rectangle {
    private double cornerRadius;

    public RoundedRectangle(double xPos, double yPos, double width, double height, double cornerRadius) {
        super(xPos, yPos, width, height);
        this.cornerRadius = cornerRadius;
    }

    public double getCornerRadius() {
        return cornerRadius;
    }

    public void setCornerRadius(double cornerRadius) {
        this.cornerRadius = cornerRadius;
    }


    @Override
    public double area() {
        return (this.getWidth() * this.getHeight()) - Math.pow(this.cornerRadius, 2) * (4 - Math.PI);
    }

}
