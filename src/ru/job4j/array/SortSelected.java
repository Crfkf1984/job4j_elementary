package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
//        int temp = 0;
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
//            for (int j = 0 + 1; j < data.length; j++) {
//             if (data[j] < min) {
//                 temp = j;
//                 min = data[j];
//             }
//            }
            data[index] = data[i];
            data[i] = min;
        }
        return data;
        }
    }