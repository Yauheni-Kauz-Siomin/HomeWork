package home_work_2.loops;

import java.util.Scanner;

public class Factorial_1_1_1 {
    public static void main(String[] args) {
        checkAndFactorial();
    }

    public static void checkAndFactorial() {
        Scanner scn = new Scanner(System.in);
        System.out.println("������� ����� ������������� �����: ");
        if (scn.hasNextLong()) {
            long b = scn.nextLong();
            if (b < 0) {
                System.out.println("������� ������������� �����, ��������� ����!");
            } else {
                System.out.print("��������� ���������� �����: ");
                long multi = 1;
                while (b > 0) {
                    multi = multi * b;

                    if (b - 1 == 0) {
                        System.out.print(b);
                    } else {
                        System.out.print(b + " * ");
                    }
                    b--;
                }
                System.out.println(" = " + multi);
            }

        } else if (scn.hasNextDouble()) {
            System.out.println("������� �� ����� �����, ��������� ����!"); // ��������, ���� ������� ������� ����� ����� �������
        } else {
            System.out.println("������� �� �����, ��������� ����!");
        }
    }
}