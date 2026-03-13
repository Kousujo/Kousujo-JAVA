//Viết chương trình tính tổng của dãy số từ 1 đến n (với n được nhập từ bàn phím).
package baitap_coban;
import java.util.Scanner;
public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n, sum;

        System.out.print("Nhap n : ");
        n = sc.nextLong();

        sum = (n*(n+1))/2;// cong thuc Gauss
        
        System.out.println("-------------------------");
        System.out.printf("Tong day so tu 1 den n : %d",sum);

        sc.close();
    }
}