package home_work_2.array;

import java.util.Arrays;

import static home_work_2.array.ArrayRandom_2_1_2_1.arrayRandom;

public class TasksArrays_2_4 {
    public static void main(String[] args) {
        sumOfEvenPositiveElements();
        maxDigitWithEvenIndex();
        arrayElementsLessThanArithmeticMean();
        twoMinimumArrayElements();
        compressingArrayByInterval();
        sumOfArrayDigits();
    }

    //  2.4.1  Сумма четных положительных элементов массива

    public static void sumOfEvenPositiveElements() {
        int[] container = arrayRandom(15, 100);
        int sum = 0;
        for (int i = 0; i < container.length; i++) {
            if (container[i] > 0 && i % 2 == 0) {
                sum += container[i];
            }
        }
        System.out.println("Сумма четных положительных элементов массива равна: " + sum);


    }
// 2.4.2. Максимальный из элементов массива с четными индексами

    public static void maxDigitWithEvenIndex() {
        System.out.println();
        int[] container = arrayRandom(15, 100);
        System.out.println();

        int maxDigit = -1;
        for (int i = 0; i < container.length; i++) {
            if (container[i] > maxDigit && i % 2 == 0) {
                maxDigit = container[i];
            }
        }
        System.out.println("Максимальный из элементов массива с четными индексами равен : " + maxDigit);
        System.out.println();
    }

    // 2.4.3. Элементы массива, которые меньше среднего арифметического

    public static void arrayElementsLessThanArithmeticMean() {
        int[] container = arrayRandom(15, 100);
        System.out.println();
        int sum = 0;
        for (int i = 0; i < container.length; i++) {
            sum += container[i];
        }
        System.out.println("Cреднее арифметическое равно: " + sum / container.length);
        for (int i = 0; i < container.length; i++) {
            if (container[i] < (sum / container.length)) {
                System.out.print(container[i] + "   ");
            }

        }
        System.out.println();

    }

    // 2.4.4. Элементы массива, которые меньше среднего арифметического

    public static void twoMinimumArrayElements() {
        System.out.println();
        int[] container = arrayRandom(7, 100);
        System.out.println();
        int minNumber1 = container[0];
        int minNumber2 = container[1];
        for (int i = 0; i < container.length; i++) {
            if (container[i] < minNumber1) {
                minNumber1 = container[i];
            }

        }
        System.out.print(minNumber1 + "  ");

        for (int i = 0; i < container.length; i++) {
            if ((container[i] > minNumber1) && (container[i] <= minNumber2)) {
                minNumber2 = container[i];
            }

        }

        System.out.print(minNumber2 + "  ");
        System.out.println();
    }


    // 2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу, как пример [10, 40]

    public static void compressingArrayByInterval() {
        System.out.println();
        int[] container = arrayRandom(7, 100);
        int min = 10;
        int max = 40;
        int count = 0;
        System.out.println();
        for (int i = 0; i < container.length; i++) {
            if (container[i] > min && container[i] < max) {
                container[i] = 0;
                count++;
            } else {
                System.out.print(container[i] + "   ");
            }
        }
        while (count > 0) {
            System.out.print(" " + 0 + "  ");
            count--;

        }
        System.out.println();
    }

    // 2.4.6. Сумма цифр массива

    public static void sumOfArrayDigits() {
        System.out.println();
        int[] container = arrayRandom(5, 100);
        System.out.println();
        int sum = 0;
        int sumNumber = 0;
        for (int i = 0; i < container.length; i++) {
            if (container[i] % 10 != 0) {
                sum = container[i] % 10 + container[i] / 10;
            } else {
                sum += container[i];
            }
            sumNumber += sum;
        }

        System.out.println("Сумма цифр массива составит: " + sumNumber);

    }


}











