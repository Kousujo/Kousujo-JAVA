package src;
import java.util.Scanner;
public class Tansuat {
    public static void main(String[] args) {
        int[] a = new int[100];
        int[] b = new int[100];
        try (Scanner sc = new Scanner(System.in)) {
            System.err.print("Nhap n");
            int n = sc.nextInt();

            for (int i = 0 ; i < n ; i++) {
                System.out.printf("Index %d :",i);
                a[i] = sc.nextInt();
            }

            int x;
            b[0] = a[0];
            for (int i = 1 ; i < n ; i++) {
                if (a[i] !=  
            }
        }
    }
}