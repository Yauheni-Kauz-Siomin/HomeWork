package home_work_2.loops;

public class MultiplicationTable_1_6 {
    public static void main(String[] args) {

        int a = 2;
        int b = 1;
        int c = 0;
        int temp = 2;

        int a1 = 6;
        int temp1 = 6;
        int c1 = 0;


        while (c < 10) {
            for (int i = 0; i < 4; i++) {
                System.out.print(a + " х " + b + " = " + (a * b) + " || ");
                a++;
                if (i == 3) {
                    System.out.println();
                    a = temp;
                    b++;
                    c++;
                }
            }
        }
        System.out.println("===========================================================");

        while (c1 < 10) {
            for (int i = 0; i < 4; i++) {
                System.out.print(a1 + " х " + b + " = " + (a * b) + " || ");
                a1++;
                if (i == 3) {
                    System.out.println();
                    a1 = temp1;
                    b++;
                    c1++;
                }
            }
        }
    }
}

// как выровнять таблицу умножения, как предложено на картинке пока решение не нашел