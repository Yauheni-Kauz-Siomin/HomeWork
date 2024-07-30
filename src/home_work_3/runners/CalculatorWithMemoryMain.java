package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithOperator;

//  4.1 + 15 * 7 + (28 / 5) ^ 2


public class CalculatorWithMemoryMain {
    public static void main(String[] args) {

        CalculatorWithOperator calcOperator = new CalculatorWithOperator();
        CalculatorWithMemory calcMemory = new CalculatorWithMemory(calcOperator);

        double a =  calcMemory.exponentiation(( calcMemory.division(28, 5)), 2);
        calcMemory.save();
        double b = calcMemory.addition(calcMemory.multiplication(15, 7),calcMemory.load());
        calcMemory.save();
        System.out.println(calcMemory.addition(4.1, calcMemory.load()));

    }
}
