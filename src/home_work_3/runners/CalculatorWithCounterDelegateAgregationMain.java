package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregation calculator5 = new CalculatorWithCounterAutoAgregation();
        double a = calculator5.exponentiation((calculator5.division(28, 5)), 2);
        double b = calculator5.addition(calculator5.multiplication(15, 7), a);
        System.out.println(calculator5.addition(4.1, b));
        System.out.println(calculator5.getCountOperation());
    }
}
