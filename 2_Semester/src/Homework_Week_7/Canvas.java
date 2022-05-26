package Homework_Week_7;

import Homework_Week_7.Shape2D.Shape2D;

import java.util.ArrayList;
import java.util.List;

public class Canvas {

    private final List<Shape2D> meep;
    private int numberOfRefreshes;

    public Canvas() {
        this.numberOfRefreshes = 0;
        this.meep = new ArrayList<>();
    }

    public void refresh() {
        System.out.println("Number of refreshes: " + numberOfRefreshes);
        numberOfRefreshes += 1;
    }
}
