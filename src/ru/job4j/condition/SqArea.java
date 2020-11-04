package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        System.out.println("Высота прямоугольника равно: " + h);
        double l = h * k;
        System.out.println("Длина прямоугольника равно: " + l);
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, площадь прямоугольника  = " + result1);
    }
}
