package home_work_1;

import java.util.Scanner;

public class YourName_6_1 {
    public static void main(String[] args) {

        String name1 = "����";
        String name2 = "���������";
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ���� ���:");
        String name = scanner.nextLine();

        if (name.equals(name1)) {
            System.out.println("������!\n" + "� ��� ����� ���� ����");
        }
        if (name.equals(name2)) {
            System.out.println("� ���� ��� ����� ����");
        } else {
            System.out.println("������ ����, � �� ���?");
        }
    }
}

// ��� ������ ����� ����, ��� ����� ���������� ������������� ������ � ��������� ��� ���������, �� ���� ��������� ������� --��������� �������� ���������.
// ������ ��� ����������, ���� �� ����� �����. �� ���� � ������ ��� ������� � ��� �� ������� � ���� if, ��� � ���� �������� ���������