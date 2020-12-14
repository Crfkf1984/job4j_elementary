package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] == null) {
                int point = index; /* указатель на null ячейку. */
                for (int i = point; i < array.length - 1; i++) {
                    SwitchArray.swap(array, i, i + 1);

                }
             if (array[index] == null) {
                 String item =  null;
                 array[index] = array[index + 1];
                 array[array.length - 1] = item;
             }

    }
            System.out.print(array[index] + " ");
        }
           return array;
}
    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }

}
