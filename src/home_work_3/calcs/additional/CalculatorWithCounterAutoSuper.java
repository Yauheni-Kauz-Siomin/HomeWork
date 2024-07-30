package home_work_3.calcs.additional;

/*
6. Создать класс CalculatorWithCounterAutoSuper.
	6.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
        6.2 Данный класс наследует класс CalculatorWithMathExtends.
	6.3 Данный класс переопределяет все методы полученные в результате наследования и в этих методах
	должен быть реализован механизм учёта их использования (учёт общий для всех методов класса), а вместо
	реализации математики при помощи ключевого слова super вызывает данный метод у родителя. Например вызвали метод plus(7, 3)
	который должен сложить два числа и вернуть результат сложения. Внутри метода plus() пишем реализацию учета, а после
	делаем вызов super.plus(7, 3). Использование super позволит вызвать реализацию из родительского класса.
        6.4 В классе должен быть метод long getCountOperation() который должен возвращать количество использований
        данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
        6.5 Создать класс CalculatorWithCounterAutoSuperMain в котором будет точка входа (main метод). В main методе
        требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из
        задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
*/

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {


        private long countOperation = 0;

    // геттер на подсчет количества операций
    public long getCountOperation() {
        return countOperation;
    }


    public double division(double a, double b) {
        countOperation++;
        return super.division(a, b);
    }

    public double multiplication(double a, double b) {
        countOperation++;
        return super.multiplication(a, b);
    }

    public double subtraction(double a, double b) {
        countOperation++;
        return super.subtraction(a, b);
    }

    public double addition(double a, double b) {
        countOperation++;
        return super.addition(a, b);
    }

    public double exponentiation(double a, int b) {
        countOperation++;
        return super.exponentiation(a, b);
    }

    public double absoluteValueOfNumber(double a) {
        countOperation++;
        return super.absoluteValueOfNumber(a);
    }

    public double sqrtMethod(double a) {
        countOperation++;
        return super.sqrtMethod(a);
    }
}


