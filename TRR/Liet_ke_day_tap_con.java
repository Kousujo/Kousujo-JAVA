package TRR;
import java.util.Scanner;
public class Liet_ke_day_tap_con {
    private int[] s;
    private char[] a;
    private int n;

    public Liet_ke_day_tap_con() {
        s = new int[100];
        a = new char[100];
    }

    public void input(Scanner sc) {
        System.out.print("Nhap n : ");
        n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++) {
            System.out.printf("Phan tu thu %d : ",i);
            
        }
    }
}