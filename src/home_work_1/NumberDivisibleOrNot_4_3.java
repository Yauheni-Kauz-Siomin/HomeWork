package home_work_1;

public class NumberDivisibleOrNot_4_3 {
    public static void main(String[] args) {

        int a = 6;
        int b = 3;
        double c = (double)a / b;
        if (a % b == 0) {
            System.out.println("Число " + a + " делится на " + b + " и получается " + c);
        } else {
            System.out.println("Число " + a + " НЕ делится на " + b + " и получается " + c);
        }

    }
}
