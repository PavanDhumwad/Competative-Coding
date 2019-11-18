package Tree;
/*
    1. Check data of the root nodes (tree1->data ==  tree2->data)
    2. Check left subtrees recursively
          tree1->left_subtree, tree2->left_subtree
    3. Check right subtrees recursively
          tree1->right_subtree, tree2->right_subtree)
    If a1,2,&3 are true then it is Identical else not.
 */
class Node
{
    int data;
    Node left, right;
    Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}

public class BinTreeIdentical
{
    public static void main(String[] args)
    {
        Node root1;
        root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);

        Node root2;
        root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);

        System.out.println("IsBinaryTreeIdentical? : "+isBinaryTreeIdentical(root1,root2));
    }

    private static boolean isBinaryTreeIdentical(Node tree1, Node tree2)
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


