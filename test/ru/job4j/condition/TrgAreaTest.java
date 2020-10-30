package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrgAreaTest {

    @Test
    public void area1() {

        int expected = 5;
        int p = 6;
        int k = 2;
        double out = TrgArea.area(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void area2() {

        int expected = 5;
        int p = 4;
        int k = 2;
        double out = TrgArea.area(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}