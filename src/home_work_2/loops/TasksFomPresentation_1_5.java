/* 1.5. Задачи в презентации. На сайте есть пояснения по каждой из этих задач. Все задачи в одном классе, в отдельных методах.
    	1.5.1. Найти наибольшую цифру натурального числа
    	1.5.2. Вероятность четных случайных чисел
    	1.5.3. Посчитать четные и нечетные цифры числа
    	1.5.4. Ряд Фибоначчи
    	1.5.5. Вывести ряд чисел в диапазоне с шагом
    	1.5.6. Переворот числа */


package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class TasksFomPresentation_1_5 {
    public static void main(String[] args) {
        findMaxDigit(565_329);
        probabilityOfEvenNumbers();
        evenAndOddNumbers(1_234_777);
        fibonacci();
        seriesOfNumbers();


    }

    public static int findMaxDigit(int value) {
        int number = 565_329;
        int tmp = Math.abs(value);
        int maxDigit = 0;
        while (tmp != 0) {
            int current = tmp % 10;
            if (current > maxDigit) {
                maxDigit = current;
            }
            tmp /= 10;
        }
        System.out.println("Наибольшая цифра в числе " + number + " будет " + maxDigit);
        return maxDigit;

    }

    public static void probabilityOfEvenNumbers() {

        Random rand = new Random();
        int count = 0;
        int n = 1000;
        for (int i = 0; i < n; i++) {
            int temp = rand.nextInt(100);
//            System.out.print(temp + "__"); --- проверял как выводятся
            if (temp % 2 == 0) {
                count++;
            }
        }
        double result = ((double) count / n * 100);
        System.out.println("Количество четных чисел в выборке из " + n + " объектов составило " + count + " , что в процентах " + result);
    }

    public static void evenAndOddNumbers(long value) {

        long numb = Math.abs(value);
        int countEvenNumb = 0;
        int countOddNumb = 0;
        while (numb != 0) {
            if (numb % 2 == 0) {
                countEvenNumb++;
            } else {
                countOddNumb++;
            }
            numb /= 10;
        }
        System.out.println("Количество четных чисел в числе " + value + " составило " + countEvenNumb + " , нечетных -  " + countOddNumb);
    }

    /* Вывести на экран столько элементов ряда Фибоначчи, сколько указал пользователь.
    Если на ввод поступило 6, то вывод должен содержать первых шесть чисел ряда
    Фибоначчи: 1 2 3 5 8 13.
    Ряд фибоначчи:Последовательность чисел, которые задаются по определённому правилу:
     каждое следующее число равно сумме двух предыдущих. Первые два числа заданы сразу
     и равны 0 и 1
     */

    public static void fibonacci() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите количество выводимых элементов ряда Фибоначчи: ");
        int numb = scn.nextInt();
        int count = 0;
        int firstNumber = 0;
        int secondNumber = 1;
        int sumNumber;
        while (count < numb) {
            sumNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sumNumber;
            count++;
            System.out.print(secondNumber + " ");
        }
        System.out.println();
    }

    public static void seriesOfNumbers() {

        Scanner scn1 = new Scanner(System.in);
        System.out.println("Введите минимальное натуральное число диапазона ");
        int minNumber = scn1.nextInt();
        Scanner scn2 = new Scanner(System.in);
        System.out.println("Введите максимальное натуральное число диапазона ");
        int maxNumber = scn2.nextInt();
        Scanner scn3 = new Scanner(System.in);
        System.out.println("Введите шаг диапазона ");
        int stepNumber = scn3.nextInt();
        int temp = 0;
        int firstNumber;
        while (temp <= maxNumber) {
            firstNumber = minNumber;
            temp = minNumber + stepNumber;
            minNumber = temp;
            System.out.print(firstNumber + " ");
        }
        System.out.println();

    }


}








