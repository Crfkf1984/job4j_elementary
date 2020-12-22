package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int positionleft = 0;
        int positionright = 0;
        for (int i = 0; i < left.length + right.length; i++) {
            if (i >= left.length) {
                rsl[i] = right[i - positionright];
                //positionleft++;
            } else if (left[i - positionleft] < right[i - positionright]) {
                rsl[i] = left[i - positionleft];
                positionright++;
            } else {
                rsl[i] = right[i - positionright];
                positionleft++;
            }
        }

        return rsl;
    }

}
