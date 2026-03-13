//Viết chương trình giải phương trình bậc 2.
package baitap_coban;
import java.util.Scanner;
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b, c;
        double delta;

        System.out.print("Nhap he so a : ");
        a = sc.nextLong();
        System.out.print("Nhap he so b : ");
        b = sc.nextLong();
        System.out.print("Nhap he so c : ");
        c = sc.nextLong();
        System.out.printf("Phuong trinh la : %dx^2 + %dx + %d = 0\n",a,b,c);

        System.out.println("-------------------------");
        if ( a == 0 ) {
            if (b == 0 ) {
                if ( c == 0 ) {
                    System.out.print("Phuong trinh vo so nghiem");
                    sc.close();
                    return;
                }
                System.out.print("Phuong trinh vo nghiem");
                sc.close();
                return;
            }
            double x = (double) -c/b;
            System.out.printf("x = %.2f",x);
            sc.close();
            return;
        }


        delta = b*b - 4*a*c;
        if ( delta > 0 ) {
            double x1 = (-b + Math.sqrt(delta)) / (2*a);
            double x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.printf("Phuong trinh co 2 nghiem : x1 = %.2f va x2 = %.2f",x1,x2);
        }
        else if ( delta == 0) {
            double x = -b / (2*a);
            System.out.printf("Phuong trinh co nghiem kep : x = %.2f",x);
        }
        else { System.out.print("Phuong trinh vo nghiem"); }  

        sc.close();
    }
}