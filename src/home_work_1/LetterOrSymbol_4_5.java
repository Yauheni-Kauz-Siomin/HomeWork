package home_work_1;

// В таблице симоволов ASCII ангийские буквы занимают позиции от :
// 65 - 90 - большой регистр, и  97 - 122 = малый регистр

public class LetterOrSymbol_4_5 {
    public static void main(String[] args) {

        int a = 95;

        if (a >= 65 && a <= 90) {
            System.out.println("Было введено число, обозначающее код английской буквы в таблице ASCII");
        } else if (a >= 97 && a <= 122) {
            System.out.println("Было введено число, обозначающее код английской буквы в таблице ASCII");
        } else {
            System.out.println("Было введено число, обозначающее код другого символа в таблице ASCII");
        }

    }
}
