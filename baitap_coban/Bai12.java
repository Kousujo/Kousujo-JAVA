//Viết chương trình nhập vào điểm chữ, xuất ra điểm thang 4.
package baitap_coban;
import java.util.Scanner;
public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score;
        String rank;

        System.out.print("Nhap diem : ");
        rank = sc.next().toUpperCase();

        // switch (rank) {
        //     case "A":
        //         score = 4.0;
        //         break;
        //     case "B":
        //         score = 3.0;
        //         break;
        //     case "C":
        //         score = 2.0;
        //         break;
        //     case "D":
        //         score = 1.0;
        //         break;
        //     default:
        //         score = 0.0;
        //         break;
        // }

        score = switch(rank) {
            case "A" -> 4.0;
            case "B" -> 3.0;
            case "C" -> 2.0;
            case "D" -> 1.0;
            default -> 0.0;
        };

        System.out.println("-------------------------");
        System.out.print("Diem he 4 la : " + score);

        sc.close();
    }
}