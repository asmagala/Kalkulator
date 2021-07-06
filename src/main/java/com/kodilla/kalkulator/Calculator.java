package com.kodilla.kalkulator;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public static void main(String args[]) {
        Calculator calc = new Calculator();
        double a = 17.2554;
        double b = 15.44;
        System.out.println("Result of adding " + a + " and " + b + " = " + calc.add(a, b));
        System.out.println("Result of subtracting " + a + " and " + b + " = " + calc.subtract(a, b));
    }
}
