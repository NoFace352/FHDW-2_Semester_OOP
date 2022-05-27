package Homework_Week_9.Strategy;

public class NamDescendingComparatorStrategy implements ComparatorStrategy {
    @Override
    public boolean isFirstBeforeSecond(Object first, Object second) {
        if (first instanceof Kunde && second instanceof Kunde) {
            String nameA = ((Kunde) first).getName();
            String nameB = ((Kunde) second).getName();
            int result = nameA.compareTo(nameB);

            return result > 0;

            /*
            the value 0 if the argument string
            is equal to this string;

            a value less than 0 if this string is lexicographically less
            than the string argument;

            and a value greater than 0 if this string is
            lexicographically greater than the string argument.
             */
        }
        return false;
    }
}
