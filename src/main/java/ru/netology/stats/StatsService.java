package ru.netology.stats;

public class StatsService {
    
    /**
     * Возвращает сумму продаж.
     * @param sales массив продаж.
     * @return общую сумму продаж.
     */
    public int totalAmountOfSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            //аналог sum = sum + sale
            sum += sale;
        }
        return sum;
    }

    /**
     * Возвращает среднее значение для заданного массива.
     * @param sales массив продаж.
     * @return среднее значение для заданного массива.
     */
    public int averageSales(int[] sales) {
        if (sales.length == 0)
            return  0;

        return totalAmountOfSales(sales)/sales.length;
    }

    /**
     * Возвращает месяц с максимальными продажами.
     * В случае, если таких месяцев более одного, возвращается самый последний.
     * Месяцы индексируются с нуля.
     * @param sales массив продаж
     * @return месяц с максимальными продажами
     */
    public int monthWithMaxValue(int[] sales) {
        int result = 0;
        int maxValue = 0;
        int month = result;
        for (int value : sales) {
            if (value >= maxValue) {
                maxValue = value;
                result = month;
            }
            month += 1;
        }
        return result;
    }

    /**
     * Возвращает месяц с минимальными продажами.
     * В случае, если таких месяцев более одного, возвращается самый последний.
     * Месяцы индексируются с нуля.
     * @param sales массив продаж
     * @return месяц с минимальными продажами
     */
    public int monthWithMinValue(int[] sales) {
        int result = 0;
        int minValue = Integer.MAX_VALUE;
        int month = result;
        for (int value : sales) {
            if (value <= minValue) {
                minValue = value;
                result = month;
            }
            month += 1;
        }
        return result;
    }

    /**
     * Возвращает количество месяцев с продажами ниже среднего.
     * @param sales массив продаж.
     * @return количество месяцев с продажами ниже среднего.
     */
    public int amountOfMonthsForValueLessAverage(int[] sales) {
        int result = 0;
        int average = averageSales(sales);
        for (int value : sales) {
            if (value < average) {
                result += 1;
            }
        }
        return result;
    }

    /**
     * Возвращает количество месяцев с продажами выше среднего.
     * @param sales массив продаж.
     * @return количество месяцев с продажами выше среднего.
     */
    public int amountOfMonthsForValueMoreAverage(int[] sales) {
        int result = 0;
        int average = averageSales(sales);
        for (int value : sales) {
            if (value > average) {
                result += 1;
            }
        }
        return result;
    }
}