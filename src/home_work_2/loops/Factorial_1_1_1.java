
/* 1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе. Есть нюанс с переполнением,
можно добавить проверки и сообщения пользователю.
        Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
    	1.1.1. Используя только цикл */



package home_work_2.loops;

import java.util.Scanner;

public class Factorial_1_1_1 {
    public static void main(String[] args) {
        checkAndFactorial();
    }

    public static void checkAndFactorial() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        if (scn.hasNextLong()) {
            long b = scn.nextLong();
            if (b < 0) {
                System.out.println("Введено отрицательное число, повторите ввод!");
            } else {
                System.out.print("Результат вычисления равен: ");
                long multi = 1;
                while (b > 0) {
                    multi = multi * b;

                    if (b - 1 == 0) {
                        System.out.print(b);
                    } else {
                        System.out.print(b + " * ");
                    }
                    b--;
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