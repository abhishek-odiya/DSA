package DSA.LinkedList;

public class cycleInList {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addEle(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void display() {
        if(head == null) {
            System.out.println("List is Empty");
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
    }


    public boolean hasCycle(Node head) {
        if(head == null) {
            return false;
        }

        Node hare = head;
        Node turtle = head;

        while(hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if(hare == turtle) {
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {

        cycleInList c = new cycleInList();
        c.addEle(2);
        c.addEle(1);
        c.addlast(3);
        c.addlast(4);

        c.display();

    }
}
