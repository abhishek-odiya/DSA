package DSA.LinkedList;

public class palindrome {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public void addElement(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void display() {
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }


//    To check palindrome

    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;

            // Update
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node findMiddle(Node head) {
        Node hare = head;
        Node turtle = head;

        while(hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }


     public boolean isPalindrome(Node head) {
        if(head == null || head.next == null) {
            return true;
        }

        Node middle = findMiddle(head);         // 1st half ka end
        Node secondHalfStart = reverse(middle.next);

        Node firstHalfStart = head;
        while (secondHalfStart != null) {
            if(firstHalfStart.data != secondHalfStart.data) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }

        return true;
     }



    public static void main(String[] args){

        palindrome pl = new palindrome();
        pl.addElement(1);
        pl.addElement(2);
        pl.addElement(2);
        pl.addElement(1);
//        pl.addElement(1);

        pl.display();

        System.out.println("Palindrome: " + pl.isPalindrome(pl.head));

    }
}
