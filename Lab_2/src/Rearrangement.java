import java.util.Arrays;

public class Rearrangement {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4};
        int sup = numbers[numbers.length-1];
        numbers[numbers.length-1] = numbers[0];
        numbers[0] = sup;
        System.out.println(Arrays.toString(numbers));
    }
}
