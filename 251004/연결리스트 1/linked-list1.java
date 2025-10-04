import java.util.Scanner;

class Node {
    String data;
    Node next;
    Node prev;

    public Node() {}

    public Node(String data) {
        this.data = data;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sInit = sc.nextLine();
        Node cur = new Node(sInit);
        int n = sc.nextInt();

        Node head = new Node();
        Node tail = new Node();

        head.next = tail;
        tail.prev = head;

        insertAfter(head, cur);

        while(n-- > 0) {
            int cmd = sc.nextInt();

            if (cmd == 1) {
                String data = sc.next();
                insertBefore(cur, new Node(data));
            } else if (cmd == 2) {
                String data =sc.next();
                insertAfter(cur, new Node(data));
            } else if (cmd == 3) {
                if (cur.prev != head) cur = cur.prev;
            } else {
                if (cur.next != tail) cur = cur.next;
            }

            System.out.print((cur.prev == head ? "(Null)" : cur.prev.data) + " ");
            System.out.print((cur == null ? "(Null)" : cur.data) + " ");
            System.out.print((cur.next == tail ? "(Null)" : cur.next.data) + " ");
            System.out.println();
        }
    }

    public static void insertBefore(Node cur, Node newNode) {
        Node p = cur.prev;
        newNode.prev = p;
        newNode.next = cur;
        p.next = newNode;
        cur.prev = newNode;
    }

    public static void insertAfter(Node cur, Node newNode) {
        Node n = cur.next;
        newNode.prev = cur;
        newNode.next = n;
        cur.next = newNode;
        n.prev = newNode; 
    }
}