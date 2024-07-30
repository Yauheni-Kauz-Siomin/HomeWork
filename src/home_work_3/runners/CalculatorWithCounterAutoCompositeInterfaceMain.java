package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {

        ICalculator calculator = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregationInterface calculator10 = new CalculatorWithCounterAutoAgregationInterface(calculator);

        double a = calculator10.exponentiation((calculator10.division(28, 5)), 2);
        double b = calculator10.addition(calculator10.multiplication(15, 7), a);
        System.out.println(calculator10.addition(4.1, b));
        System.out.println(calculator10.getCountOperation());
    }
}
