package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int i = 0; i < array.length; i++) {
            for (int a = 0; a < array[i].length; a++) {
               rsl += array[i][a];
            }
        }
        return rsl;
    }
}
