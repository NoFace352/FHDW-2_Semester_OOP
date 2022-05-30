package Homework_Week_9.Strategy;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class IdComparator implements ComparatorStrategy, Comparator<Kunde> {

    @Override
    public boolean isFirstBeforeSecond(Object first, Object second) {
        if (first instanceof Kunde && second instanceof Kunde) {
            return ((Kunde) first).getiD() < ((Kunde) second).getiD();
        }
        return false;
    }

    @Override
    public int compare(Kunde o1, Kunde o2) {
        if (((Kunde) o1).getiD() < ((Kunde) o2).getiD()) {
            return -1;
        } else if (((Kunde) o1).getiD() == ((Kunde) o2).getiD()) {
            return 0;
        } else if (((Kunde) o1).getiD() > ((Kunde) o2).getiD()) {
            return 1;
        }
        throw new Error("Lucas mag Joel nicht Meer");
    }

    @Override
    public Comparator<Kunde> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Kunde> thenComparing(Comparator<? super Kunde> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<Kunde> thenComparing(Function<? super Kunde, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Kunde> thenComparing(Function<? super Kunde, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<Kunde> thenComparingInt(ToIntFunction<? super Kunde> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<Kunde> thenComparingLong(ToLongFunction<? super Kunde> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<Kunde> thenComparingDouble(ToDoubleFunction<? super Kunde> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
