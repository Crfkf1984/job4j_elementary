package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int res = money - price;

            for (int i = size; i < coins.length; i++) {
                while (res > coins[i]) {
                    rsl[i] = coins[i];
                    res = res - coins[i];
                }
                size += 1;
            }

        return Arrays.copyOf(rsl, size);
    }
}
