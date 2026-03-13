package baitap_coban;
import java.util.Scanner;
public class Bai24 {
    private int x, y;

    public Bai24(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Bai24() {
        this.x = 0;
        this.y = 0;
    }

public void Nhap(Scanner sc) {
        System.out.print("Nhap x : ");
        this.x = sc.nextInt();
        System.out.print("Nhap y : ");
        this.y = sc.nextInt();
    }

    public void GanToaDo( int x, int y ) {
        this.x = x;
        this.y = y;
    }

    public int GetX() {
        return this.x;
    }

    public int GetY() {
        return this.y;
    }

    public void Display() {
        System.out.printf("( %d ; %d )\n",this.x, this.y);
    }

    public double TinhKhoangCach() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        Bai24 A = new Bai24();
        Bai24 B = new Bai24(6, 7);
        
        A.Nhap(sc);
        System.out.println("-------------------------");
        System.out.print("Toa do A : ");
        A.Display();
        System.out.print("Toa do B : ");
        B.Display();

        Double KhoangCachA = A.TinhKhoangCach();
        Double KhoangCachB = B.TinhKhoangCach();
        
        System.out.println("-------------------------");
        System.out.printf("Khoang Cach cua Diem A va B tu goc toa do la : %.2f va %.2f\n",KhoangCachA,KhoangCachB);
        System.out.println("-------------------------");
        System.out.print("Gan toa do cho Diem A2 : " );
        A.GanToaDo(3, 6);
        A.Display();
        Double KhoangCachA2 = A.TinhKhoangCach();
        System.out.println("-------------------------");
        System.out.printf("Khoang Cach cua Diem A2 tu goc toa do la : %.2f\n",KhoangCachA2);
        System.out.println("-------------------------");
        int tongToaDo = A.GetX() + A.GetY();
        System.out.println("Tong X+Y la: " + tongToaDo);
        }   
    }
}