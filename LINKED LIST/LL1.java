
public class LL1 {
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void displayrec(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        displayrec(head.next);

    }

    public static void displayrecR(Node head) {
        if (head == null) {
            return;
        }
        displayrecR(head.next);
        System.out.print(head.data + " ");
    }

    public static int countNo(Node head) {
        int i = 0;
        while (head != null) {
            i++;
            head = head.next;
        }
        return i;
    }

    public static int countNoRec(Node head, int n) {
        if (head == null) {
            return 0;
        }
        n++;
        countNoRec(head.next, n);
        return n;
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(8);
        Node c = new Node(7);
        Node d = new Node(9);
        Node e = new Node(2);
        Node f = new Node(56);
        // 5 8 7 9 2 50
        a.next = b; // 5-> 8 7 9 2 56
        b.next = c; // 5-> 8-> 7 9 2 56
        c.next = d; // 5-> 8-> 7-> 9 2 56
        d.next = e; // 5-> 8-> 7-> 9-> 2 56
        e.next = f; // 5-> 8-> 7-> 9-> 2-> 56
        System.out.println(a.next);// Shows the address of the b
        System.out.println(b);// Shows the address of the b
        System.out.println(a.data);// Value stored in a
        System.out.println(b.data); // Value stores in b
        System.out.println(a.next.data);// Value store in the b

        // Displaying the node
        System.out.println("Displaying the node by method 1");
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);
        System.out.println(a.next.next.next.next.next.data);

        System.out.println("Displaying the node by method 2");
        Node temp = a;
        // for(int i = 1;i<=6; i++){
        // System.out.print(temp.data + " ");
        // temp = temp.next;
        // }
        System.out.println();
        System.out.println("Displaying the node by method 3");

        // Node temp = a;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Displaying the node by method 4");
        // BY using method
        display(a);
        System.out.println();
        System.out.println("Displaying the node by method 5");
        // By using recusion
        displayrec(a);

        System.out.println();
        System.out.println("Displaying the node by method 6");
        // By using recusion and reversely
        displayrecR(a);

        // METHOD OR RECURSION TO FIND THE LENGTH OF THE LINKED LIST

        System.out.println();
        System.out.println("LENGTH OF THE LINKED LIST");
        System.out.println("Method 1");
        int i = 0;
        Node head = a;
        while (head != null) {
            i++;
            head = head.next;
        }
        System.out.println("The number of node in the linked list are " + i);

        System.out.println("Method 2 using method ");
        System.out.println(countNo(a));
        System.out.println("Method 3 using recursion ");
        System.out.println(countNoRec(a, 0));
    }
}