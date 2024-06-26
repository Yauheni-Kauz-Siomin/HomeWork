package home_work_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("¬ведите второе целое число:");
        int a = scanner.nextInt();
        System.out.print("¬ведите второе целое число:");
        int b = scanner.nextInt();
        int c = a & b;
        int d = a | b;
        System.out.println("–езультат побитового оператора -и-: " + c);
        System.out.println("–езультат побитового оператора -или-: " +d);

    }
}
