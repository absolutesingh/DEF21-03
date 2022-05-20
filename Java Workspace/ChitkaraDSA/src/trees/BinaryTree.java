package trees;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class BinaryTree {
	Node root; // Root of the Binary Tree

	BinaryTree(int rootData) {
		this.root = new Node(rootData);
	}

//	https://practice.geeksforgeeks.org/problems/sum-of-binary-tree/1/#
	int treeSum(Node root) {
		if (root == null)
			return 0;

		return root.data + treeSum(root.left) + treeSum(root.right);
	}

	int countNodes(Node root) {
		if (root == null)
			return 0;

		return 1 + countNodes(root.left) + countNodes(root.right);
	}

	int leafNode(Node root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null) // it is a leaf node
			return 1;

		return leafNode(root.left) + leafNode(root.right);
	}

//	https://practice.geeksforgeeks.org/problems/sum-of-leaf-nodes/1/
	int sumOfLeafNodes(Node root) {
		if (root == null)
			return 0;

		if (root.left == null && root.right == null) // leaf Node
		{
			return root.data;
		}

		return sumOfLeafNodes(root.left) + sumOfLeafNodes(root.right);
	}

	int height(Node root) {
		if (root == null)
			return -1;

		return 1 + Math.max(height(root.left), height(root.right));

	}

	void preOrder(Node root) {
		if (root == null)
			return;

		// VLR
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	void inOrder(Node root) {
		if (root == null)
			return;

		// LVR
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	void postOrder(Node root) {
		if (root == null)
			return;

		// LRV
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

//	https://practice.geeksforgeeks.org/problems/determine-if-two-trees-are-identical/1
//	Function to check if two trees are identical.
	boolean isIdentical(Node root1, Node root2) {
		if (root1 == null && root2 == null)
			return true;

		if (root1 == null || root2 == null)
			return false;

		return (root1.data == root2.data) && isIdentical(root1.left, root2.left)
				&& isIdentical(root1.right, root2.right);
	}

	boolean isSameStructure(Node root1, Node root2) {
		if (root1 == null && root2 == null)
			return true;

		if (root1 == null || root2 == null)
			return false;

		return isSameStructure(root1.left, root2.left) && isSameStructure(root1.right, root2.right);
	}

	boolean areMirror(Node root1, Node root2) {
		if (root1 == null && root2 == null)
			return true;

		if (root1 == null || root2 == null) {
			return false;
		}

		return (root1.data == root2.data) && areMirror(root1.left, root2.right) && areMirror(root1.right, root2.left);
	}

	void toMirror(Node root) {
		if (root == null)
			return;

		// Swap left and right
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;

		toMirror(root.left);
		toMirror(root.right);
	}

	void printAtLevel(Node root, int pendingSteps) {
		this.printAtLevelHelper(root, pendingSteps);
		// All processing has been done

//		Now leave a line as desired
		System.out.println();
	}

	// Created this helper function to be able to leave a line after printing
	void printAtLevelHelper(Node root, int pendingSteps) {
		if (root == null)
			return;

		if (pendingSteps == 0) {
			System.out.print(root.data + " ");
		}

		printAtLevelHelper(root.left, pendingSteps - 1);
		printAtLevelHelper(root.right, pendingSteps - 1);
	}

	void bfsRecursive(Node root) {
		int levelCount = height(root) + 1;
		for (int i = 0; i < levelCount; i++) {
			printAtLevel(root, i); // Print all levels from [0 to Height]
		}
	}

	void bfsIterative(Node root) {
		if (root == null)
			return;

		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			Node current = q.poll();

			System.out.print(current.data + " ");

			if (current.left != null) {
				q.add(current.left);
			}

			if (current.right != null) {
				q.add(current.right);
			}
		}
		// The BFS has been completed
		System.out.println();
	}

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree(2); // Create a Binary Tree with 2 as the root.
		bt.root.left = new Node(3);
		bt.root.right = new Node(5);
		bt.root.left.right = new Node(9);
		bt.root.right.left = new Node(7);
		// Sample tree has been created

		System.out.println(bt.treeSum(bt.root));
		System.out.println(bt.countNodes(bt.root));
		System.out.println(bt.leafNode(bt.root));
		System.out.println(bt.height(bt.root));

		BinaryTree bt2 = new BinaryTree(2); // Create a Binary Tree with 2 as the root.
		bt2.root.left = new Node(3);
		bt2.root.right = new Node(5);
		bt2.root.left.right = new Node(9);
		bt2.root.right.left = new Node(7);

		BinaryTree bt3 = new BinaryTree(1); // Create a Binary Tree with 1 as the root.
		bt3.root.left = new Node(2);
		bt3.root.right = new Node(3);
		bt3.root.left.right = new Node(4);
		bt3.root.right.left = new Node(5);

		// Mirror tree of bt
		BinaryTree bt4 = new BinaryTree(2); // Create a Binary Tree with 2 as the root.
		bt4.root.left = new Node(5);
		bt4.root.right = new Node(3);
		bt4.root.left.right = new Node(7);
		bt4.root.right.left = new Node(9);

		System.out.println(bt.isIdentical(bt.root, bt2.root));
		System.out.println(bt.isSameStructure(bt.root, bt2.root));

		System.out.println(bt.isIdentical(bt.root, bt3.root));
		System.out.println(bt.isSameStructure(bt.root, bt3.root));

		System.out.println(bt.areMirror(bt.root, bt2.root));
		System.out.println(bt.areMirror(bt.root, bt4.root));

		bt.toMirror(bt.root); // We have converted bt to its mirror
		// bt4 was mirror of original bt
		// So, bt and bt4 must be identical now

		System.out.println(bt.isIdentical(bt.root, bt4.root));

		bt.toMirror(bt.root); // BT is original again

		bt.preOrder(bt.root);
		System.out.println();

		bt.inOrder(bt.root);
		System.out.println();

		bt.postOrder(bt.root);
		System.out.println();

		bt.printAtLevel(bt.root, 0);
		bt.printAtLevel(bt.root, 1);
		bt.printAtLevel(bt.root, 2);

		bt.bfsRecursive(bt.root);
		bt.bfsIterative(bt.root);
	}
}