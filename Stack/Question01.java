package DSA.Stack;
import java.util.Stack;

// Push the Element in the bottom of the stack

public class Question01 {

    static void pushAtBottom(int data, Stack<Integer> s){

        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);

    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(4, s);

        while(!s.isEmpty()){
            System.out.println("Peek: " + s.peek());
            s.pop();
        }

    }
}
