package Homework_Week_7.Shape2D;

import Homework_Week_7.Interfaces.IScalable;
import Homework_Week_7.Interfaces.IShiftable;
import org.jetbrains.annotations.NotNull;

public abstract class Shape2D implements IScalable, IShiftable {
    private double xPos;
    private double yPos;

    public Shape2D(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    static @NotNull Shape2D createShape(@NotNull String type, double xPos, double yPos) {
        return switch (type.toLowerCase()) {
            case "rectangle" -> (new Rectangle(xPos, yPos, 5.0, 5.0));
            case "roundedrectangle" -> (new RoundedRectangle(xPos, yPos, 5.0, 5.0, 2.0));
            case "circle" -> (new Circle(xPos, yPos, 24));
            default -> throw new IllegalArgumentException("Objekt nicht erkannt!");
        };
    }

    public double getxPos() {
        return xPos;
    }

    public double getyPos() {
        return yPos;
    }

    public void setXPos(double xPos) {
        this.xPos = xPos;
    }

    public void setYPos(double yPos) {
        this.yPos = yPos;
    }

    public abstract double area();

    @Override
    public void shift(double xDir, double yDir) {
        xPos += xDir;
        yPos += yDir;
    }
}
