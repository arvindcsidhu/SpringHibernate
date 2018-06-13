package ds.circularlinkedlist;

import ds.circularlinkedlist.Node;

public class CircularLinkedList {
	private Node first;
	private Node last;
	
	public CircularLinkedList() {
		first = null;
		last = null;
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()) {
			last = newNode;
		}
		newNode.next = first;
		first = newNode;
	}
	
	public Boolean isEmpty() {
		return (first == null);
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			first = newNode;
		}else {
			last.next = newNode;
			last = newNode;
		}
	}
	
	public Node deleteFirst() {
		Node temp = first;
		
		if(first.next == null) {
			last = null;
		}
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
	
}
