package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void shouldCalculateTotalAmountOfSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 180;

        int actual = service.totalAmountOfSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateTotalAverageSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 15;

        int actual = service.averageSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthWithMaxValue() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 7;

        int actual = service.monthWithMaxValue(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthWithMinValue() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 8;

        int actual = service.monthWithMinValue(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnAmountOfMonthsWithValueLessThanAverage() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;

        int actual = service.amountOfMonthsForValueLessAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnAmountOfMonthsWithValueMoreThanAverage() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;

        int actual = service.amountOfMonthsForValueMoreAverage(sales);

        assertEquals(expected, actual);
    }
}
