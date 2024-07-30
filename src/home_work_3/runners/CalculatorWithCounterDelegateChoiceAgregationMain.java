package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

        CalculatorWithOperator calculator1 = new CalculatorWithOperator();
        CalculatorWithCounterAutoChoiceAgregation calculator7 = new CalculatorWithCounterAutoChoiceAgregation(calculator1);

        double a = calculator7.getCalc1().exponentiation((calculator7.getCalc1().division(28, 5)), 2);
        double b = calculator7.getCalc1().addition(calculator7.getCalc1().multiplication(15, 7), a);
        System.out.println(calculator7.getCalc1().addition(4.1, b));
        System.out.println(calculator7.getCountOperation());


        CalculatorWithMathCopy calculator2 = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoChoiceAgregation calculator8 = new CalculatorWithCounterAutoChoiceAgregation(calculator2);


        a = calculator8.getCalc2().exponentiation((calculator8.getCalc2().division(28, 5)), 2);
        b = calculator8.getCalc2().addition(calculator8.getCalc2().multiplication(15, 7), a);
        System.out.println(calculator8.getCalc2().addition(4.1, b));
        System.out.println(calculator8.getCountOperation());



        CalculatorWithMathExtends calculator3 = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoChoiceAgregation calculator9 = new CalculatorWithCounterAutoChoiceAgregation(calculator3);


        a = calculator9.getCalc3().exponentiation((calculator9.getCalc3().division(28, 5)), 2);
        b = calculator9.getCalc3().addition(calculator9.getCalc3().multiplication(15, 7), a);
        System.out.println(calculator9.getCalc3().addition(4.1, b));
        System.out.println(calculator9.getCountOperation());

    }
}
