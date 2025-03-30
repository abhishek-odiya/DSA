package DSA.Stack;

public class stackes {

    static int top = -1;
    static int[] data = new int[3];

     static boolean isEmpty(){
         return top == -1;
    }

    static boolean isFull() {
         return top == data.length -1;
    }

     static void push(int d) {
         if(isFull()){
             System.out.println("OverFlow! Stack is Full");
         }
         else{
             top++;
             data[top] = d;
             System.out.println(d + " is added");
//             System.out.println("top is: " + top + " and the array length is: " + data.length);
         }
    }

    static void pop() {
         if(isEmpty()){
             System.out.println("UnderFlow! Stack is Empty");
         }
         else{
             int del = data[top];
             top--;
             System.out.println(del + " is deleted From the Stack");
         }
    }

    static void display() {
         if(isEmpty()) {
             System.out.println("Stack is Empty");
         }
         else {
             System.out.print("Total Element inside the Stack is: ");
             for (int i = 0; i <= top; i++) {
                 System.out.print(data[i] + " ");
             }
             System.out.println();
         }
    }

    static void peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty. No top element.");
        } else {
            System.out.println("Top element is: " + data[top]);
        }
    }


    public static void main(String[] args) {

    push(5);
    display();
    push(3);
    push(10);
    push(6);
    display();
    push(6);
    pop();
    pop();
    display();
    pop();
    pop();
    pop();
        push(3);
        push(10);
        push(6);
        display();
        pop();
        display();


    }
}
