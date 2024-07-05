/*
 1.3 Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое мы будем возводить,
 Второе число это степень в которую возводят первое число. Степень - только положительная и целая.
 Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
		1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
        1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
*/

package home_work_2.loops;

import java.util.Scanner;

public class Exponentiation_1_3 {
    public static void main(String[] args) {

        exponentiationTwoNumbers();

    }

    private static void exponentiationTwoNumbers() {
        Scanner scn1 = new Scanner(System.in);
        System.out.println("Введите число: ");
        double number1 = scn1.nextDouble();
        Scanner scn2 = new Scanner(System.in);
        System.out.println("Введите число степени (положительное целое число): ");
        int number2 = scn2.nextInt();
        int number3 = number2;
        double result = 1;
        while (number2 > 0) {
            result = result * number1;
            number2--;
        }
        System.out.println(number1 + " ^ " +  number3 + " = " + result);
    }

}



