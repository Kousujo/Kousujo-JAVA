package DSA.Linked_List;
import java.util.Scanner;
public class SinglyLinkedList {
    public Node head;
    public Node head2;

    public SinglyLinkedList() {
        this.head = null;
        this.head2 = null;
    }

    public void displayData() {
        Node p = head;
        while (p != null) {
        System.out.print(p.info + " -> "); 
        p = p.next; 
    }
        System.out.println("null");
    }

    public void listNum() {
        Node p = head;
        int count = 0;
        while (p != null) {
            count++;
            p = p.next;
        }
        System.out.println("so Node la : " + count);
    }

    public Node searchUnsorted(int x) {
        Node p = head;
        boolean found = false;
        while (p != null && !found) {
            if (p.info == x) {
                found = true;
            }
            else p = p.next;
        }
        return p; // Nếu found là true, p là node cần tìm. Nếu không, p là null.
    }

    public Node searchSorted(int x) { // Sắp xếp tăng dần
        Node p = head;
        boolean found = false;
        while (p != null && p.info <= x && !found) {
            if (p.info == x) found = true;
            else p = p.next;
        }
        return p;
    }

    public void insertFront(int newinfo) {
        Node p = new Node(newinfo);
        p.next = head; 
        head = p;      
    }

    public void insertEnd(int newinfo) {
        Node p = new Node(newinfo);
        Node q = head;
        while (q.next != null) {
            q = q.next;
        }
        q.next = p;
        p.next = null;
    }

    public void insertElement(int newinfo, Node q) {
        Node p = new Node(newinfo);
        p.next = q.next;
        q.next = p;

    }

    public void deleteFirst() {
        Node p;
        p = head;
        head = p.next;
    }

    public void deleteElement(Node q) {
        Node p = q.next;
        if (p != null) {
            q.next = p.next;
        }
    }

    public void ghepds(Node q) {
        Node p;
        if (head2 != null) {
            p = head2;
            while (p.next != null) {
                p = p.next;
            }
            p.next = q.next;
            q.next = head2;
        }
    }

    public void ghepds() {
        Node p;
        if (head2 != null) {
            p = head2;
            while (p.next != null) {
                p = p.next;
                p.next = head2;
            }
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList ds1 = new SinglyLinkedList();
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
            ds1.search(6);

        }
    }
}