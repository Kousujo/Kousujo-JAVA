//Nhập vào một số nguyên dương n, liệt kê tất các số nguyên tố nhỏ hơn n.
package baitap_coban;
import java.util.Scanner;
public class Bai6 {
    public static boolean isPrime(long n) {
        if (n < 2) return false;
        for (long i = 2; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;

        System.out.print("Nhap so : ");
        num = sc.nextLong();

        System.out.println("-------------------------");
        for ( long i = 2 ; i < num ; i++ ) {
            if ( isPrime(i)) {
                System.out.printf("%d ",i);
            }
        }

        sc.close();
    }
}