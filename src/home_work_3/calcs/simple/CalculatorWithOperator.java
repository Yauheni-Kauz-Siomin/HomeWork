package home_work_3.calcs.simple;

/*
2. Создать класс CalculatorWithOperator.
	2.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
        2.2 В классе должны присутствовать математические методы:
        2.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение)
        каждый из этих методов должен принимать два параметра (определитесь с их типами) и
        должны возвращать результат (определиться с возвращаемым типом результата) при помощи ключевого слово return.
        2.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Квадратный корень из числа).
        2.3 В методах можно использовать любые арифметические операторы.
	2.4 Использование библиотеки Math ЗАПРЕЩЕНО! (кроме извлечения корня). Если у Вас плохо с математикой,
	то для реализации метода "Квадратный корень из числа" можно воспользоваться библиотекой Math.
        2.5 Создать класс CalculatorWithOperatorMain в котором будет точка входа (main метод).
        В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
*/

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator extends CalculatorWithMathCopy implements ICalculator {

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
        double result = 1;
        for (int i = 0; i < b; i++) {
            result = result * a;

        }
        return result;
    }

    public double absoluteValueOfNumber(double a) {
        if (a < 0) {
            a = a * (-1);
        }
        return a;
    }

    public double sqrtMethod(double a) {
        if (a == 0) {
            return 0;
        } else if (a == 1){
            return 1;
        }
        double b = 1;
        double c = 1;
        double step = 0.00000001;
        while ((b * c) <= a) {
            b += step;
            c += step;
        }
        return b;
    }

}
