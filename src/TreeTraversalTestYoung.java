/**
 * CSC 1600
 * Data Structures
 *
 * The TreeTraversalTestYoung class implements the pre-order, in-order, and post-order traversal methods as described
 * in the project description below.
 *
 * Project Description:
 *
 * An implementation in Java of the non-recursive traversal algorithm for a binary tree that was presented in this
 * chapter. Write a test program to produce the inorder traversal. First of all, the test program should build a
 * binary tree like the figure below and produce the the inorder traversal output as 10 20 30 40 50 60 70. The numbering
 * in the figure below indicates the inorder traversal.
 *
 * After you have successfully tested the inorder traversal, test pre-order traversal and post-order traversal algorithm.
 * Pre-order traversal should produce in the order of 60 20 10 40 30 50 70 and Post-order traveral in the
 * order of 10 30 50 40 20 70 60.
 *
 * @author Brandon Young
 */
// File Name: TreeTraversalTestYoung.java
public class TreeTraversalTestYoung {
    public static void main(String[] args) {

        // Create the bottom of tree
        BinaryTree<Integer> tree1 = new BinaryTree<Integer>();
        tree1.setRootItem(40);
        tree1.attachLeft(30);
        tree1.attachRight(50);

        //Create the next level up
        BinaryTree<Integer> tree2 = new BinaryTree<Integer>();
        tree2.setRootItem(20);
        tree2.attachLeft(10);
        tree2.attachRightSubtree(tree1);

        // Create the top of the tree
        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        tree.setRootItem(60);
        tree.attachLeftSubtree(tree2);
        tree.attachRight(70);

        // Creates a tree iterator for to iterate over the tree
        TreeIterator<Integer> treeIterator = new TreeIterator<Integer>(tree);
        // Set the traversal method to In-order traversal
        treeIterator.setInorder();

        System.out.println("In-order traversal method: ");
        // Loop through the binary tree and print out each node to confirm the correct order (In-order)
        while( treeIterator.hasNext() ) {
            System.out.println( treeIterator.next() );
        } // end while loop

        System.out.println("Pre-order traversal method: ");
        // Change the iterator type to pre-order traversal
        treeIterator.setPreorder();

        // Loop through the binary tree and print out each node to confirm the correct order (Pre-order)
        while( treeIterator.hasNext() ) {
            System.out.println( treeIterator.next() );
        } // end while loop

        System.out.println("Post-order traversal method: ");
        // Change the iterator type to post-order traversal
        treeIterator.setPostorder();

        // Loop through the binary tree and print out each node to confirm the correct order (Post-order)
        while( treeIterator.hasNext() ) {
            System.out.println( treeIterator.next() );
        } // end while loop

    } // end main
} // end TreeTraversalTestYoung
/*
 * Sample Output:
 * In-order traversal method:
 * 10
 * 20
 * 30
 * 40
 * 50
 * 60
 * 70
 * Pre-order traversal method:
 * 60
 * 20
 * 10
 * 40
 * 30
 * 50
 * 70
 * Post-order traversal method:
 * 10
 * 30
 * 50
 * 40
 * 20
 * 70
 * 60
 *
 * Process finished with exit code 0
 */
