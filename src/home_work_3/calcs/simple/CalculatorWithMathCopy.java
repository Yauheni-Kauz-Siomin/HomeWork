package home_work_3.calcs.simple;

//3. Создать класс CalculatorWithMathCopy.
//	3.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
//        3.2 В классе должны присутствовать математические методы:
//        3.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
//        Скопировать базовые математические операции из CalculatorWithOperator.
//        3.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
//        Данные методы должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.
//        3.3 Создать класс CalculatorWithMathCopyMain в котором будет точка входа (main метод).
//        В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра
//        посчитать выражения из задания 1. Вывести в консоль результат.


import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    public double division(double a, double b) {
        return a / b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double addition(double a, double b) {
        return a + b;
    }

    public double exponentiation(double a, int b) {
        return Math.pow(a, b);      //  возведение числа а в степень b при помощи библиотеки Math
    }

    public double absoluteValueOfNumber(double a) {
        return Math.abs(a);        //  модуль числа при помощи библиотеки Math
    }

    public double sqrtMethod(double a) {
        return Math. sqrt(a);      //    Корень из числа при помощи библиотеки Math
    }

}



