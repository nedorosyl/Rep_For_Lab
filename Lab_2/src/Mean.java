public class Mean {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4};
        float sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        float res = sum / numbers.length;
        System.out.println(res);
    }
}
