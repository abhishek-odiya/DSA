package DSA.LinkedList;

public class del_Nth_Element {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public void addFirstPlace(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }


    public void addLastPlace(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
                currNode = currNode.next;
        }
        currNode.next = newNode;
    }


    public void display() {
        if (head == null){
            System.out.println("List is Empty");
            return;
        }

        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println(" null ");
    }


    public Node removeNth(Node head, int n) {
        if(head.next == null){          // If the list has only one Element
            return null;
        }

        int size = 0;           // Size of array
        Node curr = head;
        while(curr != null) {
            curr = curr.next;
            size++;
        }

        if (n == size) {            // If size is equal to n then I have to return head ka next
            return head.next;
        }

       // int indexToSearch = size - n - 1;       // Finding the current Node and just print it.

        int indexToSearch = size - n;       // Finding the previous element
        Node prev = head;
        int i = 0;
        while(i < indexToSearch) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;       // Change its address to the next - next element
        return head;
    }




    public static void main (String[]  args){

        del_Nth_Element d = new del_Nth_Element();
        d.addFirstPlace(2);
        d.addFirstPlace(1);
        d.addLastPlace(3);
        d.addLastPlace(4);
        d.addLastPlace(5);

        d.display();

        d.removeNth(d.head, 3);
        d.display();

    }
}