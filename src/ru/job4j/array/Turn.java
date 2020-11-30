package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        int temp = 0;
        int numbers = 0;
        for (int index = 0; index < array.length; index++) {
            temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
            numbers = array[1];
            array[1] = array[array.length - 2];
            array[array.length - 2] = numbers;
            break;
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
