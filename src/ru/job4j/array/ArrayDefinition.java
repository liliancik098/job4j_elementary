package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
                names[0] = "Плетосу Лилиан";
                names[1] = "Хаширама Сэнджу";
                names[2] = "Тобирама";
                names[3] = "Пэйн";

         System.out.println(ages.length);
        System.out.println(surname.length);
        System.out.println(prices.length);
    }
}
