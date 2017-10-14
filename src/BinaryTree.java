/**
 * This lab creates a binary tree with methods that check whether each object has their data, an element underneath to the left and to the right.
 * 
 * @author  Faith Yap
 * @version 1.0
 * @since   12/14/2015
 */
public class BinaryTree
{
    private Node root;
    /**
     * Creates an object called Node that stores information about each subtree.
     */
    class Node
    {
        public Object data;
        public BinaryTree left;
        public BinaryTree right;
    }
    /**
     * Constructor method that sets the root to null if there are no parameters.
     */
    public BinaryTree()
    {
        root = null;
    }
    /**
     * Constructor method that stores the data and node of the next subtree, wherein the next subtree has no subtrees below it and sets its left and right variables to be empty.
     * @param rootData object that stores the data inside the subtree
     */
    public BinaryTree(Object rootData)
    {
        root = new Node();
        root.data = rootData;
        root.left = new BinaryTree();
        root.right = new BinaryTree();
    }
    /**
     * Constructor method that stores the data and node of the next subtree, wherein the next subtree has subtrees below it and sets the left and right variables to what is given in the parameter.
     * @param rootData object that stores the data inside the subtree
     * @param left object that holds the subtree to the left
     * @param right object that holds the subtree to the right
     */
    public BinaryTree(Object rootData, BinaryTree left, BinaryTree right)
    {
        root = new Node();
        root.data = rootData;
        root.left = left;
        root.right = right;
    }
    /**
     * Returns the height of the entire tree.
     * @return int that stores the height of the tree
     */
    public int height()
    {
        return height(root);
    }
    /**
     * Determines whether the tree is empty by checking if the node is empty.
     * @return boolean statement stating whether the tree is empty or not.
     */
    public boolean isEmpty()
    {
        if (root == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /**
     * Returns the data stored in the node.
     * @return object that holds the data of the node.
     */
    public Object data()
    {
        return root.data;
    }
    /**
     * Returns the subtree stored to the left.
     * @return object BinaryTree that holds the subtree to the left
     */
    public BinaryTree left()
    {
        return root.left;
    }
    /**
     * Returns the subtree stored to the right.
     * @return object BinaryTree that holds the subtree to the right
     */
    public BinaryTree right()
    {
        return root.right;
    }
    /**
     * Recursive method that calculates of the entire tree.
     * @param n node that stores the root to be used in calculations
     * @return int that stores the height of the subtree.
     */
    public static int height(Node n)
    {
        if (n == null)
        {
            return 0;
        }
        else
        {
            int num = 1 + Math.max(height(n.left.root), height(n.right.root));
            return num;
        }
    }
}