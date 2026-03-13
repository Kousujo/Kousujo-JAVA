//Nhập vào một mảng số nguyên, sắp xếp mảng theo trật tự tăng dần, giảm dần.
package baitap_coban;
import java.util.ArrayList;
import java.util.Scanner;
public class Bai16 {
    private ArrayList<Integer> list;

    public Bai16() {
        this.list = new ArrayList<>();
    }

    public void input(Scanner sc) {
        System.out.print("Nhap so luong phan tu n : ");
        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i++) {
            System.out.printf("Index %d :",i);
            int value = sc.nextInt();
            this.list.add(value);
        }
    }

    public void display() {
        System.out.println("Current List: " + this.list);
    }

    public void increasing() {
        for (int i = 1 ; i < list.size() ; i++) {
            int key = this.list.get(i);
            int j = i - 1;
            while (j >= 0 && this.list.get(j) > key ) {
                this.list.set(j + 1, this.list.get(j));
                j--;
            }
            this.list.set(j + 1, key);
        }
    }

    public void decreasing() {
        for (int i = 1 ; i < list.size() ; i++) {
            int key = this.list.get(i);
            int j = i - 1;
            while (j >= 0 && this.list.get(j) < key ) {
                this.list.set(j + 1, this.list.get(j));
                j--;
            }
            this.list.set(j + 1, key);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Bai16 app = new Bai16();

            System.out.println("=== INSERTION SORT DEPLOYMENT ===");
            app.input(sc);
            app.display();

            System.out.println("\nSorting Increasing...");
            app.increasing();
            app.display();

            System.out.println("\nSorting Decreasing...");
            app.decreasing();
            app.display();

            System.out.println("\n=== SYSTEM STABLE ===");
        } catch (Exception e) {
            System.err.println("Critical Error: " + e.getMessage());
        }
    }
}