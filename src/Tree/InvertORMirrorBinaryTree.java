package Tree;

import util.Tree.TreeNode;
import static util.Tree.PrintTree.inOrder;

public class InvertORMirrorBinaryTree
{
    public static void main(String[] args) {
        TreeNode root1;
        root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);
        inOrder(root1);
        System.out.println();
        TreeNode root3 = invertBinaryTree(root1);
        inOrder(root3);
    }

    private static TreeNode invertBinaryTree(TreeNode node)
    {
        if (node == null)
            return null;
        TreeNode left = invertBinaryTree(node.left);
        TreeNode right = invertBinaryTree(node.right);
        node.left = right;
        node.right = left;
        return node;
    }
}
