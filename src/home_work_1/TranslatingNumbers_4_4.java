package home_work_1;

import java.util.Scanner;

public class TranslatingNumbers_4_4 {
    public static void main(String[] args) {

        //  ������� ����� �� ��������� � �����
        //  1 �������� = 1024 �����

        Scanner scanner = new Scanner(System.in);
        System.out.print("������� �����: ");
        int a = scanner.nextInt();
        System.out.println("���� �� ������ ��������� �� ���������� � ����� ������� 1, ���� �������� - ������� 2: ");
        int b = scanner.nextInt();
        if (b == 1) {
            System.out.println("� " + a + " ���������� " + ((long) a * 1024) + " �����");
        } else {
            System.out.println("� " + a + " ������ " +  ((double) a / 1024) + " ��������");
        }

    }
}
