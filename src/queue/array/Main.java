package queue.array;

public class Main {

	public static void main(String[] args) {

		QueueArray qa = new QueueArray(2) ;
		
		qa.isEmpty();
		qa.isFull();
		qa.enQueue(90);
		qa.enQueue(23);
		qa.enQueue(18);
		qa.enQueue(900);
		
		qa.deQueue();
		qa.deQueue();
		qa.deQueue();
		qa.deQueue();

	}

}
