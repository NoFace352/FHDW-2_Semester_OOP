package Homework_Week_9.Strategy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    Kunde kundeA = new Kunde("Arnold", "Schwarzenegger", 420);
    Kunde kundeB = new Kunde("Hans", "Juergen", 10);
    Kunde kundeC = new Kunde("Chuck", "Norris", 1);

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
    void sortByNamesAscending() {
        BubbleSort bubbleSort = new BubbleSort(
                (first, second) -> {
                    String nameA = ((Kunde) first).getName();
                    String nameB = ((Kunde) second).getName();
                    int result = nameA.compareTo(nameB);

                    return result < 0;
                });
        List<Object> kunden = Arrays.asList(kundeA, kundeB, kundeC);
        List<Object> sortedList = bubbleSort.sort(kunden);
        assertEquals(Arrays.asList(kundeA, kundeC, kundeB), sortedList);
    }


    @Test
    void sortByNachnamenAscending() {
        BubbleSort bubbleSort = new BubbleSort(
                (first, second) -> {
                    String nachnameA = ((Kunde) first).getNachname();
                    String nachnameB = ((Kunde) second).getNachname();
                    int result = nachnameA.compareTo(nachnameB);

                    return result < 0;
                });
        List<Object> kunden = Arrays.asList(kundeA, kundeB, kundeC);
        List<Object> sortedList = bubbleSort.sort(kunden);
        assertEquals(Arrays.asList(kundeB, kundeC, kundeA), sortedList);
    }

    @Test
    void sortByKundennummerAscending() {
        BubbleSort bubbleSort = new BubbleSort(
                (first, second) -> {
                    int kundennummerA = ((Kunde) first).getKundennummer();
                    int kundennummerB = ((Kunde) second).getKundennummer();
                    return kundennummerA < kundennummerB;
                });
        List<Object> kunden = Arrays.asList(kundeA, kundeB, kundeC);
        List<Object> sortedList = bubbleSort.sort(kunden);
        assertEquals(Arrays.asList(kundeC, kundeB, kundeA), sortedList);
    }

}