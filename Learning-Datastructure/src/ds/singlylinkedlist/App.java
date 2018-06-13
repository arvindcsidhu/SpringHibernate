package ds.singlylinkedlist;

public class App {
	public static void main(String[] args) {
		
		SinglyLinkedList myList = new SinglyLinkedList();
		myList.insertFirst(100);
		myList.insertFirst(200);
		myList.insertFirst(300);
		myList.insertFirst(400);
		
		myList.displayLinkedList();
		
		myList.insertLast(500);
		
		myList.displayLinkedList();
	}

}
