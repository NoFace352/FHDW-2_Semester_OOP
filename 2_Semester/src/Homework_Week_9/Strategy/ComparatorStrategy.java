package Homework_Week_9.Strategy;

@FunctionalInterface
public interface ComparatorStrategy {
    boolean isFirstBeforeSecond(Object first, Object second);
}
