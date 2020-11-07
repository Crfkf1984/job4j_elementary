package ru.job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int third) {
        int result = first;
        if (first > second) {

           return  first > third ? first : third;

        }
        if (second > first) {

            return second > third ? second : third;
            }
        if (third > first) {

            return third > second ? third : second;
        }

        return result;
    }
}
