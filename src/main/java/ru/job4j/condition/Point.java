package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rs1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rs1;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        System.out.println("result (0,0) to (2,0) " + result1);
        double result2 = Point.distance(3, 5, 9, 9);
        System.out.println("result (3,5) to (9,9) " + result2);
        double result3 = Point.distance(2, 2, 4, 4);
        System.out.println("result (2,2) to (4,4) " + result3);
    }
}
