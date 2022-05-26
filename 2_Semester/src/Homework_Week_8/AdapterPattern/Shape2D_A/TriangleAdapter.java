package Homework_Week_8.AdapterPattern.Shape2D_A;

public class TriangleAdapter extends Shape2D {
    private LegacyTriangle lT;

    public TriangleAdapter(double xPos, double yPos, LegacyTriangle lT) {
        super(xPos, yPos);
        this.lT = lT;
    }


    public void shift(double x, double y) {
        setxPos(getxPos() + x);
        setyPos(getyPos() + y);
    }

    public void scale(double factor) {
        LegacyPoint lpA = lT.getLegacyPointA();
        LegacyPoint lpB = lT.getLegacyPointB();
        LegacyPoint lpC = lT.getLegayPointC();

        lpA.setxPos(lpA.getxPos() * factor);
        lpA.setyPos(lpA.getyPos() * factor);

        lpB.setxPos(lpB.getxPos() * factor);
        lpB.setyPos(lpB.getyPos() * factor);

        lpC.setxPos(lpC.getxPos() * factor);
        lpC.setyPos(lpC.getyPos() * factor);
    }

    @Override
    public double area() {
        LegacyPoint lpA = lT.getLegacyPointA();
        LegacyPoint lpB = lT.getLegacyPointB();
        LegacyPoint lpC = lT.getLegayPointC();
        
        return Math.abs((lpA.getxPos() * (lpB.getyPos() - lpC.getyPos())
                + lpB.getxPos() * (lpC.getyPos() - lpA.getyPos()) +
                lpC.getxPos() * (lpA.getyPos() - lpB.getyPos()))
                / 2);
    }

    @Override
    public double getxPos() {
        return super.getxPos();
    }

    @Override
    public void setxPos(double xPos) {
        super.setxPos(xPos);
    }

    @Override
    public double getyPos() {
        return super.getyPos();
    }

    @Override
    public void setyPos(double yPos) {
        super.setyPos(yPos);
    }

}
