package DSA.Sorting_Algorithm;
public class Selection_Sort {
    public static void selectionSort(int[] arr) {
        int minIndex, temp;
        int n = arr.length;
        for ( int i = 0 ; i < n - 1 ; i++) {
            minIndex = i;
            for ( int j = i + 1 ; j < n ; j++) {
                if ( arr[j] < arr[minIndex] ) {
                    minIndex = j;
                }
            }
            if ( minIndex != i ) {
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}