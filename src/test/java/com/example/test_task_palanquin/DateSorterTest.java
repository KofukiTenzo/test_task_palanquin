package com.example.test_task_palanquin;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateSorterTest {
    @Test
    public void testSortDates() {
        DateSorter dateSorter = new DateSorter();

        List<LocalDate> unsortedDates = Arrays.asList(
                LocalDate.of(2004, 7, 1),   // July
                LocalDate.of(2005, 1, 2),   // January
                LocalDate.of(2007, 1, 1),   // January
                LocalDate.of(2032, 5, 3)    // May
        );

        Collection<LocalDate> sortedDates = dateSorter.sortDates(unsortedDates);

        List<LocalDate> expectedDates = Arrays.asList(
                LocalDate.of(2005, 1, 2),   // January
                LocalDate.of(2007, 1, 1),   // January
                LocalDate.of(2032, 5, 3),   // May
                LocalDate.of(2004, 7, 1)    // July
        );

        assertEquals(expectedDates, sortedDates);
    }

    @Test
    public void testSortDatesAllWithR() {
        DateSorter dateSorter = new DateSorter();

        List<LocalDate> unsortedDates = Arrays.asList(
                LocalDate.of(2004, 3, 1),   // March
                LocalDate.of(2005, 1, 2),   // January
                LocalDate.of(2007, 4, 1),   // April
                LocalDate.of(2032, 2, 3)    // February
        );

        Collection<LocalDate> sortedDates = dateSorter.sortDates(unsortedDates);

        List<LocalDate> expectedDates = Arrays.asList(
                LocalDate.of(2005, 1, 2),   // January
                LocalDate.of(2032, 2, 3),   // February
                LocalDate.of(2004, 3, 1),   // March
                LocalDate.of(2007, 4, 1)    // April
        );

        assertEquals(expectedDates, sortedDates);
    }

    @Test
    public void testSortDatesAllWithoutR() {
        DateSorter dateSorter = new DateSorter();

        List<LocalDate> unsortedDates = Arrays.asList(
                LocalDate.of(2004, 5, 1),   // May
                LocalDate.of(2005, 6, 2),   // June
                LocalDate.of(2007, 7, 1),   // July
                LocalDate.of(2032, 8, 3)    // August
        );

        Collection<LocalDate> sortedDates = dateSorter.sortDates(unsortedDates);

        List<LocalDate> expectedDates = Arrays.asList(
                LocalDate.of(2032, 8, 3),   // August
                LocalDate.of(2007, 7, 1),   // July
                LocalDate.of(2005, 6, 2),   // June
                LocalDate.of(2004, 5, 1)    // May
        );

        assertEquals(expectedDates, sortedDates);
    }

    @Test
    public void testSortDatesMixed() {
        DateSorter dateSorter = new DateSorter();

        List<LocalDate> unsortedDates = Arrays.asList(
                LocalDate.of(2004, 7, 1),   // July
                LocalDate.of(2005, 1, 2),   // January
                LocalDate.of(2007, 8, 1),   // August
                LocalDate.of(2032, 4, 3),   // April
                LocalDate.of(2004, 5, 4)    // May
        );

        Collection<LocalDate> sortedDates = dateSorter.sortDates(unsortedDates);

        List<LocalDate> expectedDates = Arrays.asList(
                LocalDate.of(2005, 1, 2),   // January
                LocalDate.of(2032, 4, 3),   // April
                LocalDate.of(2004, 5, 4),   // May
                LocalDate.of(2007, 8, 1),   // August
                LocalDate.of(2004, 7, 1)    // July
        );

        assertEquals(expectedDates, sortedDates);
    }

    @Test
    public void testEmptyList() {
        DateSorter dateSorter = new DateSorter();

        List<LocalDate> unsortedDates = Arrays.asList();

        Collection<LocalDate> sortedDates = dateSorter.sortDates(unsortedDates);

        List<LocalDate> expectedDates = Arrays.asList();

        assertEquals(expectedDates, sortedDates);
    }
}
