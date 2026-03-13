package TRR;
import java.util.Scanner;
public class Combinations_List {
    private int[] s;
    private int n,m,r;

    public Combinations_List() {
        this.s = new int[100];
    }

    public void input(Scanner sc) {
        System.out.print("Nhap n : ");
        this.n = sc.nextInt();
        System.out.print("Nhap r : ");
        this.r = sc.nextInt();
    }

    public void setS() {
        for (int i = 1; i <= this.n ; i++) {
            this.s[i] = 0;
        }
    }

    public void output() {
        for (int i = 1; i <= this.n ; i++) {
            System.out.printf("%d ",this.s[i]);
        }
        System.out.println();
    }

    public void lietke() {
        setS();
        int t = 0;
        boolean stop = false;
        while (!stop) {
            output();

            for (int i = r; i >= 1 ; i--) {
                if (this.s[i] < n - r + i) {
                    this.m = i;
                    break;
                }
            }

            t = s[1];
            if (t == n - r + 1) stop = true;
            else {
                this.s[m] = s[m] + 1;
                for (int i = this.m + 1 ; i <= this.r ; i++) {
                    this.s[i] = s[i - 1] + 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Binary_List bn = new Binary_List();

            bn.input(sc);
            bn.lietke();

            sc.close();
        }
    }
}