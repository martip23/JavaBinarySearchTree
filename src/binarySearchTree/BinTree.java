package binarySearchTree;

public class BinTree {	
	
	private Node root;
	
	BinTree() {
		System.out.println("BinTree created");
	}
	
	public void insertNode(int num) {
		insertNode(root, num);
	}
	
	public Node insertNode(Node node) {
		if (root == null) {
			root = node;
		}
		else if (node.getKey() < root.getKey()) {
			node.setLeftChild(insertNode(root.getLeftChild()));
		}
		else {
			node.setRightChild(insertNode(root.getRightChild()));
		}
		return node;
	}
	
	private Node insertNode(Node node, int num) {
		// TODO insertNode Stub	
		if (root == null) {
			root = new Node(num);
		} 
		else if (num < root.getKey()){
			insertNode(root.getLeftChild(), num);
		} 
		else {
			insertNode(root.getRightChild(), num);
		}
		return node;
	}
	
	public void treeWalk () {
		treeWalk(root);
	}
	
	private void treeWalk(Node root) {

		if (root != null) {
			treeWalk(root.getLeftChild());
			System.out.println(root.getKey() + "-");
			treeWalk(root.getRightChild());
		}
	}
}
