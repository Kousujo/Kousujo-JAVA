package baitap_coban;
import java.util.Scanner;
public class Bai25 {
    private long tuSo, mauSo;

    public Bai25() {
        this.tuSo = 0;
        this.mauSo = 1;
        Chuanhoa();
    }

    public Bai25(long a, long b) {
        this.tuSo = a;
        this.mauSo = b;
        Chuanhoa();
    }

    public void Inphanso() {
        System.out.printf("%d/%d\n",this.tuSo,this.mauSo);
    }

    public String toString() {
        if (mauSo == 1) return String.valueOf(tuSo);
        if (tuSo == 0) return "0";
        return tuSo + "/" + mauSo;
    }

    public void Nhap(Scanner sc) {
        System.out.print("Nhap tu so : ");
        tuSo = sc.nextLong();
        do {
            System.out.print("Nhap mau so (phai khac 0): ");
            this.mauSo = sc.nextLong();
            if (this.mauSo == 0) System.out.println("Loi: Mau so khong duoc bang 0!");
        } while (this.mauSo == 0);
        Chuanhoa();
    }

    public boolean checkmauso() {
        return this.mauSo == 0;
    }

    public void NghichDao() {
        if (this.tuSo == 0) {
            System.err.println("Khong the nghich dao vi tu so bang 0");
        }
        else {
            long temp = this.mauSo;
            this.mauSo = this.tuSo;
            this.tuSo = temp;
        }
    }

    public Bai25 Congphanso(Bai25 ps2) {
        long tuSomoi = (this.tuSo * ps2.mauSo) + (ps2.tuSo * this.mauSo);
        long mauSomoi = this.mauSo * ps2.mauSo;
        return new Bai25(tuSomoi, mauSomoi);
    }

    public Bai25 Truphanso(Bai25 ps2) {
        long tuSomoi = (this.tuSo * ps2.mauSo) - (ps2.tuSo * this.mauSo);
        long mauSomoi = this.mauSo * ps2.mauSo;
        return new Bai25(tuSomoi, mauSomoi);
    }

    public Bai25 Nhanphanso(Bai25 ps2) {
        long tuSomoi = this.tuSo * ps2.tuSo;
        long mauSomoi = this.mauSo * ps2.mauSo;
        return new Bai25(tuSomoi, mauSomoi);
    }

    public Bai25 Chiaphanso(Bai25 ps2) {
        long tuSomoi = this.tuSo * ps2.mauSo;
        long mauSomoi = this.mauSo * ps2.tuSo;
        return new Bai25(tuSomoi, mauSomoi);
    }

    public int compareTo(Bai25 ps2) {
        long val1 = this.tuSo * ps2.mauSo;
        long val2 = ps2.tuSo * this.mauSo;
        return Long.compare(val1, val2);
    }
    public void KQsothuc() {
        double kq = (double) this.tuSo/this.mauSo;
        System.out.printf("Gia tri thuc cua phan so : %.3f\n",kq);
    }

    private long UCLN() {
        long a = Math.abs(this.tuSo);
        long b = Math.abs(this.mauSo);
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    private void Rutgon() {
        long uncl = UCLN();
        this.tuSo /= uncl;
        this.mauSo /= uncl;
    }

    private void Chuanhoa() {
        if (mauSo == 0) return;
        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
        Rutgon();
    }

    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        
        System.out.println("=== DEPLOYING PHAN SO SYSTEM ===");
        
        Bai25 ps1 = new Bai25(); 
        System.out.println("Nhap thong so cho Phan so 1:");
        ps1.Nhap(sc);
        
        Bai25 ps2 = new Bai25(3, -6);
        
        System.out.println("\n--- Check Inventory ---");
        System.out.print("Phan so 1 (dung Inphanso): ");
        ps1.Inphanso(); 
        System.out.println("Phan so 2 (dung toString): " + ps2); 
        
        System.out.println("\n--- Arithmetic Testing ---");
        Bai25 tong = ps1.Congphanso(ps2);
        Bai25 hieu = ps1.Truphanso(ps2);
        Bai25 tich = ps1.Nhanphanso(ps2);
        Bai25 thuong = ps1.Chiaphanso(ps2);
        
        System.out.println("Tong: " + tong);
        System.out.println("Hieu: " + hieu);
        System.out.println("Tich: " + tich);
        System.out.println("Thuong: " + thuong);
        
        System.out.println("\n--- State Modification ---");
        System.out.print("Nghich dao ps1: ");
        ps1.NghichDao();
        System.out.println(ps1);
        
        System.out.println("\n--- Comparison logic ---");
        int check = ps1.compareTo(ps2);
        if (check > 0) {
            System.out.println("Result: ps1 > ps2");
        } else if (check < 0) {
            System.out.println("Result: ps1 < ps2");
        } else {
            System.out.println("Result: ps1 == ps2");
        }
        
        System.out.println("\n--- Decimal Analysis ---");
        ps1.KQsothuc();
        ps2.KQsothuc();
        
        System.out.println("\n=== SYSTEM STABLE - QUEST COMPLETE ===");
    } catch (Exception e) {
        System.out.println("Bug detect: " + e.getMessage());
    }
}
}