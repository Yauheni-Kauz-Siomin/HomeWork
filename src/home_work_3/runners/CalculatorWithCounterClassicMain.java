package home_work_3.runners;

//4.1+15*7+(28/5)^2

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {

        CalculatorWithCounterClassic calculator2 = new CalculatorWithCounterClassic();

        double a = calculator2.exponentiation((calculator2.division(28, 5)), 2);
        calculator2.incrementCountOperation();
        double b = calculator2.addition(calculator2.multiplication(15, 7), a);
        calculator2.incrementCountOperation();
        System.out.println(calculator2.addition(4.1, b));
        calculator2.incrementCountOperation();
        System.out.println(calculator2.getCountOperation());

    }
}
