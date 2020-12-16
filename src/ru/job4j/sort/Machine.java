package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int res = money - price;
        while (res > 0) {
            for (int i = size; i < coins.length; i++) {
                rsl[i] = coins[i];
                res = res - coins[i];
                size += 1;
                break;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
