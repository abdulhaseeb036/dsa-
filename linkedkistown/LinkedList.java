package linkedkistown;

public class LinkedList {
	Node head;
	public void add(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;	
		if(head == null) {
			head = node;
		}
		else {
			Node n = head;
			while(n.next!= null) {
				n= n.next;
			}
			n.next = node;
		}
	}
	
	public void add(int ind, int data) {
		Node node = new Node();
		node.data = data;
		Node n = head;
		int i = 1;
	    while(i < ind && n.next!=null) {
	    	n = n.next;
	    	i++;
	    }
    	    node.next = n.next;
	    	n.next = node;
	}
	
	public void get(int ind) {
        Node n = head;
        int count = 1;
        while(count != ind) {
        	n = n.next;
        	count++; 	
        }
        int value = n.next.data;
        System.out.println("Given value is :" + value);
	}
	
	public void remove(int value) {
		Node n = head;
		while(n.next != null) {
			n = n.next;
			if(n.data == value) {
				n.data = n.next.data;
				n.next = n.next.next;
			}
		}

	}
	
	public void display() {
		Node n = head;
		while(n.next!= null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.print(n.data);
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(3);
		list.add(9);
		list.add(4);
		list.display();
		list.add(1,30);
		list.add(2,33);
		list.display();
		list.get(2);
		list.remove(9);
		list.display();

}
}
 