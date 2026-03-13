//Viết chương trình kiểm tra số nhập vào là số chẵn hay số lẻ.
package baitap_coban;
import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Nhap so : ");
        num = sc.nextInt();
        
        System.out.println("-------------------------");

        // if (num % 2 == 0) System.out.print("Day la so chan!");
        // else System.out.print("Day la so le");
        String result = (num % 2 == 0) ? "Day la so chan!" : "Day la so le";
        System.out.print(result);

        sc.close();
    }
}