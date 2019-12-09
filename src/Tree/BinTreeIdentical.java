package Tree;

import util.Tree.TreeNode;

/*
    1. Check data of the root nodes (tree1->data ==  tree2->data)
    2. Check left subtrees recursively
          tree1->left_subtree, tree2->left_subtree
    3. Check right subtrees recursively
          tree1->right_subtree, tree2->right_subtree)
    If a1,2,&3 are true then it is Identical else not.
 */
public class BinTreeIdentical
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

        System.out.println("IsBinaryTreeIdentical? : "+isBinaryTreeIdentical(root1,root2));
    }

    private static boolean isBinaryTreeIdentical(TreeNode tree1, TreeNode tree2)
    {
        if(tree1==null && tree2 == null)
            return true;
        if(tree1!=null && tree2 != null)
        {
            return (tree1.data == tree2.data &&
                    isBinaryTreeIdentical(tree1.left,tree2.left) &&
                    isBinaryTreeIdentical(tree2.right,tree2.right)
                    );
        }
        return false;
    }

}


