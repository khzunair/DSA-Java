package queue.array;

public class QueueArray {
		
	int[] array;
	int topOfQueue ;
	int begginingOfQueue;
	
	QueueArray(int sizeOfArray){
		this.array = new int[sizeOfArray];
		this.topOfQueue = -1;
		this.begginingOfQueue = -1;
		System.out.println("Queue successfully created of size "+ sizeOfArray);
	}
	
//	isEmpty
	public boolean isFull() {
		if(topOfQueue == array.length-1) {
			return true;
		}else {
			return false;
		}
	}
	
//	isFull
	public boolean isEmpty() {
		if((begginingOfQueue == -1) || (begginingOfQueue == array.length)  ) {
			return true;
		}
		else return false;
	}
	
//	enQueue
	public void enQueue(int value) {
		if(isFull()) {
			System.out.println("Queue is Full!");
		}else if(isEmpty()) {
			begginingOfQueue = 0;
			topOfQueue++;
			array[topOfQueue] = value;
			System.out.println(value+" successfully inserted!");
			
		}else {
			topOfQueue++;
			array[topOfQueue] = value;
			System.out.println(value +" successfully inserted!");
			
		}
	}
	
//	deQueue
	public void deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty!");
			System.out.println("-1");
//			return -1;
			
		}else {
			int result = array[begginingOfQueue];
			begginingOfQueue++;
			if(begginingOfQueue > topOfQueue) {
				begginingOfQueue = topOfQueue =-1;
			}
			System.out.println(result +" is deQueued");
//			return result;
		}
	}
	

}
