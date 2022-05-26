package Homework_Week_8.AdapterPattern.Shape2D_A;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTriangle {

    @Test
    void triangleTester(){
        TriangleAdapter tA = createTriangle();
        assertEquals(222.50, tA.area());

        tA.shift(5, 6);
        assertEquals(15, tA.getxPos());
        assertEquals(16, tA.getyPos());
    }

    @Test
    void triangleTesterShifter() {
        TriangleAdapter tA = createTriangle();

        tA.shift(5, 6);
        assertEquals(15, tA.getxPos());
        assertEquals(15, tA.getxPos());
        assertEquals(16, tA.getyPos());
    }

    @Test
    void triangleTesterScale() {
        TriangleAdapter tA = createTriangle();

        assertEquals(222.50, tA.area());
        tA.scale(2);
        assertEquals(890, tA.area());
    }

    private TriangleAdapter createTriangle() {
        LegacyPoint lpA = new LegacyPoint(15, 15);
        LegacyPoint lpB = new LegacyPoint(23, 30);
        LegacyPoint lpC = new LegacyPoint(50, 25);

        LegacyTriangle lt = new LegacyTriangle(lpA,lpB,lpC);

        return new TriangleAdapter(10,10, lt);
    }

}

