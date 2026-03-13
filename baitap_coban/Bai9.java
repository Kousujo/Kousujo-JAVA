//Viết chương trình giải phương trình bậc 1.
package baitap_coban;
import java.util.Scanner;
public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b;
        double x;

        System.out.print("Nhap he so a : ");
        a = sc.nextLong();
        System.out.print("Nhap he so b : ");
        b = sc.nextLong();
        System.out.printf("Phuong trinh la : %dx + %d = 0\n",a,b);

        if (a == 0 ) {
            if ( b == 0 ) {
                System.out.print("Phuong trinh vo so nghiem");
                sc.close();
                return;
            }
            System.out.print("Phuong trinh vo nghiem");
        }
        else { 
            x = (double)-b/a;
            System.out.println("-------------------------");
            System.out.printf("x = %.2f",x);
        }

        sc.close();
    }
}
