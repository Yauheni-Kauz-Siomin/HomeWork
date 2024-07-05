
/*1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль.
Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
        1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
        1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
        1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число*/


package home_work_2.loops;

import java.util.Scanner;

public class MultiplyingNumbers_1_2 {
    public static void main(String[] args) {
        checkAndMultiplyingNumbers();
    }

    // задачи  1.2.2 и 1.2.3 включены в методе

    // как развернуть при вывоводе пока не сообразил, получается вывод в обратном порядке


    public static void checkAndMultiplyingNumbers() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");

        if (scn.hasNextLong()) {
            long b = scn.nextLong();
            if (b < 0) {
                System.out.println("Введено отрицательное число, повторите ввод!");
            } else {
                long multi = 1;
                while (b != 0) {
                    multi = multi * (b % 10);
                    if (b / 10 == 0) {
                        System.out.print(b);
                    } else {
                        System.out.print((b % 10) + " * ");
                    }
                    b /= 10;
                }
                System.out.println(" = " + multi);
            }
        } else if (scn.hasNextDouble()) {
            System.out.println("Введено не целое число, повторите ввод!"); // работает, если вводить дробное число через запятую
        } else {
            System.out.println("Введено НЕ число, повторите ввод!");
        }
    }
}
