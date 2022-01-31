package circularlinkedlist;

public class Linkedlist {
	Node head;
	Node tail;
	public void add(int data) {
		Node node = new Node();
		node.data = data;
		if(isEmpty() == true) {
			head = node;
		} else {
			Node n = head;
			Node m = tail;
			while(n.next != null ) {
				n = n.next;
			}
  		m= tail;
		n.next = node;
			node.next = head;
		}
	}
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		return false;
	}
	public void display() {
		Node n = head;
		while(n.next != head) {
			n= n.next;
			System.out.print(n.data + " ");
		}
		System.out.print(n.data + " ");
	}
	public static void main(String[] args) {
		Linkedlist list = new Linkedlist();
		list.add(3);
		list.add(5);
		list.display();
	}

}
