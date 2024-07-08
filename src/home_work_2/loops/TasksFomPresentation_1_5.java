/* 1.5. Задачи в презентации. На сайте есть пояснения по каждой из этих задач. Все задачи в одном классе, в отдельных методах.
    	1.5.1. Найти наибольшую цифру натурального числа
    	1.5.2. Вероятность четных случайных чисел
    	1.5.3. Посчитать четные и нечетные цифры числа
    	1.5.4. Ряд Фибоначчи
    	1.5.5. Вывести ряд чисел в диапазоне с шагом
    	1.5.6. Переворот числа */


package home_work_2.loops;

import java.util.Random;

public class TasksFomPresentation_1_5 {
    public static void main(String[] args) {
        findMaxDigit(565_329);
        probabilityOfEvenNumbers();
        evenAndOddNumbers(1_234_777);


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



}








