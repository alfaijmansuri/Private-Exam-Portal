import java.util.Arrays;
import java.util.Scanner;

class SelectionSort {
    public static void selectionSort(int[] arr) {
        int minIndex;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
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
        selectionSort(arr);
        System.out.println("Sorted -> " + Arrays.toString(arr));
        scan.close();
    }
}
