package massif;

public class Massif5 {
    public static void main(String[] args){
        int[] arr = {2,5,8,3,7,4,9,6};
        int length = arr.length;
        int temp;
        int min;
        int indexMin;
        System.out.println("Исходный массив:");
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
        for (int i = 0; i < length; i++) {
            min = arr[i];
            indexMin = i;
            for (int j = i; j < length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    indexMin = j;
                }
            }
            if (i != indexMin) {
                temp = arr[i];
                arr[i] = min;
                arr[indexMin] = temp;
            }
        }
        System.out.println();
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


