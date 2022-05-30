package Homework_Week_9.Strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BubbleSort {

    private ComparatorStrategy comparatorStrategy;

    //                  (first, second) -> bool
    public BubbleSort(ComparatorStrategy comparatorStrategy) {
        this.comparatorStrategy = comparatorStrategy;
    }

    public void setComparatorStrategy(ComparatorStrategy comparatorStrategy) {
        this.comparatorStrategy = comparatorStrategy;
    }

    public List<Object> sort(List<Object> inputList) {
        List<Object> a = new ArrayList<>(inputList);
        for (int lastIndex = a.size() - 1; lastIndex >= 0; lastIndex--) {
            for (int i = 0; i < lastIndex; i++) {
                if (comparatorStrategy.isFirstBeforeSecond(a.get(i + 1), a.get(i))) {
                    swap(a, i, i + 1);
                }
            }
        }
        return a;
    }

    public void swap(List<Object> a, int i, int j) {
        Object temp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, temp);
    }
}
