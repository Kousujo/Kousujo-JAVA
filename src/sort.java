package src;
import java.util.Scanner;

public class sort {
    public int[] a;
    public int n;


    public void BubbleSort() {
        for (int i = 0 ; i < this.n - 1 ; i++) {
            boolean swapped = false;
            for (int j = 0 ; j < this.n - 1 - i ; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp; 

                    swapped = true;
                }
            }
            if (!swapped) break; 
        }
    }

    public void input(Scanner sc) {
        System.out.print("Nhap n : ");
        this.n = sc.nextInt();
        a = new int[this.n];
        for (int i = 0 ; i < this.n ; i++) {
            System.out.printf("Index %d: ",i);
            a[i] = sc.nextInt();
        }
    }

    public void output() {
        System.out.print("Mang hien tai: [");
        for (int i = 0 ; i < n ; i++) {
            System.out.print(a[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            sort ds = new sort();
            ds.input(sc);
            ds.output();

            ds.BubbleSort();
            ds.output();
        }
    }
}