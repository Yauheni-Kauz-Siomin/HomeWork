package home_work_3.calcs.additional;

/*
12*. Создать CalculatorWithMemory используя аналогичные принципы построения класса CalculatorWithCounterAutoAgregationInterface.
        12.1 Данный калькулятор предназначен для того чтобы расширить возможности калькулятора и обеспечить его
        дополнительной функцией памяти. В принципе работает как калькулятор из реальной жизни.
        12.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
        12.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
	12.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики калькулятору
	 который передали в конструктор
	12.5 В классе должны присутствовать математические методы:
        12.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
        12.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
        12.6 Функция памяти работает через методы:
        12.6.1 Записать в память результат выполнения последнего вызванного метода. У данного метода не должно
        быть параметров. Данный метод вызывается непосредтвенно пользователем, а не автоматический. Пример void save();
		12.6.2 Получить из памяти записанное значение. При получении записи из памяти память стирается, при записи
		 нового значения память перезаписывается. Данный метод вызывается непосредтвенно пользователем, а не
		 автоматический. Пример double load();
	12.7 В этом калькуляторе НЕТ ФУНКЦИИ ПОДСЧЁТА количества использований
	12.8 Создать класс CalculatorWithMemoryMain в котором будет точка входа (main метод). В main методе требуется
	создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
	Вывести в консоль результат. В мэйне запрещается использование переменных для хранения значений участвующих
	в просчёте, вместо них необходимо использовать метод save, а также результатов работы методов калькулятора,
	 можно использовать только литералы и метод получения из памяти записанного значения. Пример:
*/


import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory {

    private ICalculator calculator;
    private double memory;
    private double lastResult;

    // конструктор калькулятора
    public CalculatorWithMemory(ICalculator calculator) {
        this.calculator = calculator;
    }
    // метод записи в память в память результат выполнения последнего вызванного метода
    public void save() {
        memory = lastResult;
    }
    // Метод получения  из памяти записанного значения с очиской памяти
    public double load() {
        double temporary = memory;
        memory = 0;
        return temporary;
    }


    public double division(double a, double b) {
        lastResult = calculator.division(a, b);
        return lastResult;
    }

    public double multiplication(double a, double b) {
        lastResult = calculator.multiplication(a, b);
        return lastResult;
    }

    public double subtraction(double a, double b) {
        lastResult = calculator.subtraction(a, b);
        return lastResult;
    }

    public double addition(double a, double b) {
        lastResult = calculator.addition(a, b);
        return lastResult;
    }

    public double exponentiation(double a, int b) {
        lastResult = calculator.exponentiation(a, b);
        return lastResult;
    }

    public double absoluteValueOfNumber(double a) {
        lastResult = calculator.absoluteValueOfNumber(a);
        return lastResult;
    }

    public double sqrtMethod(double a) {
        lastResult = calculator.sqrtMethod(a);
        return lastResult;
    }
}

