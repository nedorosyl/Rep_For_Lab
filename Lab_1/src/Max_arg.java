import static java.lang.Math.max;

import java.util.Scanner;

public class Max_arg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите подряд три числа: ");
        System.out.print("Первое: ");
        int first = scan.nextInt();
        System.out.print("Второе: ");
        int second = scan.nextInt();
        System.out.print("Третье: ");
        int third = scan.nextInt();
        System.out.print("Максимальное число: " + max(max(first, second), third));
    }
}
