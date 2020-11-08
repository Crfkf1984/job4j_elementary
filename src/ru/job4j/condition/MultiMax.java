package ru.job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int third) {
        int result = first;
        if (first > second) {
            int rsl = first > second ? first : second;
            rsl = rsl > third ? rsl : third;

            return rsl;

        }
        if (second > first) {

            int rsl = second > first ? second : first;
            rsl = rsl > third ? rsl : third;

            return rsl;

            }
        if (third > first) {

            int rsl = third > first ? third : first;
            rsl = rsl > second ? rsl : second;

            return rsl;
        }

        return result;
    }
}
