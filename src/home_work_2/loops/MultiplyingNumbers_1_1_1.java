package home_work_2.loops;

import java.util.Scanner;

public class MultiplyingNumbers_1_1_1 {
    public static void main(String[] args) {
        dataInput();
        multiplaing();
    }


// метод проверки введнного числа
    public static long dataInput() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        if (scn.hasNextLong()) {
            long n = scn.nextLong();
            if (n < 0) {
                System.out.println("Введите положительное целое число!");
            } else {
                System.out.print("Результат вычисления равен: ");
            }
        } else {
            System.out.println("Введиете целочисленное число!");
        }
        return 0;
    }


/// метод для перемножения
    public static void multiplaing() {
        long multi = 1;
        long a = 5;
        while (a > 0) {
            multi = multi * a;
            a--;
        }
        System.out.println(multi);
    }
}