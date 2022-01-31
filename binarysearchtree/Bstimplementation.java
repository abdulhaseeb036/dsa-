package binarysearchtree;

class Node {
	int data;
	Node left = null;
	Node right = null;
}

class BST {
	static Node root = null;
	
	public Node createNode(int val) {
		Node a = new Node();
		a.data = val;
		a.left = null;
		a.right = null;
		return a;
	}
	
	public Node insert(Node node, int val) {
		if(node == null) {
			return createNode(val);
		}
		else if(val < node.data) {
			node.left = insert(node.left, val);
		}
		else if(val > node.data) {
			node.right = insert(node.right, val);
		}
		return node;
	}
	
	public void traverseInOrder(Node node) {
		if(node == null) {
			return;
		}
//		    just remeber they hit left leaf node until find null, then print value in which they end because for recursion their first is their last.
			traverseInOrder(node.left);
			System.out.println(" " + node.data);
			traverseInOrder(node.right);
	}
	
	public void traversePreOrder(Node node) {
		if(node == null) {
			return;
		}
		System.out.println(" " + node.data);
		traversePreOrder(node.left);
		traversePreOrder(node.right);
	}
	public void traversePostOrder(Node node) {
		if(node == null) {
			return;
		} 
		traversePostOrder(node.left);
		traversePostOrder(node.right);
		System.out.println(" " + node.data);
	}
	
	public boolean containsNodeRecursive(Node node, int val) {
		if(node == null) {
			return false;
		}
		if(node.data == val) {
			return true;
		}
		return (node.data < val) ? containsNodeRecursive(node.right, val) : containsNodeRecursive(node.left, val);
	}
	
	public boolean containNode(int val) {
		return containsNodeRecursive(root, val);
	}
	
}

public class Bstimplementation extends BST {
	public static void main(String[] args) {
		BST a = new BST();
		root = a.insert(root, 8);
//		Every time we pass root 8 node goes every time.
		root = a.insert(root, 5);
		root = a.insert(root, 10);
		root = a.insert(root, 3);
//		a.traverseInOrder(root);
//		a.traversePreOrder(root);
//		a.traversePostOrder(root);
//		System.out.println(a.containsNodeRecursive(root, 2));
//		System.out.println(a.containNode(19));
		
	}
}
