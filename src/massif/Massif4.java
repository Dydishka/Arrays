package massif;

public class Massif4 {
    public static void main(String[] args) {
        int n = 56789;
        int mod = Math.abs(n);
        boolean isIncreasing = true;
        String s = (String.valueOf(mod));
        int length = s.length();
        int[] a = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            a[i] = mod % 10;
            mod = mod / 10;
        }
        for (int i = 0; i < length - 1; i++)
            if (a[i] >= a[i + 1]) isIncreasing = false;
        if (isIncreasing) {
            System.out.println("Цифры числа - " + n + " - образуют строго возрастающую последовательность.");
        }   else System.out.println("Цифры числа - " + n + " - не образуют строго возрастающую последовательность.");
    }
}

