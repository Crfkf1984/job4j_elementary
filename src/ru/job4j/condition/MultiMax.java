package ru.job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int third) {
        int result = first;

        if (first > second) {

            int rsl = first > second ? first : second;
            rsl = rsl > third ? rsl : third;

            return rsl;

        }

            return result;
    }
}
