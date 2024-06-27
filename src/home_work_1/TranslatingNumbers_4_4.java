package home_work_1;

import java.util.Scanner;

public class TranslatingNumbers_4_4 {
    public static void main(String[] args) {

        //  перевод чисел из килобайты в байты
        //  1 килобайт = 1024 байта

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        System.out.println("Если вы хотите перевести из килобайтов в байты нажмите 1, если наоборот - нажмите 2: ");
        int b = scanner.nextInt();
        if (b == 1) {
            System.out.println("В " + a + " килобайтах " + ((long) a * 1024) + " байта");
        } else {
            System.out.println("В " + a + " байтах " +  ((double) a / 1024) + " килобайт");
        }

    }
}
