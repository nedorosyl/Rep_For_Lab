public class Max_el {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4};
        int max_el = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max_el) {
                max_el = numbers[i];
            }
        }
        System.out.println(max_el);
    }
}
