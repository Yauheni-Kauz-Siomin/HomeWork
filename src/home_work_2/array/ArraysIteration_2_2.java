package home_work_2.array;

/**
 * 2.2 Создать класс ArraysIteration. В этом классе написать перебор (итерирование) массива при помощи do....while,
 * while, for, foreach. Вызывая ранее созданный метод arrayFromConsole (ArraysUtils.arrayFromConsole()) получить
 * массив. Все задачи в одном классе, в отдельных методах, в каждом методе используется 4 разных цикла.
 * Должно получиться 3 метода:
 */

import java.util.Arrays;

import static home_work_2.utils.ArraysUtils.arrayFromConsole;

public class ArraysIteration_2_2 {

    public static void main(String[] args) {
        consoleOutput_2_2_1();
        consoleOutputEverySecond_2_2_2();
//
    }

// 2.2.1. Вывести все элементы в консоль.

    public static void consoleOutput_2_2_1() {

        int[] container = arrayFromConsole();
        System.out.println("Первоначальный масив: " + Arrays.toString(container));

        int a = 0;
        do {
            System.out.print(container[a] + "  ");
            a++;
        } while (a < container.length);
        System.out.println();

        int b = 0;
        while (b < container.length) {
            int element = container[b];
            System.out.print(element + "  ");
            b++;
        }
        System.out.println();

        for (int i = 0; i < container.length; i++) {
            int element = container[i];
            System.out.print(element + "  ");
        }
        System.out.println();

        for (int element : container) {
            System.out.print(element + "  ");
        }
        System.out.println();
    }

// 2.2.2. Вывести каждый второй элемент массива в консоль.

    public static void consoleOutputEverySecond_2_2_2() {
        int[] container = arrayFromConsole();
        System.out.println("Первоначальный масив: " + Arrays.toString(container));

        int a = 0;
        do {
            if (a % 2 != 0) {
                System.out.print(container[a] + "  ");
            }
            a++;
        } while (a < container.length);
        System.out.println();

        int b = 0;
        while (b < container.length) {
            int element = container[b];
            if (b % 2 != 0) {
                System.out.print(element + "  ");
            }
            b++;
        }
        System.out.println();

        for (int i = 0; i < container.length; i++) {
            int element = container[i];
            if (i % 2 != 0) {
                System.out.print(element + "  ");
            }
        }
        System.out.println();


        for (int element : container) {
            if (element % 2 != 0) {
                System.out.print(element + "  ");
            }
        }
    }
}
// 2.2.3. Вывести все элементы массива в консоль в обратном порядке.

 //   public static void arrayReverse2_2_3() {



