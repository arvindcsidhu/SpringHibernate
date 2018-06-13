package linkedlists;

public class App {
	
	public static void main(String[] args) {
		
		Node nodeA = new Node();
		nodeA.data = 4;
		Node nodeB = new Node();
		nodeB.data = 3;
		Node nodeC = new Node();
		nodeC.data = 7;
		Node nodeD = new Node();
		nodeD.data = 9;
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		System.out.println(listLength(nodeA));
		System.out.println(listLength(nodeB));
		System.out.println(listLength(nodeC));
		System.out.println(listLength(nodeD));
	}
	
	public static int listLength(Node node) {
		int count = 0;
		Node currentNode = node;
		while(currentNode != null) {
			count++;
			currentNode = currentNode.next;
		}
		return count;
	}

}
