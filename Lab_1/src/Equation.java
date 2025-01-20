import java.util.Scanner;

public class Equation {
    // Решение квадратного уравнения
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите коэффициент a: ");
        float a = scan.nextFloat();
        System.out.print("Введите коэффициент b: ");
        float b = scan.nextFloat();
        System.out.print("Введите коэффициент c: ");
        float c = scan.nextFloat();
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double x1 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);
            double x2 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("x1 = %f; x2 = %f", x1, x2);
        } else if (discriminant == 0) {
            System.out.printf("x = %d", (int) ((-1 * b) / (2 * a)));
        } else {
            System.out.print("Корней нет");
        }
    }
}
