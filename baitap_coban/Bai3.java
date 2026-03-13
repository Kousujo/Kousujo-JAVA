//Viết chương trình tính chu vi, diện tích hình tròn.
package baitap_coban;
import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius,perimeter,area;

        System.out.print("nhap ban kinh : ");
        radius = sc.nextDouble();

        perimeter = radius * 2 * Math.PI;
        area = radius * radius * Math.PI;

        System.out.println("-------------------------");
        System.out.printf("Chu vi : %.2f%nDien tich : %.2f6%n",perimeter,area);

        sc.close();
    }
}