//Viết chương trình nhập vào 1 số nguyên. Kiểm tra xem số đó có phải là số nguyên tố hay không và thông báo ra màn hình.
package baitap_coban;
import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;
        boolean check = true;

        System.out.print("Nhap so : ");
        num = sc.nextLong();
        
        if (num < 2) check = false;
        for (long i = 2; i <= Math.sqrt(num) ; i++) {
            if (num % i == 0) {
                check = false;
                break;
            }
        }

        System.out.println("-------------------------");
        String result = (check) ? "Day la so nguyen to!" : "Day khong phai la so nguyen to!";
        System.out.print(result);

        sc.close();
    }
}