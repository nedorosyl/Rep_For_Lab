import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] list = str.toCharArray();
        StringBuilder reversed = new StringBuilder();

        for (int i = list.length - 1; i >= 0; i--) {
            reversed.append(list[i]);
        }
        String res = reversed.toString();
        if (str.equals(res)) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }
}