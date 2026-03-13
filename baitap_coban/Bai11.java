//Viết chương trình nhập vào điểm thang 10, xuất ra điểm chữ.
package baitap_coban;
import java.util.Scanner;
public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score;
        char rank = ' ';

        System.out.print("Nhap diem : ");
        score = sc.nextDouble();

        if (score > 10 || score < 0) System.out.print("Diem không hợp lệ!"); 
        else if (score >= 8.5) rank = 'A';
        else if (score >= 7.0) rank = 'B'; 
        else if (score >= 5.5) rank = 'C';
        else if (score >= 4.0) rank = 'D';
        else rank = 'F';

        System.out.println("-------------------------");
        System.out.print("Diem chu la : " + rank);

        sc.close();
    }
}