package binarySearchTree;

public class Node {
	
	private int key;
	private Node leftChild;
	private Node rightChild;
	
	Node(int val) {
		key = val;
	}
	
	
	/* SETTERS */
	public void setKey(int val) {
		key = val;
	}
	
	public void setLeftChild(Node node) {
		leftChild = node;
	}
	
	public void setRightChild(Node node) {
		rightChild = node;
	}
	
	/* GETTERS */
	public int getKey() {
		return key;
	}
	
	public Node getLeftChild() {
		return leftChild;
	}
	
	public Node getRightChild() {
		return rightChild;
	}
	
}
