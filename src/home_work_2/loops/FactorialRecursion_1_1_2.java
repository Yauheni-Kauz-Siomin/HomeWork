
/* 1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе. Есть нюанс с переполнением,
можно добавить проверки и сообщения пользователю.
        Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
    	1.1.2. Используя рекурсию */

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
