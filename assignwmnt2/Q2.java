package assignwmnt2;

class Sortarray {
	public int[] sortArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i = 0;
				}
			}
		}
		return arr;
	}
}



class Node {
    int data;
	Node right = null;
	Node left = null;
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class BST {
	static Node root = null;
	public Node createNode(int val) {
		Node a = new Node();
		a.data = val;
		a.right = null;
		a.left = null;
		return a;
	}

	public Node insert(Node node, int val) {
			if (node == null) {
//				System.out.println("now root: " + root + ", value is: " + val);
				return createNode(val);
			} else if (val < node.data) {
				node.left = insert(node.left, val);
			} else if (val > node.data) {
				node.right = insert(node.right, val);
			}
		return node;
	}

	public void orderBST(Node root2) {
		if(root2 == null) {
			return;
		}
		System.out.println("BST LIST: " + root2.data);
        orderBST(root2.left);
        orderBST(root2.right);
	}
}

public class Q2 extends BST {
	public static void main(String args[]) {
		Sortarray sa = new Sortarray();
		BST bst = new BST();
		int[] arr = { 2, 4, -3, -4, 6 };
		arr = sa.sortArray(arr);
		for (int e = 0; e < arr.length; e++) {
			root = bst.insert(root, arr[e]);
		}
		bst.orderBST(root);
	}
}
