package DSA.Tree;

import java.util.Queue;
import java.util.LinkedList;

// Preorder Traversal -> Root - Left - Right node when traversal

//Inorder Traversal -> Left - Root - right node when traversal

//Postorder Traversal -> Left - Right - Root node when traversal

// Tree ka BFS traversal -> Level Order traversal [On]


import java.util.LinkedList;
import java.util.Queue;

public class Traversal {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTreee {
        static int idx = -1;

        public static Node buildTrees(int[] nodes) {

            idx++;
            if(nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTrees(nodes);
            newNode.right = buildTrees(nodes);

            return newNode;
        }
    }


    // Preorder Traversal [On]
    public static void preorder(Node root) {
        if(root == null){
            System.out.print(-1 + " ");
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }


    // Inorder Traversal [On]
    public static void inorder(Node root) {
        if(root == null) {
//            System.out.print(-1 + " ");
            return;
        }

        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }


    // Postorder Traversal [On]
    public static void postorder(Node root){
        if(root == null) {
//
//            System.out.print(-1 + " ");
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);
    }



    // Level order Traversal [On]
    public static void levelorder(Node root) {
        if(root == null) {      //if its already Empty
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {
            //taking the first element in currentNode
            Node currNode = q.remove();

            if(currNode == null) {      //jese he null aye new line per shift hona hai
                System.out.println();
                if(q.isEmpty()) {       // Queue blank hai to break, nahi to queue ke last mai null add kardo
                    break;
                }else {
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data + " ");  //data print kara do
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }



    public static void main(String[] args) {
        int[] node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTreee tree = new BinaryTreee();
        Node root = tree.buildTrees(node);
//        System.out.println(root.data);

//        preorder(root);

//        inorder(root);

//        postorder(root);

        levelorder(root);


    }
}
