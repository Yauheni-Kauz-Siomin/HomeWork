package home_work_1;

import java.util.Scanner;

public class YourName_6_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ���� ���:");
        String name = scanner.nextLine();

        switch (name) {
            case "����":
                System.out.println("������!\n" + "� ��� ����� ���� ����");
                break;
            case "���������":
                System.out.println("� ��� ����� ���� ����");
                break;
            default:
                System.out.println("������ ����, � �� ���?");
        }
    }
}
