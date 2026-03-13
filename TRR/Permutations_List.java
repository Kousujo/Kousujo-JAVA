package TRR;
import java.util.Scanner;
public class Permutations_List {
    private int[] s;
    private int n,m,k;

    public Permutations_List() {
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

    public void setS() {
        for (int i = 1; i <= this.n ; i++) {
            this.s[i] = i;
        }
    }

    public void lietke() {
        setS();
        int count = 0;
        boolean stop = false;
        while (!stop) {
            output();
            count++;

            this.m = 0;
            for (int i = this.n; i >= 1 ; i--) {
                if (this.s[i] > this.s[i - 1]) {
                    this.m = i - 1;
                    break;
                }
            }

            for (int i = this.n; i >= 1 ; i--) {
                if (this.s[i] > this.s[m]) {
                    this.k = i;
                    break;
                }
            }

            int temp = s[m];
            s[m] = s[k];
            s[k] = temp;    

            if (this.m == 0) stop = true;
            else {
                int j = n;
                for (int i = m + 1 ; i <= n ; i++) {
                    if (i < j) {
                        temp = s[i];
                        s[i] = s[j];
                        s[j] = temp;
                        j--;
                    }
                }
            }
        }
        System.out.println("------------------");
        System.out.print("So hoan vi la : " + count);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Permutations_List hv = new Permutations_List();

            hv.input(sc);
            hv.lietke();

        }
    }
}