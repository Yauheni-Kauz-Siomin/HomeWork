package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {


        CalculatorWithCounterAutoSuper calculator3 = new CalculatorWithCounterAutoSuper();
        double a = calculator3.exponentiation((calculator3.division(28, 5)), 2);
        double b = calculator3.addition(calculator3.multiplication(15, 7), a);

        System.out.println(calculator3.addition(4.1, b));

        System.out.println(calculator3.getCountOperation());


    }
}
