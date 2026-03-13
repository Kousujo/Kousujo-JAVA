package DSA.Sorting_Algorithm;
import java.util.Scanner;

public class ArraySortManager{ 
    private int[] arr;
    private int n;

    public void populateData(Scanner sc) {
        System.out.print("Nhap so luong phan tu n : ");
        this.n = sc.nextInt();
        this.arr = new int[n];
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.printf("Index %d : ",i);
            this.arr[i] = sc.nextInt();
        }
    }

    public void displayData() {
        System.out.print("Mang hien tai: [");
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void bubbleSort() {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                    swapped = true;
                }
            }
            if (!swapped) return;
        }
    }

    public void selectionSort() {
        int minIndex;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            if (minIndex != i) swap(arr, minIndex, i);
        }
    }

    public void insertionSort() {
        int key;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public void quickSort() {
        quickSort(0, arr.length - 1);
    }

    public void quickSort(int low, int high) {
        if (low < high) {
            int p = partition(low, high);

            quickSort(low, p - 1);
            quickSort(p + 1, high);
        }
    }

    public int partition(int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }
}