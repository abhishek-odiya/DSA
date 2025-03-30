package DSA.Queue;

public class Queue_LinkedList {

    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public boolean isEmpty() {
            return head == null && tail == null;
        }

        public void add(int data) {
            Node newNode = new Node(data);
            if(isEmpty()){
                tail = head = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public int remove() {
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int front = head.data;

            if(head == tail) {      //Single Node
                tail = null;
            }

            head = head.next;
            return front;
        }


        public int peek() {
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }


    public static void main(String[] args) {

        Queue q1 = new Queue();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);

//        System.out.println(q1.peek());
//
//        System.out.println(q1.remove());
//        System.out.println(q1.peek());

        while (!q1.isEmpty()){
            System.out.println(q1.remove());
        }

    }
}
