package home_work_2.loops;

public class FactorialRecursion_1_1_2 {
    public static void main(String[] args) {
        System.out.println(multiplyingNumbers(5));
    }

    public static long multiplyingNumbers(long n) {
        if (n == 1)
            return 1;
        return n * multiplyingNumbers(n - 1);
    }
}
