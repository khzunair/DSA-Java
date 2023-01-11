package queue.arrayBasedQueue.linearQueue;

public class MainClass {

	public static void main(String[] args) {
		ArrayBasedQueue obj = new ArrayBasedQueue(5);
		obj.enQueue(23);
		obj.enQueue(2);
		obj.enQueue(3);

		obj.deQueue();
		obj.deQueue();

		
		obj.peek();

		obj.deleteQueue();
	}

}
