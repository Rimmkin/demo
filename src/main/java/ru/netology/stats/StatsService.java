package ru.netology.stats;


public class StatsService {
    public long calculateSum(long[] sales) {
        long salesSum = 0;
        for (long sale : sales) {
            salesSum += sale;
        }
        return salesSum;
    }



    public long middleSalesSum(long[] sales) {
        long salesSum = calculateSum(sales);
        return salesSum / sales.length;
    }


    public long monthMaxSales(long[] sales) {
        long peak = sales[0];
        long maxMonth = 1;
        long index = 0;
        for (long sale : sales) {
            index++;
            if (peak <= sale) {
                peak = sale;
                maxMonth = index  ;
            }
        }
        return maxMonth;
    }


    public long monthMinSales(long[] sales) {
        long min = sales[0];
        long minMonth = 1;
        long index = 0;
        for (long sale : sales) {
            index++;
            if (min >= sale) {
                min = sale;
                minMonth = index;
            }
        }
        return minMonth;
    }


    public long monthLessMiddleSum(long[] sales) {
        long middleSales = middleSalesSum(sales);
        long month = 0;
        for (long sale : sales) {
            if (sale < middleSales) {
                month++;
            }
        }
        return month;
    }

    public long monthAboveMiddleSum(long[] sales) {
        long middleSales = middleSalesSum(sales);
        long month = 0;
        for (long sale : sales) {
            if (sale > middleSales) {
              month++;
            }
        }
        return month;
    }
}
