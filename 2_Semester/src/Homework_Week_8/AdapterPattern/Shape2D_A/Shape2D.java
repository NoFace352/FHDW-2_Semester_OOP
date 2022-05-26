package Homework_Week_8.AdapterPattern.Shape2D_A;

public abstract class Shape2D implements IScalable, IShiftable {
    private double xPos;
    private double yPos;

    public Shape2D(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public double getxPos() {
        return xPos;
    }

    public void setxPos(double xPos) {
        this.xPos = xPos;
    }

    public double getyPos() {
        return yPos;
    }

    public void setyPos(double yPos) {
        this.yPos = yPos;
    }

    public abstract double area();
}
