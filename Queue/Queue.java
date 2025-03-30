package DSA.Queue;

public class Queue {

    static int front = -1;
    static int rear = -1;

    static int[] data = new int[5];

    static boolean isEmpty(){
        return front == -1 || front > rear;
    }

    static boolean isFull() {
        return rear == data.length -1;
    }

    static void enqueue(int d) {
        if(isFull()){
            System.out.println("OverFlow");
        }
        else{
            if(isEmpty()){
                front = 0;
                rear = 0;
            }
            else {
                rear++;
            }
            data[rear] = d;
            System.out.println(d + " is added");
        }
    }

    static void dequeue() {
        if(isEmpty()){
            System.out.println("underFlow");
        }
        else{
            int del = data[front];
            front++;
            System.out.println(del + " is Removed");
        }

        if(front > rear) {
            front = -1;
            rear = -1;
            System.out.println("All Element is Deleted Queue is Empty");
        }
    }

    static void display() {
        if(isEmpty()){
            System.out.println("underFlow");
        }
        else{
            System.out.print("Elements: ");
            for(int i = front; i <= rear; i++){
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }

    static void peek() {
        if(isEmpty()){
            System.out.println("underFlow");
        }
        else{
            System.out.print("Peek Element: " + data[front]);

        }
    }


    public static void main(String[] args) {

        enqueue(5);
        enqueue(6);
        enqueue(2);
        display();
        peek();


    }
}