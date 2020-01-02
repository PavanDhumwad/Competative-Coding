package LeetCode.Tree;

import util.Tree.TreeNode;

public class SymmetricTree
{
    public static void main(String[] args) {
        TreeNode root1;
        root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(3);
        if(root1 == null)
            System.out.println("Is tree is Symmetric(When folded from center)? : true");
        System.out.println("Is tree is Symmetric(When folded from center)? : "+isSymmetricTree(root1.left,root1.right));
    }

    private static boolean isSymmetricTree(TreeNode leftSubTree, TreeNode rightSubTree)
    {
        if(leftSubTree == null && rightSubTree ==null)
            return true;
        if(leftSubTree != null && rightSubTree !=null)
        {
            return (leftSubTree.data == rightSubTree.data &&
                    isSymmetricTree(leftSubTree.left, leftSubTree.right) &&
                    isSymmetricTree(leftSubTree.right,rightSubTree.left));
        }
        return false;
    }
}
