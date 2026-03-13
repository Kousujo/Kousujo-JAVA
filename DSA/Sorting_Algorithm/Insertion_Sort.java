package DSA.Sorting_Algorithm;
public class Insertion_Sort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for ( int i = 1 ; i <= n - 1 ; i++ ) {
            int key = arr[i];// rut la bai 
            int j = i - 1; // bien trien tra la bai ben trai
            while ( j >= 0 && arr[j] > key ) {
                arr[j + 1] = arr[j];// day key sang phai ( shift )
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        insertionSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}