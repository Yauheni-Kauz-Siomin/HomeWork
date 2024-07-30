package home_work_3.calcs.additional;

/*
7. Создать класс CalculatorWithCounterAutoComposite.
	7.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
        7.2 Внутри класса мы должны создавать поле хранящее объект класса калькулятор. Для примера можно
        использовать любой тип калькулятора. Я возьму для примера CalculatorWithMathCopy
	7.3 Инициализировать данное поле созданным (использовать new) внутри данного класса объектом калькулятора.
        7.4 Данный класс напрямую не умеют считать математику, он умеют делегировать расчёт математики калькулятору
        который сохранён в его поле.
	7.5 В классах должны присутствовать математические методы:
        7.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
        7.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
        7.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований
        данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
        7.7 Создать класс CalculatorWithCounterDelegateCompositeMain в котором будет точка входа (main метод).
        В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать
        выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода
        getCountOperation().
*/


import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {


    private CalculatorWithMathCopy calc = new CalculatorWithMathCopy();
    private long countOperation = 0;

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
