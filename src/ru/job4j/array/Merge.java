package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i <= left.length - 1; i++) {
            rsl[i] = left[i];
        }

        for (int index = 0; index <= right.length - 1; index++) {
            rsl[index + left.length] = right[index];
        }
        for (int j = 0; j < rsl.length - 1; j++) {
            for (int a = 0; a < rsl.length - 2; a++) {
                if (rsl[a] > rsl[a + 1]) {
                    int temp = rsl[a];
                    rsl[a] = rsl[a + 1];
                    rsl[a + 1] = temp;

                }
            }
        }
        return rsl;
    }

}
