package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void max1() {

        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void max2() {

        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void max3() {

        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }
}