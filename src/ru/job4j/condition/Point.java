package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2){

        int wichestx = x2 - x1;
        int wichesty = y2 - y1;

//        Math.pow(wichestx,2);
//        Math.pow(wichesty,2);

        double sloschenie = Math.pow(wichestx,2) + Math.pow(wichesty,2);


        double rsl = Math.sqrt(sloschenie);
        return rsl;

    }

    public static void main(String[] args){


        double result = Point.distance(2, 3, 4, 5);
        double result1 = Point.distance(5,6,7,8);
        double result2 = Point.distance(8,9,10,11);
        System.out.println("result (2, 3) to (4, 5) " + result);
        System.out.println("result (5, 6) to (7, 8) " + result1);
        System.out.println("result (5, 6) to (7, 8) " + result2);

    }
}
