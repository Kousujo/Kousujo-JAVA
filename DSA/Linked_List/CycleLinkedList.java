package DSA.Linked_List;
import java.util.Scanner;
public class CycleLinkedList {
    public Node first;

    public CycleLinkedList() {
        this.first = null;
    }

    public void Traverse() {
        if (first == null) {
            System.out.println("null");
        }
        else {
            Node p = first;
            do {
                System.out.print(p.info + " -> "); 
                p = p.next; 
            } while (p.next != first);
            System.out.println("null");
        }
    }

    public Node search(int x) {
        if (first == null) return null;

        Node p = first;
        do {
            if (p.info == x) return p;
            else p = p.next;
        } while (p.next != first);

        return null;
    }

    public void inserFirst(int newinfo) {
        Node p = new Node(newinfo);

        if (first == null) {
            first = p;
            p.next = first;
        }
        else {
            Node q = first;
            while (q.next != first) {
                q = q.next;
            }
            p.next = first;
            first = p;
            q.next = first;
        }
    }

    public void inserEnd(int newinfo) {
        Node p = new Node(newinfo);

        if (first == null) {
            first = p;
            p.next = first;
        }
        else {
            Node q = first;
            do {
                q = q.next;
            } while (q.next != first);
            p.next = first;
            q.next = p;
        }
    }

    

    public static void main(String[] args) {
        CycleLinkedList ds1 = new CycleLinkedList();
        int x;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("so NODE : ");
            int n = sc.nextInt();

            for (int i = 1 ; i <= n ; i++) {
                System.out.printf("nhap x%d : ",i);
                x = sc.nextInt();
                ds1.inserEnd(x);
            }

            ds1.Traverse();
            ds1.search(3);
        }
    }
}