package DSA.Queue;

public class circular_Queue {

    static int front = -1;
    static int rear = -1;
    static int size = 5;

    static int[] data = new int[5];

    static boolean isEmpty(){
        return front == -1 && rear == -1;
    }

    static boolean isFull() {
        return (rear + 1) % size == front;          // important Condition for circular queue
    }

    static void enqueue(int d) {
        if(isFull()){
            System.out.println("OverFlow");
        }

        if(front == -1){
            front = 0;
//          rear = 0;
        }

        rear = (rear + 1) % size;
        data[rear] = d;
        System.out.println(d + " is added");

    }

    static void dequeue() {
        if(isEmpty()){
            System.out.println("underFlow");
        }

        int del = data[front];
        if(rear == front){
            rear = front = -1;
            System.out.println(del + " is Removed");
            System.out.println("All Element is Deleted Queue is Empty");
        }else{
            front = (front + 1) % size;
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
            System.out.println("Peek Element: " + data[front]);

        }
    }


    public static void main(String[] args) {

        enqueue(5);
        enqueue(6);
        enqueue(2);
        display();
        peek();
        enqueue(9);
        enqueue(8);

        display();
        dequeue();
        dequeue();
        display();
        enqueue(7);
        enqueue(22);
//        display();
        while (!isEmpty()) {
            peek();
            dequeue();
        }



    }
}