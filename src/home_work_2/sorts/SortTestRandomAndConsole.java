package home_work_2.sorts;

import java.util.Arrays;

import static home_work_2.utils.ArraysUtils.arrayRandom;
import static home_work_2.utils.ArraysUtils.arrayFromConsole;
import static home_work_2.utils.SortsUtils.shake;
import static home_work_2.utils.SortsUtils.sort;


public class SortTestRandomAndConsole {
    public static void main(String[] args) {
        arraySortRandom();
        System.out.println();
        arraySortConsole();

    }

    public static void arraySortRandom() {
        System.out.print("Какой массив был до сортировки: ");
        int[] container = arrayRandom(50, 100);
        System.out.print(Arrays.toString(container));
        System.out.println();
        sort(container);
        shake(container);
    }


    public static void arraySortConsole() {
        int[] container = arrayFromConsole();
        System.out.print("Какой массив был до сортировки: " + Arrays.toString(container));
        System.out.println();
        sort(container);
        shake(container);
    }

}
