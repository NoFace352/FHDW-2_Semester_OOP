package Homework_Week_9.Strategy;

public class KundennummerAscendingComparatorStrategy implements ComparatorStrategy{

    @Override
    public boolean isFirstBeforeSecond(Object first, Object second) {
        if (!(first instanceof Kunde && second instanceof Kunde)) return false;
        int kundennummerA = ((Kunde) first).getKundennummer();
        int kundennummerB = ((Kunde) second).getKundennummer();
        return kundennummerA < kundennummerB;
    }
}
