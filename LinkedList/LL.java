package DSA.LinkedList;

public class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }


    // Add at first place
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {             // there is no element in the list
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    // Add at Last place
    public void addlast(String data){
        Node newNode = new Node(data);
        if(head == null) {              // there is no element in the list
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }


    public void printList(){
        if(head == null) {              // there is no element in the list
            System.out.println("List is Empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("Null");
    }


    public void deleteFirst() {
        if(head == null) {              // there is no element in the list
            System.out.println("List is Empty");
            return;
        }

        size--;
        head = head.next;
    }


    public void deleteLast() {
        if(head == null) {              // there is no element in the list
            System.out.println("List is Empty");
            return;
        }

        size--;
        if(head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;      // head.next = null -> lastNode = null
        while(lastNode.next != null) {      // null.next
                lastNode = lastNode.next;
                secondLast = secondLast.next;
        }
        secondLast.next = null;

    }

    public int getSize() {
        return size;
    }

    public void reverseIterate() {
        if(head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // Update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }


    public Node reverseRecursive(Node head) {
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }


    public static void main(String[] args) {

        LL l1 = new LL();
        l1.addlast("a");
        l1.addFirst("is");
        l1.addlast("List");

        l1.printList();

        l1.addFirst("this");
        l1.printList();

        l1.deleteLast();
        l1.printList();
        l1.deleteFirst();
        l1.printList();

        System.out.println(l1.getSize());
        l1.addFirst("this");
        l1.addlast("list");
        l1.printList();
//        System.out.println(l1.getSize());

//        l1.reverseIterate();
        l1.head = l1.reverseRecursive(l1.head);
        l1.printList();

    }
}
