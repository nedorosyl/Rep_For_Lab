public class Honest_el {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4};
        int res = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                res ++;
            }
        }
        System.out.println(res);
    }
}
