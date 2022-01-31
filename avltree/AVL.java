package avltree;

class Node {
	int data;
	Node left;
	Node right;
	int height = 1;
}


class AvlMethods {
	static Node root = null;
	
	public Node createNode(int data) {
		Node n = new Node();
		n.data = data;
		n.height = 1;
		return n;
	}
	
	public Node insert(Node node, int data) {
		if(node==null) {
			return createNode(data);
		}
		else if(node.data > data) {
			node.left = insert(node.left, data);
		}
		else if(node.data < data) {
			node.right = insert(node.right, data);
		}
		node.height = max(height(node.left), height(node.right)) + 1;
		
		int bf = bf(node);
		//LL case
		if(bf > 1 && data < node.left.data) {
			return rightRotate(node);
		}
		//RR case
		if(bf<-1 && data > node.right.data) {
			return leftRotate(node);
		}
		
		//LR case
		if(bf > 1 && data > node.left.data) {
			return leftrightRotate(node);
		}
		
		//RL case
		if(bf <-1 && data < node.right.data) {
			return rightleftRotate(node);
		}
			
		return node;
	}
	
	public Node rightRotate(Node c) {
		Node b = c.left;
		Node T3 = b.right;
		
		//rotate
		b.right = c;
		c.left = T3;
		
        //height
		b.height = max(height(b.left), height(b.right));
		c.height = max(height(c.left), height(c.right));
//		System.out.println(b.height +" b height");
//		System.out.println(c.height +" b height");
		return b;
	}
	
	public Node leftRotate(Node c) {
		Node b = c.right;
		Node T2 = b.left;
		
		//rotate
		b.left = c;
		c.right = T2;
		
		b.height = max(height(b.left), height(b.right)) +1;
		c.height = max(height(c.left), height(c.right)) + 1;
		return b;
	}
	
	
	public Node leftrightRotate(Node c) {
		Node b = c.left;
		Node a = b.right;
		//left rotate
		a = leftRotate(b);
		
		c.left = a;
		Node T3 = a.right;
		//right rotate
		a  = rightRotate(c);
		return a;
	}
	
	public Node rightleftRotate(Node c) {
		Node b = c.right;
		Node a = b.left;
		//left rotate
		a = rightRotate(b);
		
		c.right = a;
		Node T2 = a.left;
		//right rotate
		a  = leftRotate(c);
		return a;
	}
	
	public int bf(Node node) {
		if(node == null) {
			return 0;
		} else 
			return (height(node.left) - height(node.right));
	}
	
	public int height(Node node) {
		if(node == null) {
			return 0;
		}
		return node.height;
	}
	
	public int max(int a , int b) {
		return a>b ? a : b;
	}
	
	public int findSmallestval(Node node) {
		return node.left == null ? node.data : findSmallestval(node.left);
	}
	
	public void display(Node node) {
		if(node != null) {
			String str = "";
			display(node.left);   
			if(node.left ==null) {
				str += "null";
			}
			else {
				str += node.left.data;
			}
			str += " => " + node.data + " => ";
			display(node.right);    
			if(node.right == null) {
				str += "null";
			} 
			else {
				str += node.right.data;
			}
			System.out.println(str);
		}
	}
	
	public void traverseInOrder(Node node) {
		if(node != null) {
		traverseInOrder(node.left);
		System.out.println(node.data);
		traverseInOrder(node.right);
		}
	}
}
public class AVL extends AvlMethods {
	public static void main(String args[]) {
		AvlMethods avlm = new AvlMethods();
		root = avlm.insert(root, 20);
		root = avlm.insert(root, 25);
		root = avlm.insert(root, 30);
		root = avlm.insert(root, 10);
		root = avlm.insert(root, 5);
		root = avlm.insert(root, 15);
		root = avlm.insert(root, 27);
		root = avlm.insert(root, 19);
		root = avlm.insert(root, 16);
		System.out.println(avlm.findSmallestval(root));
//		avlm.display(root);
//		avlm.traverseInOrder(root);
	}

}
 