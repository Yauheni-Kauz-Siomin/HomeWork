package home_work_2.loops;

import java.util.Scanner;

public class MultiplyingNumbers_1_2 {
    public static void main(String[] args) {
        checkAndMultiplyingNumbers();
    }

    // задачи  1.2.2 и 1.2.3 включены в методе


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
