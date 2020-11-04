package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when25to210then5() {
        double expected = 5.0;
        int x1 = 2;
        int y1 = 5;
        int x2 = 2;
        int y2 = 10;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}