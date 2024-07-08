package home_work_2.utils;

import java.util.Scanner;

/**
 2.1. Создать класс ArraysUtils. В этом классе не должно быть main метода. В этом классе написать следующие методы:
 2.1.1. Написать метод public static int[] arrayFromConsole(). Данный метод размер массива и каждый его элемент
 запрашивает у пользователя через консоль. */


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
        for (int j : container1) {
            System.out.print(j + "   ");
        }
        return container1;
    }
}





