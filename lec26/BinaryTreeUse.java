public class BinaryTreeUse {
    
    public static boolean searchBST(BinaryTreeNode<Integer> root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        if (data < root.data) {
            return searchBST(root.left, data);
        }
        return searchBST(root.right, data);
    }
}
