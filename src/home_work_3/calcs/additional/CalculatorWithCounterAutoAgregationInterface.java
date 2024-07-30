package home_work_3.calcs.additional;

/*
11. Создать класс CalculatorWithCounterAutoAgregationInterface.
	11.1 Внутри класса нельзя создавать объекты (использовать new), можно пользоваться только тем что передал
	вам пользователь вашего класса.
        11.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
        11.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
	11.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики калькулятору
	который передали в конструктор
	11.5 В классе должны присутствовать все методы объявленные в интерфейсе.
	11.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований
	данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
        11.7 Создать класс CalculatorWithCounterAutoCompositeInterfaceMain в котором будет точка входа (main метод).
        В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать
        выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
*/


import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {

    private ICalculator calculator;

    private long countOperation = 0;


    // конструктор калькулятора
    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator) {
        this.calculator = calculator;
    }
    // геттер на подсчет количества операций
    public long getCountOperation() {
        return countOperation;
    }

    public double division(double a, double b) {
        countOperation++;
        return calculator.division(a, b);
    }

    public double multiplication(double a, double b) {
        countOperation++;
        return calculator.multiplication(a, b);
    }

    public double subtraction(double a, double b) {
        countOperation++;
        return calculator.subtraction(a, b);
    }

    public double addition(double a, double b) {
        countOperation++;
        return calculator.addition(a, b);
    }

    public double exponentiation(double a, int b) {
        countOperation++;
        return calculator.exponentiation(a, b);
    }

    public double absoluteValueOfNumber(double a) {
        countOperation++;
        return calculator.absoluteValueOfNumber(a);
    }

    public double sqrtMethod(double a) {
        countOperation++;
        return calculator.sqrtMethod(a);
    }

}

