import java.util.Scanner;

public class Amount {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner scan = new Scanner(System.in);
        String[] list = scan.nextLine().split(" ");
        System.out.println("Количество слов в строке: " + list.length);
    }
}