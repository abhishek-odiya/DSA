package DSA.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Sum_of_Kth_level {

    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class TreeStructure{
        static int idx = -1;
        public static Node tree(int[] nodes){

            idx++;
            if(nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = tree(nodes);
            newNode.right = tree(nodes);

            return newNode;
        }
    }



    // Sum of Nodes at Kth Level
    public static int sumOfk(Node root) {

        if(root == null) {
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {

            Node currNode = q.remove();
            if(currNode == null) {
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else {
                    q.add(null);
                }
            }

            else{
                System.out.print(currNode.data);
            }

        }

return 0;

    }




    public static void main(String[] args) {

        int[] node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        TreeStructure t = new TreeStructure();
        Node root = t.tree(node);
//        System.out.println(root.data);

//        System.out.println(sumOfk(root));

    }
}
