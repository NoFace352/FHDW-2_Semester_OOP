package Homework_Week_9.Strategy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BubbleSortTest {

    Kunde k1 = new Kunde("Peter", "Maller", 1);
    Kunde k2 = new Kunde("Peters", "Mbller", 2);
    Kunde k3 = new Kunde("Getrud", "Mcller", 3);
    Kunde k4 = new Kunde("Getruds", "Mdnkelhups", 4);
    List<Object> unsortedList = Arrays.asList(k1, k4, k3, k2);

    @Test
    void intBubbleSortTestIntegerAscending() {
        BubbleSort bubbleSort = new BubbleSort(
                (first, second) -> {
                    int f = (int) first;
                    int s = (int) second;
                    return f < s;
                }
        );
        List<Object> a = Arrays.asList(1, 3, 2);
//        List<Object> a = Arrays.asList("1", "3", "2");
        List<Object> sortedList = bubbleSort.sort(a);
        assertEquals(Arrays.asList(1, 2, 3), sortedList);
        bubbleSort.setComparatorStrategy(
                (first, second) -> {
                    int f = (int) first;
                    int s = (int) second;
                    return f > s;
                }
        );
        sortedList = bubbleSort.sort(a);
        assertEquals(Arrays.asList(3, 2, 1), sortedList);
    }

    @Test
    void kundenNachIdSortieren() {
        BubbleSort bSort = new BubbleSort(new IdComparator());
        List<Kunde> unsortedKunde = Arrays.asList(k1, k4, k3, k2);
        unsortedKunde.sort(new IdComparator());
        assertEquals(Arrays.asList(k1, k2, k3, k4), unsortedKunde);

        List<Object> sort = bSort.sort(unsortedList);
        assertEquals(Arrays.asList(k1, k2, k3, k4), sort);
    }

    @Test
    void kundenNachVornameSortieren() {
        BubbleSort bSort = new BubbleSort(new NameComparator());
        List<Kunde> unsortedKunde = Arrays.asList(k1, k4, k3, k2);
        unsortedKunde.sort(new NameComparator());
        assertEquals(Arrays.asList(k3, k4, k1, k2), unsortedKunde);

        List<Object> sort = bSort.sort(unsortedList);
        assertEquals(Arrays.asList(k3, k4, k1, k2), sort);
    }

    @Test
    void kundenNachVornameReversedSortieren() {
        BubbleSort bSort = new BubbleSort(new NameComparator());
        bSort.reversed();

        List<Object> sort = bSort.sort(unsortedList);
        assertEquals(Arrays.asList(k2, k1, k4, k3), sort);
    }

    @Test
    void kundenNachNachnameSortieren() {
        BubbleSort bSort = new BubbleSort(
                (Object o, Object o2) -> {
                    if (o instanceof Kunde && o2 instanceof Kunde) {
                        return ((Kunde) o).getSirname().compareTo(((Kunde) o2).getSirname()) <= 0;
                    }
                    return false;
                }
        );
        List<Kunde> unsortedKunde = Arrays.asList(k1, k4, k3, k2);
        unsortedKunde.sort(
                (Kunde o1, Kunde o2) -> {
                    if (o1.getSirname().compareTo(o2.getSirname()) < 0) {
                        return -1;
                    } else if (o1.getSirname().compareTo(o2.getSirname()) == 0) {
                        return 0;
                    } else if (o1.getSirname().compareTo(o2.getSirname()) > 0) {
                        return 1;
                    }
                    throw new Error("Lucas mag Joel nicht Meer");
                });
        assertEquals(Arrays.asList(k1, k2, k3, k4), unsortedKunde);


        List<Object> sort = bSort.sort(unsortedList);

        assertEquals(Arrays.asList(k1, k2, k3, k4), sort);
    }
}

