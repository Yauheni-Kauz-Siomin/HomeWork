package home_work_3.runners;


//4.1+15*7+(28/5)^2

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {

        CalculatorWithMathExtends calculator1 = new CalculatorWithMathExtends();

        double a = calculator1.exponentiation((calculator1.division(28, 5)), 2);
        double b = calculator1.addition(calculator1.multiplication(15, 7), a);
        System.out.println(calculator1.addition(4.1, b));


    }
}
