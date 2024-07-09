package home_work_2.sorts;

import java.util.Arrays;

import static home_work_2.utils.SortsUtils.sort;
import static home_work_2.utils.SortsUtils.shake;


public class SortsMain {
    public static void main(String[] args) {

        int[] arr1 = new int[]{1,2,3,4,5,6};
        System.out.println("Какой массив был до сортировки " + Arrays.toString(arr1));
        sort(arr1);
        shake(arr1);
        System.out.println();


        int[] arr2 = new int[]{1,1,1,1};
        System.out.println("Какой массив был до сортировки " + Arrays.toString(arr2));
        sort(arr2);
        shake(arr2);
        System.out.println();


        int[] arr3 = new int[]{9,1,5,99,9,9};
        System.out.println("Какой массив был до сортировки " + Arrays.toString(arr3));
        sort(arr3);
        shake(arr3);
        System.out.println();


        int[] arr4 = new int[]{};
        System.out.println("Какой массив был до сортировки " + Arrays.toString(arr4));
        sort(arr4);
        shake(arr4);
        System.out.println();


        int[] arr5 = new int[]{6,5,4,3,2,1};
        System.out.println("Какой массив был до сортировки " + Arrays.toString(arr5));
        sort(arr5);
        shake(arr5);
        System.out.println();

    }

}
