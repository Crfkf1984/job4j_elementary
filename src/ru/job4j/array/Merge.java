package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {

        int[] rsl = new int[left.length + right.length];
        int leftPoint = 0;
        int rightPoint = 0;
        int rslPoint = 0;
        while (leftPoint + rightPoint != rsl.length) {
            if (leftPoint != left.length && rightPoint != right.length) {
                rsl[rslPoint++] = left[leftPoint] < right[rightPoint] ? left[leftPoint++] : right[rightPoint++];
            } else if (leftPoint != left.length) {
                rsl[rslPoint++] = left[leftPoint++];
            } else {
                rsl[rslPoint++] = right[rightPoint++];
            }
        }
        return rsl;
    }
}













//        int[] rsl = new int[left.length + right.length];
//        int size = 0;
//        int positionleft = 0;
//        int positionright = 0;
//        for (int i = 0; i <= left.length + right.length - 1; i++) {
//            if (i > left.length) {
//                rsl[i] = right[i - size];
//            } else if (left[i - positionleft] < right[i - positionright]) {
//                size++;
//                rsl[i] = left[i - positionleft];
//                positionright++;
//            } else {
//                rsl[i] = right[i - positionright];
//                positionleft++;
//            }
//        }
//
//        return rsl;
//    }

//}
