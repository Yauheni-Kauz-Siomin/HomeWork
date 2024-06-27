package home_work_1;

import java.util.Scanner;

public class YourName_6_1 {
    public static void main(String[] args) {

        String name1 = "Вася";
        String name2 = "Анастасия";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();

        if (name.equals(name1)) {
            System.out.println("Привет!\n" + "Я так долго тебя ждал");
        }
        if (name.equals(name2)) {
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}

// При ввводе имени Вася, все равно происходит проскакивание строки и выводятся два сообщения, во всех остальных случаях --прогармма работает корректно.
// Почему так происходит, пока не нашел ответ. По сути в задачи два условия и как их вложить в один if, вот в этом наверное загвоздка