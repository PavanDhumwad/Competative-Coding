package Tree;

import util.Tree.TreeNode;

public class LevelOrDepth
{
    public static void main(String[] args) {
        TreeNode root;
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        TreeNode level4 = root.left.right.right;
        System.out.println("Level is "+findLevel(root, level4, 1));
    }

    private static int findLevel(TreeNode root, TreeNode level4, int level)
    {
        if(root == null)
            return 0;
        if(root==level4)
            return level;
        int depth = findLevel(root.left, level4, level+1);
        if(depth != 0)
            return depth;
        return findLevel(root.right,level4,level+1);
    }

}
