public class Ozon {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            String fizzbuzz = "";
            if (i % 3 == 0) {
                fizzbuzz += "Fizz";
            }
            if (i % 5 == 0) {
                fizzbuzz += "Buzz";
            }
            if (fizzbuzz != "") {
                System.out.println(fizzbuzz);
            }
            else {
                System.out.println(i);
            }

        }
    }
}
