package ru.job4j.condition;

public class Condition {

        public static double square(int p, int k) {

           double h = p / (2 * (k + 1));

           double L = h * k;

            double rsl = L * h;;
            return rsl;
        }

        public static void main(String[] args) {
            double result1 = Condition.square(4, 1);
            double result2 = Condition.square(6,2);
            System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
            System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
        }

}
