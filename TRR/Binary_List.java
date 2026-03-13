package TRR;
import java.util.Scanner;
public class Binary_List {
    private int[] s;
    private int n,m;

    public Binary_List() {
        this.s = new int[100];
        this.n = this.m = 0;
    }

    public void input(Scanner sc) {
        System.out.print("Nhap n : ");
        this.n = sc.nextInt();
    }

    public void output() {
        for (int i = 1; i <= this.n ; i++) {
            System.out.printf("%d ",this.s[i]);
        }
        System.out.println();
    }

    public void ganS() {
        for (int i = 1; i <= this.n ; i++) {
            this.s[i] = 0;
        }
    }

    public void lietke() {
        ganS();
        boolean stop = false;
        while (!stop) {
            output();

            this.m = 0;
            for (int i = this.n; i >= 1 ; i--) {
                if (this.s[i] == 0) {
                    this.m = i;
                    break;
                }
            }


            if (this.m == 0) stop = true;
            else {
                this.s[m] = 1;
                for (int k = this.m + 1 ; k <= this.n ; k++) {
                    this.s[k] = 0;
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