package home_work_1;

/* �������, ����� ��� ��� ����������:
- ��� ������ ������� ��� ������� �� 4;
- ���� ��� ������� ������ �� 4, �� �� ������� ������ �� 100, ��� ���������� ���
- ��� ������� �� 100 � �� 400 ��� �������,
 */


import java.util.Scanner;

public class LeapYearOrNot_4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("�������� ��� : ");
        int a = scanner.nextInt();
        if (a % 4 == 0 && a % 100 != 0) {
            System.out.println("��� " + a + " �������� ����������");
        } else if ( a % 100 == 0 && a % 400 == 0) {
            System.out.println("��� " + a + " �������� ����������");
        } else {
            System.out.println("��� " + a + " �� �������� ����������");
        }

    }

}



