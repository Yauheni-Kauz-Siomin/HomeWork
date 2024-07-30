package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {


    private long countOperation = 0;

    public CalculatorWithOperator getCalc1() {
        countOperation++;
        return calc1;
    }

    public CalculatorWithMathCopy getCalc2() {
        countOperation++;
        return calc2;
    }

    public CalculatorWithMathExtends getCalc3() {
        countOperation++;
        return calc3;
    }

    CalculatorWithOperator calc1;
    CalculatorWithMathCopy calc2;
    CalculatorWithMathExtends calc3;


    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calc1) {
        this.calc1 = calc1;
    }


    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calc2) {
        this.calc2 = calc2;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calc3) {
        this.calc3 = calc3;
    }

    public long getCountOperation() {
        return countOperation;

    }


}

