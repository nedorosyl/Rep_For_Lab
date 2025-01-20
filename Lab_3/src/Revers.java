import java.util.Scanner;

public class Revers {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner scan = new Scanner(System.in);
        char[] list = scan.nextLine().toCharArray();
        StringBuilder res = new StringBuilder();

        for (int i = list.length - 1; i >= 0; i--) {
            res.append(list[i]);
        }
        System.out.print("Перевёрнутая строка: " + res);
    }
}