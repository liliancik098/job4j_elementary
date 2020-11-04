package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.pow(x2 - x1, 2); // возведение результата rsl в степень 2
        double rsl1 = Math.pow(y2 - y1, 2); // возведение результата rsl1 в степень 2
        double rsl2 = Math.sqrt(rsl + rsl1); // сложение резултатов rsl и rsl1 и вычесление корня квадратного
        return rsl2;
    }

    public static void main(String[] args) {
        double result = Point.distance(2, 5, 2, 10);
        System.out.println("result (2, 5) to (2, 10) " + result);
    }
}