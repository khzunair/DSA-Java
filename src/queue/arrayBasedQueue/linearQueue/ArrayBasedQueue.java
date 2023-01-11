package queue.arrayBasedQueue.linearQueue;

public class ArrayBasedQueue {
	
	int[] array ;
	int begginingOfQueue;
	int topOfQueue ;
	
//	Constructor
	public ArrayBasedQueue(int sizeOfArray){
		this.array =  new int[sizeOfArray];
		this.begginingOfQueue = -1;
		this.topOfQueue = -1;
		System.out.println("Array created of size " + sizeOfArray );
		
	}
	
//	isFull Method
	public boolean isFull() {
		if(topOfQueue == array.length-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
//	isEmpty
	public boolean isEmpty() {
		if((begginingOfQueue == -1)	|| (begginingOfQueue == array.length) ){
			return true;
		}else {
			return false;  
		}
	}
	
//	Enqueue
	
	public void enQueue(int value) {
		if(isFull()) {
			System.out.println("The queue is full!");
		}else if(isEmpty()){
			begginingOfQueue = 0;
			topOfQueue++;
			array[topOfQueue] = value;
			System.out.println(value+" is inserted at index "+topOfQueue);
		}else {
			topOfQueue++;
			array[topOfQueue] = value;
			System.out.println(value+" is inserted at index "+topOfQueue);
		}
		
	}
	
//	Dequeue
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}else {
			int result = array[begginingOfQueue];
			begginingOfQueue++ ;
			if(begginingOfQueue > topOfQueue) {
				topOfQueue = begginingOfQueue = -1;
			}
			System.out.println(result );
			return result;
		}
	}
	
//	Peek
	public int peek() {
		if(isEmpty()) {
			System.out.println(-1);
			return -1;
		}
		else {
			System.out.println(	array[begginingOfQueue]);
			return array[begginingOfQueue];
		}
	}
	
//	Delete Queue
	public void deleteQueue() {
		array = null;
		System.out.println("Queue is deleted Successfully");
	}
	

}
