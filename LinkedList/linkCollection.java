package DSA.LinkedList;
import java.util.LinkedList;

public class linkCollection {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("a");
        list.addFirst("is");

        System.out.println(list);
        list.addFirst("this");
        list.addLast("list");
        System.out.println(list);
        list.removeFirst();
        list.removeLast();

        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("Null");

    }
}
