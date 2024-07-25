package home_work_3.runners;



import static home_work_3.calcs.simple.CalculatorWithOperator.absoluteValueOfNumber;
import static home_work_3.calcs.simple.CalculatorWithOperator.exponentiation;
import static home_work_3.calcs.simple.CalculatorWithOperator.sqrtMethod;

public class Main {
    public static void main(String[] args) {




       double b =  exponentiation(-4.51, 4);
        System.out.println(b);

        double c =  absoluteValueOfNumber(15);
        System.out.println(c);

        double d = sqrtMethod(1.5);
        System.out.println(d);
    }
}
