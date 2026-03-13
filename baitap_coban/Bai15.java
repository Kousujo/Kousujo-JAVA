package baitap_coban;
import java.util.Scanner;
public class Bai15 {
    private int[] arr;
    private int n;

    public Bai15() {
        this.arr = new int[1];
    } 

    public Bai15(int n) {
        this.arr = new int[n];
    }

    public void nhap(Scanner sc) {
        System.out.print("Nhap so luong phan tu n : ");
        this.n = sc.nextInt();
        this.arr = new int[this.n];
        for (int i = 0 ; i < n ; i++) {
            System.out.printf("Index %d :",i);
            this.arr[i] = sc.nextInt();
        }
    }

    public void display() {
        System.out.print("Mang hien tai: [");
        for (int i = 0 ; i < n ; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public int tinhTongDuong() {
        int sum = 0;
        for (int x : arr) {
            if (x > 0) sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Bai15 app = new Bai15();
            app.nhap(sc);
            app.display();
            
            int ketQua = app.tinhTongDuong();
            System.out.println("Tong cac so duong trong mang la: " + ketQua);
        }
    }
}