package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {

        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index ];
            array[index ] = array[array.length - index - 1];
            array[array.length - index  - 1] = temp;
        }
        return array;
    }

    public static int numberschetn(int[] array) {
        int temp = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 == 0) {
               temp += 1;
            }

        }
        return temp;
    }

    public static int numbersnechetn(int[] array) {
        int temp = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 != 0) {
                temp += 1;
            }

        }
        return temp;
    }
}
