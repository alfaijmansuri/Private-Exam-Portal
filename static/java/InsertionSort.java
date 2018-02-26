import java.util.Arrays;
import java.util.Scanner;

class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of integers -> ");
        int arr[] = new int[scan.nextInt()];
        System.out.println("Enter Integers -> ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("You Entered -> " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted -> " + Arrays.toString(arr));
        scan.close();
    }
}
