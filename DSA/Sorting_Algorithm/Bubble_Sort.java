package DSA.Sorting_Algorithm;
public class Bubble_Sort {
    public static void BubbleSort(int[] arr) {
        int n = arr.length;
        for ( int i = 0 ; i < n - 1 ; i++) {
            boolean swapped = false;
            for ( int j = 0 ; j < n - 1 - i ; j ++ ) {
                if ( arr[j] > arr[j + 1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if ( !swapped ) break;
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        BubbleSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}