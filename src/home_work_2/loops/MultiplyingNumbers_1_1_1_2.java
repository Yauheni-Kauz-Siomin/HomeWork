package home_work_2.loops;

import java.util.Scanner;

public class MultiplyingNumbers_1_1_1_2 {

    public static void main(String[] args) {
        dataInput();
    }

    public static long dataInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        if (scanner.hasNextLong()) {
            long n = scanner.nextLong();
            if (n < 0) {
                System.out.println("Введено отрицательное число! Повторите ввод ещё раз!");
            } else {
                System.out.print("Результат вычисления равен: ");
                long multi = 1;
                long a = n;
                while (a > 0) {
                    multi = multi * a;
                    a--;
                }
                System.out.println(multi);
            }
        } else {
            System.out.println("Введено не целое число либо другие символы! Повторите ввод еще раз!");

        }
        return 0;

    }
}

