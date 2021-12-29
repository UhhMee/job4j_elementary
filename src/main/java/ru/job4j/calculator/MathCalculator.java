package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumDiffAndDiv(double x, double y) {
        return diff(x, y) + div(x, y);
    }

    public static double sumAllOperations(double x, double y) {
        return sum(x, y) + multiply(x, y) + diff(x, y) + div(x, y);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Сумма операций (diff и div): " + sumDiffAndDiv(50, 30));
        System.out.println("Сумма всех операций: " + sumAllOperations(5, 2));
    }
}
