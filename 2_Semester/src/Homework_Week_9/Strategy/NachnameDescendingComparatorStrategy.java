package Homework_Week_9.Strategy;

public class NachnameDescendingComparatorStrategy implements ComparatorStrategy{

    @Override
    public boolean isFirstBeforeSecond(Object first, Object second) {
        if(!(first instanceof Kunde && second instanceof Kunde)) return false;

        String nachnameA = ((Kunde) first).getNachname();
        String nachnameB = ((Kunde) second).getNachname();

        int result = nachnameA.compareTo(nachnameB);
        return result > 0;
    }
}
