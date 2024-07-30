package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {


    private long countOperation = 0;

    public long getCountOperation() {
        return countOperation;
    }


    public double division(double a, double b) {
        countOperation++;
        return super.division(a, b);
    }

    public double multiplication(double a, double b) {
        countOperation++;
        return super.multiplication(a, b);
    }

    public double subtraction(double a, double b) {
        countOperation++;
        return super.subtraction(a, b);
    }

    public double addition(double a, double b) {
        countOperation++;
        return super.addition(a, b);
    }

    public double exponentiation(double a, int b) {
        countOperation++;
        return super.exponentiation(a, b);
    }

    public double absoluteValueOfNumber(double a) {
        countOperation++;
        return super.absoluteValueOfNumber(a);
    }

    public double sqrtMethod(double a) {
        countOperation++;
        return super.sqrtMethod(a);
    }
}


