package home_work_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ������ ����� �����:");
        int a = scanner.nextInt();
        System.out.print("������� ������ ����� �����:");
        int b = scanner.nextInt();
        int c = a & b;
        int d = a | b;
        System.out.println("��������� ���������� ��������� -�-: " + c);
        System.out.println("��������� ���������� ��������� -���-: " +d);

    }
}
