package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

//4.1+15*7+(28/5)^2


public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {

        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();

        double a = calculator.exponentiation((calculator.division(28, 5)), 2);
        double b = calculator.addition(calculator.multiplication(15, 7), a);
        System.out.println(calculator.addition(4.1, b));


    }
}
