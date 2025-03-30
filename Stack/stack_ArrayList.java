package DSA.Stack;

import java.util.ArrayList;

public class stack_ArrayList {

    static class Stacks {
        static ArrayList<Integer> list = new ArrayList<Integer>();

       public static boolean isEmpty() {
            return list.size() == 0;
        }

       public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            else {
               return list.remove(list.size() - 1);
            }
        }

        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            else {
                return list.get(list.size() - 1);
            }
        }

    }

    public static void main(String[] args) {

        Stacks s = new Stacks();
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

        }

    }

