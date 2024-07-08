package home_work_2.utils;

import java.util.Random;

/**
 2.1.2. Написать метод public static int[] arrayRandom(int size, int maxValueExclusion). Данный метод принимает два
 аргумента. Первый (size) указывает размер массива который мы хотим получить. Второй (maxValueExclusion) указывает
 до какого числа генерировать рандомные числа.
 2.1.2.1. Пример в отдельном классе с main. int[] container = arrayRandom(5, 100). Результат:
 В методе arrayRandom будет создан массив размером 5 с числами от 0 до 99 (использовать класс Random) и
 сохранён в переменную container.

 */


public class ArrayRandom {
    public static void main(String[] args) {
        arrayRandom(10, 100);

    }
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] container = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < container.length; i++) {
           container[i] = rnd.nextInt(maxValueExclusion);
        }
        for (int i = 0; i < container.length; i++) {
            System.out.print(container[i] + "   ");
        }
        return container;
    }

}
