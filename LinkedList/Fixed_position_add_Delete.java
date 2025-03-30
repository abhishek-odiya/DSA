package DSA.LinkedList;

public class Fixed_position_add_Delete {

    Node head;
    class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        if(head == null) {
            System.out.println("list is Empty");
            return;
        }
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }


    public void insertAtGivenPos(int data, int pos) {
        Node newNode = new Node(data);

        //Add at first place
        if(pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int count = 1;
        while(temp != null && count < pos - 1){
            temp = temp.next;
            count++;
        }
        if(temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    //Delete Node From a specific location
    public void deleteFromPos(int pos) {
        if(head == null) {
            System.out.println("list is Empty");
            return;
        }

        if(pos == 1) {
            head = head.next;
            return;
        }

        Node temp = head;
        int count = 1;
        while(temp != null && count < pos -1){
            temp = temp.next;
            count++;
        }

        if(temp == null || temp.next == null) {
            System.out.println("invalid Position");
            return;
        }
        temp.next = temp.next.next;
    }




    public static void main(String[] args){

        Fixed_position_add_Delete l1 = new Fixed_position_add_Delete();

        l1.insertAtGivenPos(10,1);
        l1.insertAtGivenPos(20,2);
        l1.insertAtGivenPos(30,3);
        l1.insertAtGivenPos(40,4);
        l1.insertAtGivenPos(50,5);

        l1.display();
        l1.deleteFromPos(3);
        l1.display();

    }
}