package ru.job4j.loop;

public class Mortgage {

    public static int year(int amount, int salary, double percent) {

        int year = 0;
        double wsego =  amount + amount * (percent / 100);

        while (salary <= wsego) {

           double ostatok = wsego - salary;
           double rsl = ostatok + ostatok * (percent / 100);
           wsego = rsl;

           year += 1;

        }

        while (salary > wsego) {

             year += 1;
            return year;
        }

        return year;
    }
}
