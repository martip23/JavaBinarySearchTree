package binarySearchTree;

/**
 * A class for a binary search tree data structure.
 * This creates an empty node called root. 
 * It is used by creating BST's with each node being another BST.
 * 
 * @author Patrick Martinez
 *
 */
public class BinTree {	
	
	private Node root;
	
	/**
	 * Inserts a node into the BST.
	 * This should only be called by client on the root node.
	 * @param node the node you want to insert
	 */
	public void insertNode(Node node) {
		root = insertNode(root, node);
	}
	
	/**
	 * A private utility used by the insert function.
	 * Recursively attempts to add a node.
	 * If the root is empty, will set the node as root.
	 * If not, method will pass the node to the left or right BST.
	 * @param root the root node of this BST.
	 * @param node the node you wish to insert.
	 * @return returns the root node to reset links as it goes up tree.
	 */
	private Node insertNode(Node root, Node node) {
		
		if (root == null) {
			root = node;
			return root;
		}
		
		if (node.getKey() < root.getKey()) {
			root.setLeftChild(insertNode(root.getLeftChild(), node));
		}
		else {
			root.setRightChild(insertNode(root.getRightChild(), node));
		}
		return root;
	}
	
	/**
	 * Returns and prints the tree in-order.
	 */
	public void treeWalk () {
		treeWalk(root);
	}
	
	/**
	 * A private utility to print node keys in-order.
	 * If this node is empty, will not print anything.
	 * @param root the root of the BST that called treeWalk
	 */
	private void treeWalk(Node root) {

		if (root != null) {
			treeWalk(root.getLeftChild());
			System.out.print(root.getKey() + "|");
			treeWalk(root.getRightChild());
		}
	}
}
