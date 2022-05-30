package Homework_Week_9.Strategy;

public class IntegerAscendingComparatorStrategy implements ComparatorStrategy {

    private boolean reverse;

    @Override
    public boolean isFirstBeforeSecond(Object first, Object second) {
        if (first instanceof Integer && second instanceof Integer){
            int f = (int) first;
            int s = (int) second;
            return f < s;
        } else {
            return false;
        }
    }
}
