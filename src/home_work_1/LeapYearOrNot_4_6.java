package home_work_1;

/* услови€, чтобы год был високосным:
- год должен делитс€ без остатка на 4;
- если год делитс€ нацело на 4, но не делитс€ нацело на 100, это високосный год
- год делитс€ на 100 и на 400 без остатка,
 */


import java.util.Scanner;

public class LeapYearOrNot_4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¬ведиете год : ");
        int a = scanner.nextInt();
        if (a % 4 == 0 && a % 100 != 0) {
            System.out.println("√од " + a + " €вл€етс€ високосным");
        } else if ( a % 100 == 0 && a % 400 == 0) {
            System.out.println("√од " + a + " €вл€етс€ високосным");
        } else {
            System.out.println("√од " + a + " Ќ≈ €вл€етс€ високосным");
        }

    }

}



