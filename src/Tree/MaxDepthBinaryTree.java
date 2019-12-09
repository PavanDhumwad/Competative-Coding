package Tree;

import util.Tree.TreeNode;

/*
1. If tree is empty then return 0
2. Else
      (a) Get the max depth of left subtree recursively  i.e.,
          call maxDepth( tree->left-subtree)
      (b) Get the max depth of right subtree recursively  i.e.,
          call maxDepth( tree->right-subtree)
      (c) Get the max of max depths of left and right
          subtrees and add 1 to it for the current node.
      (d) max_depth =
           max(max dept of left subtree,max depth of right subtree)+ 1
      (e) Return max_depth

 */
public class MaxDepthBinaryTree
{
    public static void main(String[] args)
    {
        TreeNode root;
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(5);
        System.out.println("Max depth = "+maxDepth(root));
    }

    private static int maxDepth(TreeNode root)
    {
        if(root == null)
            return 0;
        else {
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            return Math.max(leftDepth, rightDepth)+1;
        }
    }

}
