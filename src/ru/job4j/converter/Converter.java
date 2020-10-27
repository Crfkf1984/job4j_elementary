package ru.job4j.converter;

public class Converter {

    public static  int rubleToEuro(int value) {

    int rsl = value / 70;

    return rsl;

    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {

        int euro = Converter.rubleToEuro(140);
        int expected = 2;
        boolean passed = expected == euro;

        int dollar = Converter.rubleToDollar(200);
        int resdollar = 5;
        boolean passed1 = resdollar == dollar;

        System.out.println("140 rubles are " + euro + " euro and this " + passed);
        System.out.println("200 rubles are " + dollar + " dollar and this " + passed1);

    }
}
