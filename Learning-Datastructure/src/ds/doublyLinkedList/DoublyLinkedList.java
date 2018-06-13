package ds.doublyLinkedList;

public class DoublyLinkedList {
	private Node first;
	private Node last;
	
	public DoublyLinkedList() {
		first = null;
		last = null;
	}
	
	public Boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode;
		}else {
			first.previous = newNode;
		}
		
		newNode.next = first;
		first = newNode;
	}
	
}
