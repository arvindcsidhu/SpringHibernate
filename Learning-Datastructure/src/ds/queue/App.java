package ds.queue;

public class App {
	
	public static void main(String[] args) {
		
		Queue myQueue = new Queue(2);
		myQueue.insert(10);
	//	myQueue.insert(20);
	//	myQueue.insert(30);
		myQueue.insert(40);
		//myQueue.insert(50);
		//myQueue.insert(60);
		//myQueue.insert(70);
		System.out.println(myQueue.remove());
		System.out.println(myQueue.remove());
	//	System.out.println(myQueue.remove());
	//	System.out.println(myQueue.remove());
	//	System.out.println(myQueue.peekView());
	
		myQueue.view();
	}

}
