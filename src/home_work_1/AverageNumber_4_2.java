package home_work_1;

public class AverageNumber_4_2 {
    public static void main(String[] args) {

        int a = 5;
        int b = -10;
        int c = 10;
        if ((a - b) * (c - a) >= 0) {
            System.out.print("Average number " + a);
        } else if ((b - a) * (c - b) >= 0) {
            System.out.print("Average number " + b);
        } else {
            System.out.print(c);
        }
    }
}

        /*Второй вариант решения

        int a = 10;
        int b = 10;
        int c = 1;
        if ((a <= b && a >= c) || (a <= c && a >= b)) {
            System.out.print("Average number " + a);
        } else if ((b <= a && b >= c) || (b <= c && b >= a)) {
            System.out.print("Average number " + b);
        } else {
            System.out.print(c);
        }
    }
}

         */