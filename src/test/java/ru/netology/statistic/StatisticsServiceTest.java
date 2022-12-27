package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import ru.netology.javaqa.StatisticsService;

import static org.junit.jupiter.api.Assertions.*;

public
class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);

    }

    @Test
    void findMaxFromTheMiddle() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 30, 8, 6, 11, 11, 12};
        long expected = 30;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);

    }

    @Test
    void findMaxFromTheEnd() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 30, 8, 6, 11, 11, 120};
        long expected = 120;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}
