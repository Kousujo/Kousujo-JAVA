package DSA.Sorting_Algorithm;
public class Quick_Sort {
    public static void QuickSort(int left, int right, int[] arr) {
        int pivot = arr[(left + right) / 2];
        int i = left, j = right;
        while ( i <= j ) {
            while ( arr[i] < pivot ) i++;
            while ( arr[j] > pivot ) j--;
            if ( i <= j ) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (left < j) QuickSort(left, j, arr);
        if (i < right) QuickSort(i, right, arr);
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        QuickSort(0, arr.length - 1, arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}