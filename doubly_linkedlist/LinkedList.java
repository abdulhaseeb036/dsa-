package doubly_linkedlist;
import java.lang.Math;

public class LinkedList {
	Node head;
	Node tail;

	public void add(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
			node.next = null;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
				node.prev = n;
			}
			node.prev = n;
			tail = node;
			n.next = node;
		}
	}

	public void addFirst(int data) {
		Node node = new Node();
		node.data = data;
		head.prev = node;
		node.next = head;
		node.prev = null;
		head = node;
	}

	public void remove(int data) {
		Node n = head;
		Node m = tail;
		while (n.next.data != data && m.prev.data != data) {
			n = n.next;
			m = m.prev;
		}
		n.next = m;
		m.prev = n;
	}

	public void removeFirst() {
		Node n = head;
		Node m = tail;
		while (m.prev != n) {
			m = m.prev;
		}
		m.prev = null;
		head = m;
	}

	public void removeLast() {
		Node n = head;
		Node m = tail;
		while (n.next != m) {
			n = n.next;
		}
		n.next = null;
	}

	public void display() {
		Node n = head;
		while (n.next != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.print(n.data + " ");
		System.out.println();
	}

	public void reverse() {
		Node m = tail;
		while (m.prev != null) {
			System.out.print(m.data + " ");
			m = m.prev;
		}
		System.out.print(m.data);
		System.out.println();
	}

	public int getMiddle() {
		Node n = head;
		int count = 1;
		int mid;
		int midNodeval = 0;
		while (n.next != null) {
			count++;
			n = n.next;
		}
		count++;
		mid = count / 2;
		if(mid%2 !=0) {
			mid = mid +1;
		}
		System.out.println("==> mid" + mid);
		n = head;
		for (int i = 1; i < mid; i++) {
			n = n.next;
		}
		midNodeval = n.data;
		System.out.println("n.data" + n.data);
		System.out.println("mid nod val " + midNodeval);
		return midNodeval;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(3);
		list.add(5);
		list.add(10);
		list.add(15);
		list.display();
		list.reverse();
		list.addFirst(1);
		list.display();
		list.remove(5);
		list.display();
		list.removeFirst();
		list.display();
		list.removeLast();
		list.display();
		System.out.println(list.getMiddle());

	}
}
