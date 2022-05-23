package trees;

class BSTNode {
	int data;
	BSTNode left;
	BSTNode right;

	BSTNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class BST {
	BSTNode root; // Root of the Binary Tree

	BST(int rootData) {
		this.root = new BSTNode(rootData);
	}

	BSTNode search(BSTNode root, int data) {
		if (root == null)
			return null;

		if (root.data == data)
			return root;

		if (data < root.data) // Search in LST
		{
			return search(root.left, data);
		} else { // Search in RST
			return search(root.right, data);
		}
	}

	boolean searchItr(BSTNode root, int data) {
		if (root == null)
			return false; // empty tree

		while (root != null) {
			if (data == root.data) {
				return true; // value has been found
			} else if (data < root.data) {
				root = root.left;
			} else {
				root = root.right;
			}
		}

		// We reach here -> root has become null.

		return false;
	}
	
	BSTNode insertRec(BSTNode root, int data)
	{
		if(root == null) //If tree is empty, return a new Node
			return new BSTNode(data);
		
		if(data<root.data)
		{
			root.left = insertRec(root.left, data);
		}
		else {
			root.right = insertRec(root.right, data);
		}
		
		//Return the original root(which will be unchanged)
		return root;	
	}
	
	int getMin(BSTNode root)
	{
		if(root == null)
		{
			System.out.println("Empty Tree, no min present.");
			return -1;
		}
		
		while(root.left != null) //Leftmost element
		{
			root = root.left;
		}
		
		return root.data;
	}
	
	int getMax(BSTNode root)
	{
		if(root == null)
		{
			System.out.println("Empty Tree, no max present.");
			return -1;
		}
		
		while(root.right != null) //Rightmost element
		{
			root = root.right;
		}
		
		return root.data;
	}

	BSTNode delete(BSTNode root, int data)
	{
		if(root == null)
			return null;
		
		if(data < root.data)
		{
			root.left = delete(root.left, data);
		}
		else if(data > root.data)
		{
			root.right = delete(root.right, data);
		}
		else { //if root.data == data
			if(root.left == null) //1 Child case and 0 child case
			{
				return root.right;
			}
			if(root.right == null)
			{
				return root.left;
			}
			
			//Here we are at 2 child case now.
			root.data = getMin(root.right);// Picking minimum element from RST
			root.right = delete(root.right, root.data); //Delete the min element from RST [Recursion]
			
			
//			We could have also done:
//			root.data = getMax(root.left);// Picking max element from LST
//			root.left = delete(root.left, root.data); //Delete the max element from LST [Recursion]
			
		}
		
		return root;
	}
	
//	https://practice.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-binary-tree/1/
	BSTNode lca(BSTNode root, int n1,int n2)
	{
	    if(root == null)
	        return root; //empty tree
	    
	    if(root.data == n1 || root.data == n2)
	    {
	        return root; //element found
	    }
	    
	    //Find where are the two nodes.
	    BSTNode leftLCA = lca(root.left, n1, n2);
	    BSTNode rightLCA = lca(root.right, n1, n2);
	    
	    //If one node lies on left side and other lies
	    //on right side then our current root is LCA.
	    if(leftLCA != null && rightLCA != null)
	    {
	        return root;
	    }
	    
	    if(rightLCA == null) //Means left side has neither of these nodes
	    {
	        return leftLCA;
	    }
	    
	    if(leftLCA == null) //Means right side has neither of these nodes
	    {
	       return rightLCA; 
	    }
	    
	    //We will never reach here
	    return root;
	}
	
	public static void main(String[] args) {
		BST bst = new BST(15);
//		bst.root.left = new BSTNode(10);
//		bst.root.right = new BSTNode(20);
//		bst.root.left.left = new BSTNode(8);
//		bst.root.left.right = new BSTNode(12);
//		bst.root.right.left = new BSTNode(17);
//		bst.root.right.right = new BSTNode(25);
		bst.root = bst.insertRec(bst.root, 10);
		bst.root = bst.insertRec(bst.root, 20);
		bst.root = bst.insertRec(bst.root, 8);
		bst.root = bst.insertRec(bst.root, 12);
		bst.root = bst.insertRec(bst.root, 17);
		bst.root = bst.insertRec(bst.root, 25);
		bst.root = bst.insertRec(bst.root, 3);
		bst.root = bst.insertRec(bst.root, 30);

		System.out.println(bst.search(bst.root, 25));
		System.out.println(bst.search(bst.root, 19));

		System.out.println(bst.searchItr(bst.root, 25));
		System.out.println(bst.searchItr(bst.root, 19));
		
		System.out.println(bst.getMin(bst.root));
		System.out.println(bst.getMax(bst.root));
		

	}
}