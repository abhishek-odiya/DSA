package DSA.Stack;
import java.util.LinkedList;

public class Stack_LinkedList {

     public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    public static class stack {

         public static Node head = null;

         public static boolean isEmpty(){
             return head == null;
         }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public static void pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return;
            }

          head = head.next;
        }

        public static int peek() {
            int d = 0;
            if (isEmpty()) {
                return -1;
            }

            return head.data;
        }
    }


    public static void main(String[] args) {

        stack ls = new stack();
        ls.push(1);
        ls.push(2);
        ls.push(3);
        ls.push(4);


        while (!ls.isEmpty()){
            System.out.println(ls.peek());
            ls.pop();
        }


    }
}
