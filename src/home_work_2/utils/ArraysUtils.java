package home_work_2.utils;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 2.1. Создать класс ArraysUtils. В этом классе не должно быть main метода. В этом классе написать следующие методы:
 * 2.1.1. Написать метод public static int[] arrayFromConsole(). Данный метод размер массива и каждый его элемент
 * запрашивает у пользователя через консоль.
 *  * 2.1.2. Написать метод public static int[] arrayRandom(int size, int maxValueExclusion). Данный метод принимает два
 *  * аргумента. Первый (size) указывает размер массива который мы хотим получить. Второй (maxValueExclusion) указывает
 *  * до какого числа генерировать рандомные числа.
 *  * 2.1.2.1. Пример в отдельном классе с main. int[] container = arrayRandom(5, 100). Результат:
 *  * В методе arrayRandom будет создан массив размером 5 с числами от 0 до 99 (использовать класс Random) и
 *  * сохранён в переменную container.
 *  */


public class ArraysUtils {

    public static int[] arrayFromConsole() {
        Scanner scn1 = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int lenArr = scn1.nextInt();
        int[] container1 = new int[lenArr];
        for (int i = 0; i < container1.length; i++) {
            Scanner scn2 = new Scanner(System.in);
            System.out.print("Введите элемент массива массива: ");
            int element = scn2.nextInt();
            container1[i] = element;
        }
        return container1;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] container = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < container.length; i++) {
            container[i] = rnd.nextInt(maxValueExclusion);
        }
        for (int i = 0; i < container.length; i++) {
        }
        return container;
    }


}




