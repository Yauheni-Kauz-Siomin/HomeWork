package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory {

    ICalculator calculator;
    private double memory;
    private double lastResult;


    public CalculatorWithMemory(ICalculator calculator) {
        this.calculator = calculator;
    }

    public void save() {
        memory = lastResult;
    }

    public double load() {
        double temporary = memory;
        memory = 0;
        return temporary;
    }


    public double division(double a, double b) {
        lastResult = calculator.division(a, b);
        return lastResult;
    }

    public double multiplication(double a, double b) {
        lastResult = calculator.multiplication(a, b);
        return lastResult;
    }

    public double subtraction(double a, double b) {
        lastResult = calculator.subtraction(a, b);
        return lastResult;
    }

    public double addition(double a, double b) {
        lastResult = calculator.addition(a, b);
        return lastResult;
    }

    public double exponentiation(double a, int b) {
        lastResult = calculator.exponentiation(a, b);
        return lastResult;
    }

    public double absoluteValueOfNumber(double a) {
        lastResult = calculator.absoluteValueOfNumber(a);
        return lastResult;
    }

    public double sqrtMethod(double a) {
        lastResult = calculator.sqrtMethod(a);
        return lastResult;
    }
}

