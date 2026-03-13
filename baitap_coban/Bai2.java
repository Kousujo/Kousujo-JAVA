//Viết chương trình tính chu vi, diện tích hình chữ nhật.
package baitap_coban;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length, width, perimeter, area;

        System.out.print("nhap chieu dai : ");
        length = sc.nextDouble();

        System.out.print("nhap chieu rong : ");
        width = sc.nextDouble();

        perimeter = (length + width) * 2;
        area = length * width;

        System.out.println("-------------------------");
        System.out.println("Chu vi : " + perimeter );
        System.out.println("Dien tich : " + area );

        sc.close();
    }
}