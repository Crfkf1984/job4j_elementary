package ru.job4j.condition;

public class TrgArea {

    public static double area(int p,int k) {

        int  a = 2;
        int b = 2;
        int c = 2;
        double s = p * (p - a) * (p - b) * (p - c);
        double rsl = Math.sqrt(s);
        return rsl;
    }

    public static void main(String[] args) {

        int p = 4;
        int k = 2;
        double rsl = TrgArea.area(p,k);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
