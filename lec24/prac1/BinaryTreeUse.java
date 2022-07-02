public class BinaryTreeUse {


    public static void printTree(BinaryTreeNodeClass<Integer> root ) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
        // if (root.left != null) {
        //     printTree(root.left);
        // } 
        // if (root.right != null) {
        //     printTree(root.right);
        // }
    }
    public static void main(String[] args) {
        BinaryTreeNodeClass<Integer> root = new BinaryTreeNodeClass<Integer>(1);
        BinaryTreeNodeClass<Integer> rootLeft = new BinaryTreeNodeClass<Integer>(2);
        BinaryTreeNodeClass<Integer> rootRight = new BinaryTreeNodeClass<Integer>(3);
        root.left = rootLeft;
        root.right = rootRight;

        printTree(root);

        // BinaryTreeNodeClass<Integer> twoRight = new BinaryTreeNodeClass<Integer>(4);
        // BinaryTreeNodeClass<Integer> threeLeft = new BinaryTreeNodeClass<Integer>(5);

        // rootLeft.right = twoRight;
        // rootRight.left = threeLeft; 
        
    }
}
