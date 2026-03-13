package baitap_coban;
import java.util.Scanner;

class SinhVien { 
    int ma_sinh_vien;
    String ho;
    String ten;
    int sdt;

    void nhapTT() {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        ma_sinh_vien = nhap.nextInt();
        System.out.print("Nhap ho sinh vien: ");
        ho = nhap.nextLine();
        System.out.print("Nhap ten sinh vien: ");
        ten = nhap.nextLine();
        System.out.print("Nhap so dien thoai sinh vien: ");
        sdt = nhap.nextInt();
        System.out.println();
    }

    void xuatTT() {
        System.out.println("Ma sinh vien: " + ma_sinh_vien);
        System.out.println("Ho sinh vien: " + ho);
        System.out.println("Ten sinh vien: " + ten);
        System.out.println("So dien thoai sinh vien: " + sdt);
    }
}
public class Quanlysv {
    void nhapDS(SinhVien sv[], int n) {
        for (int i = 0 ; i < n ; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ": ");
            sv[i] = new SinhVien();
            sv[i].nhapTT();
        }
    }

    void sapXepTen(SinhVien sv[], int n) {
        for (int i = 0 ; i < n - 1 ; i++) {
            for (int j = i + 1 ; j < n ; j++) {
                if (sv[i].ten.compareToIgnoreCase(sv[j].ten) > 0) {
                    SinhVien temp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = temp;
                }
            }
        }
    }
        public static void main(String[] args) {
            Scanner nhap = new Scanner(System.in);
            Quanlysv qlsv = new Quanlysv();
            SinhVien sv[] = new SinhVien[100];
            boolean chon = true;
            int n = 0;
            while(chon) {
                System.out.println("1. Nhap danh sach sinh vien");
                System.out.println("2. Sap xep sinh vien theo ten");
                System.out.println("3. Thoat");
                System.out.print("Chon chuc nang: ");
                int chonChucNang = nhap.nextInt();
                switch(chonChucNang) {
                    case 1:
                        System.out.print("Nhap so luong sinh vien: ");
                        n = nhap.nextInt();
                        qlsv.nhapDS(sv, n);
                        break;
                    case 2:
                        qlsv.sapXepTen(sv, n);
                        System.out.println("Danh sach sinh vien sau khi sap xep theo ten: ");
                        for (int i = 0 ; i < n ; i++) {
                            sv[i].xuatTT();
                            System.out.println();
                        }
                        break; 
                    default:
                        chon = false;
                        System.out.println("Thoat chuong trinh");
                        break;
                }
            }
        }
    }

