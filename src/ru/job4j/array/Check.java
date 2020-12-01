package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
            if ((data[index] == data[data.length - 2]) && (data[data.length - 1] == data[index])) {
               result = true;
            } else {
                result = false;
             }

        }
        return result;
    }
}
