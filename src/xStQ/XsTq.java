package xStQ;

import queue.arrayBasedQueue.linearQueue.ArrayBasedQueue;
import stack.StackClass;

public class XsTq {
	ArrayBasedQueue object = new ArrayBasedQueue(5);
	StackClass sC = new StackClass();
	
	public void main (String args[]) {
		
		sC.createStack(5);
		sC.push(5);
		sC.push(4);
		sC.push(1);
		
		object.enQueue(78);
		object.enQueue(8);
		object.enQueue(11);
		
		int value = sC.pop();
		object.enQueue();
		
	}

}
