package massif;

public class Massif2 {
    public static void main(String[] args) {
        int[] num = new int[]{2, 4, 1, 6, 5, 4, 9, 7, 5, 4};
        int[] x = new int[10];
        for (int i = 0; i < num.length; i++) {
            x[num[i]]++;
        }
        for (int i = 0; i < x.length; i++) {
            if (x[i] >= 2) System.out.println(i + " - повторений " + x[i]);
        }
    }
}
