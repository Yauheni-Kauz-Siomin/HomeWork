package home_work_1;

// � ������� ��������� ASCII ��������� ����� �������� ������� �� :
// 65 - 90 - ������� �������, �  97 - 122 = ����� �������

public class LetterOrSymbol_4_5 {
    public static void main(String[] args) {

        int a = 95;

        if (a >= 65 && a <= 90) {
            System.out.println("���� ������� �����, ������������ ��� ���������� ����� � ������� ASCII");
        } else if (a >= 97 && a <= 122) {
            System.out.println("���� ������� �����, ������������ ��� ���������� ����� � ������� ASCII");
        } else {
            System.out.println("���� ������� �����, ������������ ��� ������� ������� � ������� ASCII");
        }

    }
}
