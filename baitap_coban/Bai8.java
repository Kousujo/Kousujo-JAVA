//Nhập vào một số nguyên dương n, liệt kê các số hoàn thiện nhỏ hơn n.
package baitap_coban;
import java.util.Scanner;
public class Bai8 {
    public static boolean isPerfect(long n) {
        if (n <= 1) return false;
        long sum = 1; 
        for (long i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;

        System.out.print("Nhap so : ");
        num = sc.nextLong();

        System.out.println("-------------------------");
        for ( long i = 2 ; i < num ; i++ ) {
            if ( isPerfect(i)) {
                System.out.printf("%d ",i);
            }
        }

        sc.close();
    }
}