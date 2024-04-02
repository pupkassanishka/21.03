import java.util.Random;
import java.util.Arrays;

public class nsk2 {
    public static void main(String[] args) {
        int[] array = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            array[i] = i + 1000000;
        }


        Random random = new Random();
        int randomInt = random.nextInt(1000000);
        int index = binarySearch(array, array[randomInt]);
        System.out.println("Индекс случайного элемента: " + index);
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}