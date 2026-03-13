package src;
import java.time.Year;
import java.util.Scanner;
public class NamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap nam can kiem tra : ");
        int nam = sc.nextInt();
        if ( (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0) ) {
            System.out.printf("%d la nam nhuan", nam);
        } else {
            System.out.printf("%d khong phai la nam nhuan", nam);
        }

        

        sc.close();
    }
}