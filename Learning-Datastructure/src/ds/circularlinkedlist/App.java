package ds.circularlinkedlist;

public class App {

	public static void main(String[] args) {
	CircularLinkedList linkedList = new CircularLinkedList();
	linkedList.insertFirst(1);
	linkedList.insertFirst(2);
	linkedList.insertFirst(3);
	linkedList.insertFirst(4);
	
	linkedList.displayLinkedList();
	
	linkedList.insertLast(6);
	
	linkedList.displayLinkedList();
	
	linkedList.deleteFirst();
	
	linkedList.displayLinkedList();

	}

}
