package de.fhdw.auebung.adapter.Triangle;

public abstract class Shape2D implements IShiftable, IScalable{

    private double xPos;
    private double yPos;

    public Shape2D(double xPos, double yPos){
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
