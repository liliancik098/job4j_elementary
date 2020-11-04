package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert300RubleThenEuro() {
        int in = 300;
        double expected = 4.285714285714286;
        double out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert300RubleThenDollar() {
        int in = 300;
        double expected = 5.0;
        double out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}