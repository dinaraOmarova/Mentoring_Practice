import java.util.ArrayList;
import java.util.Arrays;

public class SumOfTwo {
    public static void main(String[] args) {

        int[] numbers = {1456, 323, 564, 1284, 1298, 723, 254};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == 2020) {
                    System.out.println(numbers[i]*numbers[j]);
                }
            }
        }
    }
}
