package DSA.Tree;


// Binary_Tree (1, 0) -> have at max 2 children
// Ancestors -> Node ke parent node ko ancestor khate hai

// Build tree preorder -> always start from the left side, -1 per null hota hai


public class Binary_Trees {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;        // to track values inside the array
       static Node buildTree(int[] nodes){

            idx++;
            if(nodes[idx] == -1) {      //equal to -1 means no node
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);        //First left then build right
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }


    public static void main(String[] args) {
    int[] node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

    BinaryTree tree = new BinaryTree();
    Node root = tree.buildTree(node);

//        System.out.println(root.data);


    }
}
