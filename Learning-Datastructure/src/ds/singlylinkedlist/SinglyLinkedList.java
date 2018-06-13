package ds.singlylinkedlist;

public class SinglyLinkedList {
	private Node first;
	
	public Boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}
	
	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		return temp;
	}
	
	public void displayLinkedList() {
		System.out.println("displaying linked list from first to last");
		Node current = first;
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
	
	public void insertLast(int data) {
		Node currentNode= first;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		currentNode.next = newNode;
	}

}
