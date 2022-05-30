package Homework_Week_9.Strategy;

public class KundennummerAscendingComparatorStrategy implements ComparatorStrategy {

    @Override
    public boolean isFirstBeforeSecond(Object first, Object second) {
        if ((first instanceof Integer && second instanceof Integer)) {
            return ((Kunde) first).getKundennummer() > ((Kunde) second).getKundennummer();
        }
        return false;
    }
}
