package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {

    ICalculator calculator;


    private long countOperation = 0;


    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator) {
        this.calculator = calculator;
    }

    public long getCountOperation() {
        return countOperation;
    }

    public double division(double a, double b) {
        countOperation++;
        return calculator.division(a, b);
    }

    public double multiplication(double a, double b) {
        countOperation++;
        return calculator.multiplication(a, b);
    }

    public double subtraction(double a, double b) {
        countOperation++;
        return calculator.subtraction(a, b);
    }

    public double addition(double a, double b) {
        countOperation++;
        return calculator.addition(a, b);
    }

    public double exponentiation(double a, int b) {
        countOperation++;
        return calculator.exponentiation(a, b);
    }

    public double absoluteValueOfNumber(double a) {
        countOperation++;
        return calculator.absoluteValueOfNumber(a);
    }

    public double sqrtMethod(double a) {
        countOperation++;
        return calculator.sqrtMethod(a);
    }

}

