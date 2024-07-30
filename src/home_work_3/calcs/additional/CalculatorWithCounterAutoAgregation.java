package home_work_3.calcs.additional;

/*
8. Создать класс CalculatorWithCounterAutoAgregation.
	8.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
        8.2 Внутри класса мы должны создавать поле хранящее объект класса калькулятор. Для примера можно
        использовать любой тип калькулятора. Я возьму для примера CalculatorWithMathCopy
	8.3 Для инициализации данного поля требуется использовать конструктор в который будут передавать
	CalculatorWithMathCopy.
        8.4 Данный класс напрямую не умеют считать математику, он умеют делегировать расчёт математики калькулятору
        который сохранён в его поле.
	8.5 В классах должны присутствовать математические методы:
        8.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
        8.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
        8.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований
        данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
        8.7 Создать класс CalculatorWithCounterDelegateAgregationMain в котором будет точка входа (main метод).
        В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать
        выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода
        getCountOperation().
*/

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {

    private CalculatorWithMathCopy calc = new CalculatorWithMathCopy();

    private long countOperation = 0;

     // конструктор калькулятора

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calc = calc;
    }

    // геттер на подсчет количества операций

    public long getCountOperation() {
        return countOperation;
    }

    public double division(double a, double b) {
        countOperation++;
        return calc.division(a, b);
    }

    public double multiplication(double a, double b) {
        countOperation++;
        return calc.multiplication(a, b);
    }

    public double subtraction(double a, double b) {
        countOperation++;
        return calc.subtraction(a, b);
    }

    public double addition(double a, double b) {
        countOperation++;
        return calc.addition(a, b);
    }

    public double exponentiation(double a, int b) {
        countOperation++;
        return calc.exponentiation(a, b);
    }

    public double absoluteValueOfNumber(double a) {
        countOperation++;
        return calc.absoluteValueOfNumber(a);
    }

    public double sqrtMethod(double a) {
        countOperation++;
        return calc.sqrtMethod(a);
    }

}





