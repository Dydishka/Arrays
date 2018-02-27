package massif;
import java.util.Arrays;

public class Massif {
    public static void main(String[] args) {
        int[] numbers = {23, -9, 34, 53478, 43534};
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("min value " + min);
        System.out.println("max value " + max);
        numbers[1] = 0;
        numbers[3] = 99;
        System.out.println(Arrays.toString(numbers));
    }
}