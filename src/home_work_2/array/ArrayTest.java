package home_work_2.array;

import java.util.Arrays;

import static home_work_2.utils.ArraysUtils.arrayFromConsole;
import static home_work_2.utils.ArraysUtils.arrayRandom;


public class ArrayTest {
    public static void main(String[] args) {
        arrayFromConsole_2_1_1_1();
        arrayRandom_2_1_2_1();

    }

    public static void arrayFromConsole_2_1_1_1() {

        int[] container = arrayFromConsole();
        System.out.println(Arrays.toString(container));

    }

    public static void arrayRandom_2_1_2_1() {

        int[] container = arrayRandom(10,100);
        System.out.println(Arrays.toString(container));

    }

}
