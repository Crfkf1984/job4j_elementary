package ru.job4j.loop;

public class Mortgage {

    public static int year(double amount, int salary, double percent) {

        int year = 0;
        amount = amount + amount * (percent / 100);

        while (salary <= amount) {

            amount -= salary;
           amount += amount * (percent / 100);

           year += 1;

        }

        while (salary > amount) {

             year += 1;
            return year;
        }

        return year;
    }
}

   // Цикл сделайте такой:

       // while (amount > 0) {

        //а значения будете записывать в саму же переменную amount , т.е. постоянно ее переназначать

       // amount += amount * (percent / 100);

       // amount -= salary;
