package binarySearchTree;

import java.util.Scanner; // For INPUT operations
import java.util.concurrent.ThreadLocalRandom; // For random INTs

public class TestDriver {

	public static void main(String[] args) {
		
		final int DEFAULT_SIZE = 5;

		int input = DEFAULT_SIZE;
		
		// IO Operations
		System.out.print("Enter a number of random nodes to add "
				+ "(Default " + DEFAULT_SIZE + "):");
		
		try {
			Scanner sc = new Scanner (System.in);
			input = sc.nextInt();
			sc.close();
		}
		catch(Exception ex) {
			System.out.println("Error on input block!");
			System.out.println("Setting input to default " + DEFAULT_SIZE
					+ "!");
		};
			
		// Building tree
		BinTree binTree1 = new BinTree();
		
		// Adding arbitrary # of nodes
		for (int i = 0; i < input; i++) {
			int numToAdd = ThreadLocalRandom.current().nextInt(0,1001);
			binTree1.insertNode(new Node(numToAdd));
		}
		
		// Display treeWalk
		binTree1.treeWalk();
		
		// test case 2
		System.out.println();
		System.out.println("testcase 2:");
		BinTree binTree2 = new BinTree();
		binTree2.insertNode(new Node(3));
		binTree2.insertNode(new Node(201));
		binTree2.insertNode(new Node(60));
		binTree2.insertNode(new Node(30));
		binTree2.insertNode(new Node(45));
		binTree2.treeWalk();
		
		// test case 3
		System.out.println();
		System.out.println("testcase 2_1:");
		BinTree binTree3 = new BinTree();
		binTree3.insertNode(new Node(-10));
		binTree3.insertNode(new Node(-150));
		binTree3.insertNode(new Node(4));
		binTree3.insertNode(new Node(300));
		binTree3.insertNode(new Node(45));
		binTree3.treeWalk();
		binTree3.insertNode(new Node(-50));
		binTree3.insertNode(new Node(200));
		System.out.println();
		System.out.println("testcase 2_2:");
		binTree3.treeWalk();

	}

}
