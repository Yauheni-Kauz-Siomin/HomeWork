package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoComposite calculator4 = new CalculatorWithCounterAutoComposite();

        double a = calculator4.exponentiation((calculator4.division(28, 5)), 2);
        double b = calculator4.addition(calculator4.multiplication(15, 7), a);
        System.out.println(calculator4.addition(4.1, b));
        System.out.println(calculator4.getCountOperation());
    }
}
