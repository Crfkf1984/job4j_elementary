package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenSecondMax4() {
        int result = MultiMax.max(4, 1, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMax3() {
        int result = MultiMax.max(1, 3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenSecondMax5() {
        int result = MultiMax.max(1, 4, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenSecondMaxall() {
        int result = MultiMax.max(6, 6, 6);
        assertThat(result, is(6));
    }
}