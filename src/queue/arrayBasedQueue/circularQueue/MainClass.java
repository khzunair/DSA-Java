package queue.arrayBasedQueue.circularQueue;


public class MainClass {

	public static void main(String[] args) {
		CircularQueue circularQueueObj = new CircularQueue(3);
		
		circularQueueObj.isEmpty();
		circularQueueObj.isFull();
		
		circularQueueObj.enQueue(12);
		circularQueueObj.enQueue(122);
		circularQueueObj.enQueue(1252);
		
		circularQueueObj.deQueue();
		
		circularQueueObj.enQueue(52);
		
		circularQueueObj.deQueue();
		
		circularQueueObj.enQueue(2);
		
		circularQueueObj.deQueue();
		circularQueueObj.deQueue();
		circularQueueObj.deQueue();
		
		

		
	}

}
















