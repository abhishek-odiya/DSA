package DSA.Queue;


// Queue using 2 stacks

import java.util.Stack;

public class Question01 {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    static void add(int data) {
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }

        s1.push(data);
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }

    }

    static int remove() {
        if(s1.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            return s1.pop();
        }
    }

    static int peek() {
        if(s1.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            return s1.peek();
        }
    }


    public static void main(String[] args) {

        add(1);
        add(2);
        add(3);
        add(4);

        System.out.println(s1);

        while (!s1.isEmpty()){
            System.out.println(peek());
            remove();
        }



    }
}
