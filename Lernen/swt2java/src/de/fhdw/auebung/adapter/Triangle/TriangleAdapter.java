package de.fhdw.auebung.adapter.Triangle;

public class TriangleAdapter extends Shape2D{

    private LegacyTriangle legacyTriangle;

    public TriangleAdapter(double xPos, double yPos) {
        super(xPos, yPos);
    }


    @Override
    public void shift(double x, double y) {

    }

    @Override
    public void scale(double factor) {

    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double getxPos() {
        return super.getxPos();
    }

    @Override
    public double getyPos() {
        return super.getyPos();
    }
}
