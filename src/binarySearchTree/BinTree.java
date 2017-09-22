package binarySearchTree;

public class BinTree {	
	
	private Node root;
	
	BinTree() {
		System.out.println("BinTree created");
	}
	
	public void insertNode(Node node) {
		root = insertNode(root, node);
	}
	
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
	
	public void treeWalk () {
		treeWalk(root);
	}
	
	private void treeWalk(Node root) {

		if (root != null) {
			treeWalk(root.getLeftChild());
			System.out.print(root.getKey() + "|");
			treeWalk(root.getRightChild());
		}
	}
}
