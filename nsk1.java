import java.util.Random;

public class nsk1 {
    public static void main(String[] args) {
        int[] array = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < 100000; i++) {
            array[i] = rand.nextInt(1000);
        }

        bubbleSort(array);


        int startIndex = 0;
        int endIndex = 10;
        displaySubArray(array, startIndex, endIndex);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void displaySubArray(int[] arr, int start, int end) {
        if (start < 0 || start >= arr.length || end < 0 || end >= arr.length || start > end) {
            System.out.println("Недопустимые индексы");
            return;
        }
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}