package home_work_3.calcs.additional;

/*
9. Создать класс CalculatorWithCounterAutoChoiceAgregation.
	9.1 Все методы объявленные в данных классах НЕ статические (не имеют модификатор static).
        9.2 В данном классе должны быть следующие варианты конструктора:
        9.2.1 Принимающий объект типа CalculatorWithOperator
		9.2.2 Принимающий объект типа CalculatorWithMathCopy
		9.2.3 Принимающий объект типа CalculatorWithMathExtends
	9.4 Данные класс также не умеет напрямую считать математику, они умеют делегировать расчёт математики калькулятору
	 который передали в конструктор.
	9.5 В классах должны присутствовать математические методы:
        9.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
        9.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
        9.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований
        данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
        9.7 Создать класс CalculatorWithCounterDelegateChoiceAgregationMain в котором будет точка входа (main метод).
        В main методе требуется:
        9.7.1 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithOperator и используя
        методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результаты посчитанных
        выражений и результат метода getCountOperation().
        9.7.2 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithMathCopy и используя
        методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результаты посчитанных
        выражений и результат метода getCountOperation().
        9.7.3 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithMathExtends и
        используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результаты
        посчитанных выражений и результат метода getCountOperation().
*/

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {

    private CalculatorWithOperator calc1;
    private CalculatorWithMathCopy calc2;
    private CalculatorWithMathExtends calc3;
    private long countOperation = 0;

    // конструктор калькулятора
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calc1) {
        this.calc1 = calc1;
    }

    // конструктор калькулятора
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calc2) {
        this.calc2 = calc2;
    }
    // конструктор калькулятора
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calc3) {
        this.calc3 = calc3;
    }
    // геттер на подсчет количества операций
    public long getCountOperation() {
        return countOperation;

    }
    // геттер калькулятора
    public CalculatorWithOperator getCalc1() {
        countOperation++;
        return calc1;
    }
    // геттер калькулятора
    public CalculatorWithMathCopy getCalc2() {
        countOperation++;
        return calc2;
    }
    // геттер калькулятора
    public CalculatorWithMathExtends getCalc3() {
        countOperation++;
        return calc3;
    }


}

