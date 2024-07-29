package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {


    private CalculatorWithMathCopy calc = new CalculatorWithMathCopy();
    private long countOperation = 0;


    public CalculatorWithMathCopy getCalc() {
        return calc;
    }

    public long getCountOperation() {
        return countOperation;
    }


    public double division(double a, double b) {
        countOperation++;
        return calc.division(a, b);
    }

    public double multiplication(double a, double b) {
        countOperation++;
        return calc.multiplication(a, b);
    }

    public double subtraction(double a, double b) {
        countOperation++;
        return calc.subtraction(a, b);
    }

    public double addition(double a, double b) {
        return calc.addition(a, b);
    }

    public double exponentiation(double a, int b) {
        countOperation++;
        return calc.exponentiation(a, b);
    }

    public double absoluteValueOfNumber(double a) {
        return calc.absoluteValueOfNumber(a);
    }

    public double sqrtMethod(double a) {
        return calc.sqrtMethod(a);
    }

}
