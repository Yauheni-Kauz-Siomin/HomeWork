package home_work_3.runners;

// 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль.
// Внимание, знак "^" обозначает возведение в степень

public class WithoutCalculatorMain {
    public static void main(String[] args) {

        double a = (double) 28 / 5;
        double b = 4.1 + 15 * 7 + a * a;
        System.out.printf("%.2f\n", b);
        System.out.println(b);

    }
}

// Ответ в консоли 140.46 при округлении до двух цифр после запятой
// Ответ в консоли 140.45999999999998