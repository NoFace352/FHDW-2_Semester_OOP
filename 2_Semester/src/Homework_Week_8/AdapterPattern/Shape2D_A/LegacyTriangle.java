package Homework_Week_8.AdapterPattern.Shape2D_A;

public class LegacyTriangle {
    private LegacyPoint legacyPointA;
    private LegacyPoint legacyPointB;
    private LegacyPoint legayPointC;


    public LegacyTriangle(LegacyPoint legacyPointA, LegacyPoint legacyPointB, LegacyPoint legayPointC) {
        this.legacyPointA = legacyPointA;
        this.legacyPointB = legacyPointB;
        this.legayPointC = legayPointC;
    }

    public LegacyPoint getLegacyPointA() {
        return legacyPointA;
    }

    public void setLegacyPointA(LegacyPoint legacyPointA) {
        this.legacyPointA = legacyPointA;
    }

    public LegacyPoint getLegacyPointB() {
        return legacyPointB;
    }

    public void setLegacyPointB(LegacyPoint legacyPointB) {
        this.legacyPointB = legacyPointB;
    }

    public LegacyPoint getLegayPointC() {
        return legayPointC;
    }

    public void setLegayPointC(LegacyPoint legayPointC) {
        this.legayPointC = legayPointC;
    }
}
