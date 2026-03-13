package DSA.Linked_List;
import java.util.Scanner;

class SinhVien {
    private int stt;
    private String hoTen;
    private int GPA;
    private String DRL;

    public SinhVien(int stt, String hoTen, int diem, String diaChi) {
        this.stt = stt;
        this.hoTen = hoTen;
        this.GPA = diem;
        this.DRL = diaChi;
    }

    public void nhap(Scanner sc) {
        this.stt = sc.nextInt();
    }

    public String toString() {
        return String.format("STT: %-3d | Ho ten: %-20s | Diem: %-3d | Dia chi: %s",stt, hoTen, diem, diaChi);
    }
}

public class QuanLySinhVien {
    private SinhVien[] danhSach;  
    private int n; // Số phần tử thực tế đang có (Size)
    private int max; // Sức chứa tối đa (Capacity)

    // Khởi tạo danh sách với sức chứa tối đa là 100
    public QuanLySinhVien() {
        this.max = 100;
        this.danhSach = new SinhVien[max];
        this.n = 0;
    }

    // Phương thức nhập (Thêm phần tử vào cuối danh sách)
    public void nhapDanhSach(Scanner sc) {
        System.out.print("Nhap so luong sinh vien muon them: ");
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            if (n >= max) {
                System.out.println("Danh sach da day (Overflow)!");
                break;
            }
            
            System.out.println("\nNhap sinh vien thu " + (n + 1) + ":");
            System.out.print("STT: ");
            int stt = sc.nextInt();
            sc.nextLine(); // "Dọn dẹp" Enter dư (Giống cin.ignore)

            System.out.print("Ho ten: ");
            String hoTen = sc.nextLine();

            System.out.print("Diem: ");
            int diem = sc.nextInt();
            sc.nextLine(); // "Dọn dẹp" Enter dư

            System.out.print("Dia chi: ");
            String diaChi = sc.nextLine();

            // Chèn vào cuối danh sách đặc
            danhSach[n] = new SinhVien(stt, hoTen, diem, diaChi);
            n++; // Tăng số lượng phần tử thực tế
        }
    }

    // Phương thức hiển thị
    public void hienThi() {
        if (n == 0) {
            System.out.println("Danh sach trong!");
            return;
        }
        System.out.println("\n======= DANH SACH SINH VIEN (DANH SACH DAC) =======");
        for (int i = 0; i < n; i++) {
            System.out.println(danhSach[i]);
        }
        System.out.println("Tong so: " + n + " sinh vien.");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            QuanLySinhVien ql = new QuanLySinhVien();
            ql.nhapDanhSach(sc);
            ql.hienThi();
        }
    }
}
