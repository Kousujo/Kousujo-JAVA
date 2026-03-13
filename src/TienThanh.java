package src;
import java.util.Scanner;

class Date {
    private int day,month,year;

    public Date() {
        day = 1;
        month = 1;
        year = 2000;
    }

    public void nhap() {
        Scanner nhap = new Scanner(System.in);
        System.out.print("ngay : ");
        day = nhap.nextInt();
        System.out.print("thang : ");
        month = nhap.nextInt();
        System.out.print("nam : ");
        year = nhap.nextInt();
        System.out.println();
    }

    public void in() {
        System.out.printf("%d / %d / %d",day,month,year); 
    }
}

class TinhDiem {
    String ten;
    int sbd;
    double diem1, diem2, diem3, kq;

    public TinhDiem() {
        ten = "Nguyen van A";
        sbd = 123456;
        diem1 = 0;
        diem2 = 0;
        diem3 = 0;
        kq = 0;
    }

    public void nhap() {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Ho ten : ");
        ten = nhap.nextLine();
        System.out.print("So bao danh : ");
        sbd = nhap.nextInt();
        System.out.print("Diem mon 1 : ");
        diem1 = nhap.nextDouble();
        System.out.print("Diem mon 2 : ");
        diem2 = nhap.nextDouble();
        System.out.print("Diem mon 3 : ");
        diem3 = nhap.nextDouble();
        System.out.println();
    }

    public void in() {
        System.out.println(ten + " / " + sbd);
        System.out.println("Diem mon 1 : " + diem1);
        System.out.println("Diem mon 2 : " + diem2);
        System.out.println("Diem mon 3 : " + diem3);
        kq = diem1 + diem2 + diem3;
        System.out.println();
    }

    public void phuongthuc1(int x) {
        if (kq > x) System.out.println("Diem cua thi sinh lon hon " + x + " diem");
        else System.out.println("Diem cua thi sinh be hon " + x + " diem");
    }

    public void phuongthuc2() {
        if (kq > 26) System.out.println("Diem cua thi sinh lon hon 26 diem");
        else System.out.println("Diem cua thi sinh be hon 26 diem");
    }

    public void phuongthuc3() {
        System.out.println("Diem xet tuyen cua thi sinh la : " + kq);
    }

}
public class TienThanh {
    public static void main(String[] args) {
        TinhDiem thanh = new TinhDiem();
        thanh.nhap();
        thanh.in();
        thanh.phuongthuc1(16);
        thanh.phuongthuc2();
    }
}