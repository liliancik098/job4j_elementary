package ru.job4j.converter;
/*
Я немного изменил программу, и в частности типы методов и переменных (из int в float).
Сделал это из-за того что, не устраивовало что долар и евро выходит того же курса.
Но я понял что как, поэтому по заданию программу я написал в коментарии в конце.
 */
public class Converter {

    public static double rubleToEuro(double value) {
        double rsl = value / 70;
        return rsl;
    }

    public static double rubleToDollar(double value) {
        double rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(300);
        double dollar = Converter.rubleToDollar(300);
        System.out.println("300 rubles are " + euro + " euro.");
        System.out.println("300 rubles are " + dollar + " dollar.");


    }
}
/*
public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(300);
        int dollar = Converter.rubleToDollar(300);
        System.out.println("300 rubles are " + euro + " euro.");
        System.out.println("300 rubles are " + dollar + " dollar.");
    }
}
 */