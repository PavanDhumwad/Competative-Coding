package Tree;

import util.Tree.TreeNode;

import static util.Tree.PrintTree.inOrder;

public class MergeTwoBinaryTrees
{
    public static void main(String[] args)
    {
        TreeNode root1;
        root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);

        TreeNode root2;
        root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);

        TreeNode root3 = mergeBinaryTree(root1,root2);
        System.out.println("In order traversal ");
        inOrder(root3);

    }
    private static TreeNode mergeBinaryTree(TreeNode tree1, TreeNode tree2)
    {
        if(tree1==null)
            return tree2;
        if(tree2 ==null)
            return tree1;
        tree1.data += tree2.data;
        tree1.left = mergeBinaryTree(tree1.left,tree2.left);
        tree1.right = mergeBinaryTree(tree1.right,tree2.right);
        return tree1;
    }
}
