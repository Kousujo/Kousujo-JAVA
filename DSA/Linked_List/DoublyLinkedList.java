package DSA.Linked_List;
import java.util.Scanner;
public class DoublyLinkedList {
    public Node first, last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }   

    public void Traverse() {
    Node p = first;
    while (p != null) {
        System.out.print(p.info + " -> "); 
        p = p.next; 
    }
    System.out.println("null");
    }

    public Node search(int x) {
        Node p = first;
        while (p != null) {
            if (p.info == x) {
                return p;
            }
            p = p.next;
        }
        return null;
    }

    public void inserFirst(int newinfo) {
        Node p = new Node(newinfo);
        if (first == null) first = last = p;
        else {
            p.next = first;
            p.previous = first;
            first = p;
        }
    }

    public void inserElement(int newinfo, Node q) {
        Node p = new Node(newinfo);
        if (q == last) {
            
        }
        p.next = q.next;
        p.previous = q;

    }
}