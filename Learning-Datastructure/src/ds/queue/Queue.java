package ds.queue;

public class Queue {
	
	int maxSize;
	long[] queueArray;
	int rear;
	int front;
	int queueArrayItems;
	
	public Queue(int size) {
		this.maxSize = size;
		this.queueArray = new long[size];
		front = 0;
		rear = -1;
		queueArrayItems = 0;
	}
	
	public void insert(int element) {
		
		if(rear == maxSize -1) {
			rear = -1;
		}
		rear++;
		queueArray[rear] = element;
		queueArrayItems++;
	}
	
	public void view() {
		System.out.println("[");
		for(int i = 0 ; i < queueArray.length ; i++) {
			System.out.println(queueArray[i] + ",");
		}
		System.out.println("]");
	}
	
	public long peekView() {
		return queueArray[front];
	}
	
	public long remove() {
		long frontElement = queueArray[front];
		front++;
		//rear--;
		if(front == maxSize) {
			front = 0;
		}
		queueArrayItems--;
		return frontElement;
	}
	
	public Boolean isEmpty() {
		return (queueArrayItems == 0);
	}
	
	public Boolean isFull() {
		return (queueArrayItems == maxSize);
	}

}
