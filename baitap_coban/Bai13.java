//Viết chương trình tính tổng của các số chẵn nhỏ hơn số n (Với n nhập từ bàn phím).
package baitap_coban;
import java.util.Scanner;
public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n, sum = 0;

        System.out.print("Nhap n : ");
        n = sc.nextLong();

        for ( long i = 0 ; i < n ; i += 2 ) {
            sum += i;
        }
        
        System.out.println("-------------------------");
        System.out.printf("Tong cac so chan nho hon n : %d",sum);

        sc.close();
    }
}