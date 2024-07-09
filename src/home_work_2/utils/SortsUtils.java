package home_work_2.utils;

import java.util.Arrays;

public class SortsUtils {

    // Пузырьковая сортировка

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = (arr.length - 1); j > i; j--) { // для всех элементов после i-го
                if (arr[j - 1] > arr[j]) { // если текущий элемент меньше предыдущего
                    int temp = arr[j - 1]; // меняем их местами
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Каким стал массив после сортировки " + Arrays.toString(arr));

    }

    // Шейкерная сортировка

    public static void shake(int[] arr) {
        int left = 0;
        int right = arr.length - 1;             // левая и правая границы сортируемой области массива
        int flag = 1;                           // флаг наличия перемещений
                                                // Выполнение цикла пока левая граница не сомкнётся с правой
                                                 // и пока в массиве имеются перемещения

        while ((left < right) && (flag > 0)) {
            flag = 0;
            for (int i = left; i < right; i++)   //двигаемся слева направо
            {
                if (arr[i] > arr[i + 1])         // если следующий элемент меньше текущего,
                {                                 // меняем их местами
                    int t = arr[i];
                    arr[i] = arr[i + 1];
                    arr [i + 1] = t;
                    flag = 1;                      // перемещения в этом цикле были
                }
            }
            right--;                               // сдвигаем правую границу на предыдущий элемент
            for (int i = right; i > left; i--)     //двигаемся справа налево
            {
                if (arr[i - 1] > arr[i])            // если предыдущий элемент больше текущего,
                {                                   // меняем их местами
                    int t = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = t;
                    flag = 1;                        // перемещения в этом цикле были
                }
            }
            left++;                                  // сдвигаем левую границу на следующий элемент
            if (flag == 0) break;
        } System.out.println("Каким стал массив после сортировки " + Arrays.toString(arr));
    }
}
