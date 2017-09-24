package binarySearchTree;

/**
 * A class for producing nodes for a binary search tree data structure.
 * @author Patrick Martinez
 *
 */
public class Node {
	
	private int key;
	private Node leftChild;
	private Node rightChild;
	
	/**
	 * Constructs a node. Set's the key to the val passed.
	 * @param val the key you wish this node to have (integer)
	 */
	Node(int val) {
		key = val;
	}
	
	
	/* SETTERS */
	/**
	 * Sets the key to another value.
	 * @param val value to change the key to.
	 */
	public void setKey(int val) {
		key = val;
	}
	
	/**
	 * Sets the left child to be the passed in node.
	 * @param node The node you wish to be the left child.
	 */
	public void setLeftChild(Node node) {
		leftChild = node;
	}
	/**
	 * Sets the right child to be the passed in node.
	 * @param node The node you wish the right child to be.
	 */
	public void setRightChild(Node node) {
		rightChild = node;
	}
	
	/* GETTERS */
	
	/**
	 * Returns the key that belongs to the node.
	 * @return integer key
	 */
	public int getKey() {
		return key;
	}
	
	/**
	 * Returns the node that is the left child.
	 * @return Returns left child node of this node.
	 */
	public Node getLeftChild() {
		return leftChild;
	}
	
	/**
	 * Returns the node that is the right child.
	 * @return Returns right child of this node.
	 */
	public Node getRightChild() {
		return rightChild;
	}
	
}
