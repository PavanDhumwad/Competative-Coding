package Tree;

import util.Tree.TreeNode;

public class Sibling
{
    public static void main(String[] args) {
        TreeNode root;
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        TreeNode node1 = root.left;
        TreeNode node2 = root.left.right;
        System.out.println("Node1 & Node2 have same parent? : "+isSibling(root, node1, node2));
    }

    private static boolean isSibling(TreeNode root, TreeNode node1, TreeNode node2)
    {
        if(root == null)
            return false;
        return  (root.left == node1 && root.right == node2) ||
                (root.right == node1 && root.left == node1) ||
                (isSibling(root.left, node1, node2)) ||
                (isSibling(root.right, node1, node2));
    }
}
