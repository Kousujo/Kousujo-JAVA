package TRR;
import java.util.ArrayList;
import java.util.Scanner;
public class Binary_ArrayList {
    private ArrayList<Integer> s;
    private int n,m;

    public Binary_ArrayList() {
        this.s = new ArrayList<>();
        n = m = 0;
    }


    public void input(Scanner sc) {
        System.out.print("Nhap n : ");
        this.n = sc.nextInt();
    }

    public void output() {
        for (int i = 1; i <= this.n ; i++) {
            System.out.printf("%d ",this.s.get(i));
        }
        System.out.println();
    }

    public void ganS() {
        for (int i = 1; i <= this.n ; i++) {
            this.s.set(i, 0);
        }
    }

    public void lietke() {
        this.m = 1;
        while (this.m != 0) {
            output();

            this.m = 0;
            for (int i = this.n; i >= 1 ; i--) {
                if (this.s.get(i) == 0) {
                    this.m = i;
                    break;
                }
            }

            this.s.set(m,1);
            for (int k = this.m + 1 ; k <= this.n ; k++) {
                this.s.set(k,1);
            }
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Binary_List bn = new Binary_List();

            bn.input(sc);
            bn.ganS();
            bn.lietke();

        }
    }
}