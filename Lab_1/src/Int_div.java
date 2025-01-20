import java.util.Scanner;

public class Int_div {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Первое число: ");
        int first = scan.nextInt();
        System.out.print("Второе число: ");
        int second = scan.nextInt();

        if (first % second == 0) {
            System.out.print("Первое число делится на второе без остатка");
        }else {
            System.out.print(first % second);
        }
    }
}
