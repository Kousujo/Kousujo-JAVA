/*Nhập vào mốt số nguyên dương, kiểm tra xem số đó có phải số hoàn thiện hay không! (Số hoàn thiện là
số có giá trị bằng tổng tất cả các ước số của nó không tính bản thân nó).*/
package baitap_coban;
import java.util.Scanner;
public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num,sum = 1;
        boolean check = true;

        System.out.print("Nhap so : ");
        num = sc.nextLong();
        
        if (num <= 1) check = false; 
        for (long i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if ( sum != num ) check = false;

        System.out.println("-------------------------");
        String result = (check) ? "Day la so hoan thien!" : "Day khong phai la so hoan thien!";
        System.out.print(result);

        sc.close();
    }
}
