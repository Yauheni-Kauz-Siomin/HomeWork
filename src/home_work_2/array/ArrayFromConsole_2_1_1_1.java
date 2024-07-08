package home_work_2.array;

import java.util.Scanner;

/**
 Написать метод public static int[] arrayFromConsole(). Данный метод размер массива и каждый его
 элемент запрашивает у пользователя через консоль.
 2.1.1.1. Пример в отдельном классе с main. int[] container = arrayFromConsole().
 Результат: В методе arrayFromConsole будет запрошена информация у пользователя,
 пользователь вводит размер (3) и его элементы по порядку {4, 17, 32}. Соответсвенно будет
 создан массив размером 3 с элементами {4, 17, 32} и сохранён в переменную container.

 */
public class ArrayFromConsole {
    public static void main(String[] args) {
        arrayFromConsole();
    }

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
        for (int j : container1) {
            System.out.print(j + "   ");
        }
        return container1;
    }
}


