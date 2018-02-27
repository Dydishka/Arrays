package massif;
import java.util.Arrays;

public class Massif3 {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int length = list.length;
        int[] n1 = new int[length];
        int a = length - 1;
        System.out.println("Начальный массив:");
        System.out.println(Arrays.toString(list));
        System.out.println("Инвертирование:");
        for (int i = a; i >= 0; i--) {
            n1[a - i] = list[i];
        }
        System.out.println(Arrays.toString(n1));
    }
}