package ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void whenA1B1C0X1Then2() {
        // Входные параметры. Их будет 4 штуки.
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        //Ожидаемое значение. это всегда одна переменная.
        int expected = 2;
        // Вызов метода который хотим проверить.
        // Результат вычесления. Это всегда одна переменная.

        int rsl = X2.calc(a, b, c, x);
        // Сравнение полученного значения с ожидаемым
        Assert.assertEquals(expected, rsl);
    }
}