import java.util.Scanner;

public class Parity_check {

    public static void main(String[] args) {
        System.out.print("Введите число для проверки на чётность: ");
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        if (count % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
    }

}
