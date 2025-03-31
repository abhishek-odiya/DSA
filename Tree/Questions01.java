package DSA.Tree;


public class Questions01 {

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

    static class BTree{
        static int idx = -1;
        public static Node build(int[] nodes) {

            idx++;
            if(nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = build(nodes);
            newNode.right = build(nodes);

            return newNode;
        }
    }



    // Q1 -> Count of Nodes
    public static int countOfNode(Node root) {
        if(root == null) {
            return 0;
        }

        int leftCount = countOfNode(root.left);
        int rightCount = countOfNode(root.right);

        return leftCount + rightCount + 1;
    }


    // Q2 -> Sum of Nodes [On]
    public static int sumOfNodes(Node root) {
        if(root == null) {
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }


    // Q3 Height of tree -> no. of levels [On]
    public static int height(Node root) {

        if(root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int maxHeight = Math.max(leftHeight, rightHeight) + 1;

        return maxHeight;
    }



    //Diameter of a tree -> longest path -> [On^2]
    public static int diameter(Node root) {
        if(root == null) {
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;

        return Math.max(diam1, Math.max(diam2, diam3));
    }


    //Diameter of a tree -> longest path -> [On]
   static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root) {

        if(root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int myDiam = Math.max(diam1, Math.max(diam2, diam3));

        TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
        return myInfo;
    }


    public static void main(String[] args) {
        int[] node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BTree tree = new BTree();
        Node root = tree.build(node);
//        System.out.println(root.data);

//        System.out.println(countOfNode(root));

//        System.out.println(sumOfNodes(root));

//        System.out.println(height(root));

//        System.out.println(diameter(root));

        System.out.println(diameter2(root).diam);

    }
}
