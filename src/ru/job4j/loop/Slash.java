package ru.job4j.loop;

public class Slash {

    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {

                boolean left = false;
                boolean right = false;

                if ((row + cell) % 2 == 0) {
                    left = true;
                }

                if (cell == size - 1 - cell) {
                    right = true;
                }
                    if (left) {
                        System.out.print("0");
                    } else if (right) {
                        System.out.print("0");
                    } else {
                        System.out.print(" ");
                    }
            }

            System.out.println();
        }
    }



    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
       System.out.println("Draw by 5");
        draw(5);
    }
}

    //число строк - 5. В первой строке нули ставим на позиции 0 и 4 (т.е. cell и size-1).
        //Во второй строке нули ставим на позиции 1 и 3 (т.е. cell и size - 1 - cell).
        //В третьей строке нули ставим на позицию 2 (cell = size - 1 - cell).
        //В четвертой строке на позиции 1 и 3 (т.е. cell и size - 1 - cell).
        //В пятой строке на позиции 0 и 4 (т.е. cell и size - 1 - cell).

    //Сравнивай элементы с этими индексами, наименьший вставляй в результирующий.
       // Увеличивай соответствующий индекс на один. Не забудь проверку на то, что входные массивы не закончились
    //заведи две переменные - одна будет считать индексы массива left, а другая - массива right