package home_work_1;

import java.util.Scanner;

public class YourName_6_2 {
    public static void main(String[] args) {
        String name1 = "Вася";
        String name2 = "Анастасия";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();

        if (name.equals(name1)) {
            System.out.println("Привет!\n" + "Я так долго тебя ждал");
        } else if (name.equals(name2)) {
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }

    }

}
