package queue.arrayBasedQueue.DEQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DEQueueClass {
	
    Deque<Integer> deque = new ArrayDeque<>();
    
    public boolean checkEmpty() {
    	if(deque.isEmpty()) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    public int getLast() {
    	if(checkEmpty()) {
    		System.out.println("Empty");
    		return -1 ;
    		
    	}else {
    		System.out.println(deque.getLast());
    		return deque.getLast();
    	}
    }
    
    public int getFirst() {
    	if(checkEmpty()) {
    		System.out.println("Empty");
    		return -1 ;
    		
    	}else {
    		System.out.println(deque.getFirst());
    		return deque.getFirst();
    	}
    }
	
    

	    public static void main(String[] args) {


//	        Deque<Integer> deque = new ArrayDeque<>();
//	        
//
//
//	        deque.addFirst(1);
//	        deque.addLast(2);
//	        deque.addLast(33);
//	        deque.addFirst(12);
//	        
//	        
//
//
//
//
//	        System.out.println(deque);  
//
//	        System.out.println(deque.removeFirst());
//	        System.out.println(deque.removeFirst());
//	        System.out.println(deque.removeFirst());
//	        if(deque.isEmpty()) {
//	        	System.out.println("isEmpty");
//	        }else {
//	        	System.out.println("Not");
//	        }
//	        // Print the Deque
//	        System.out.println(deque);  // Output: []
//	        System.out.println(deque.removeFirst());
//	        if(deque.isEmpty()) {
//	        	System.out.println("isEmpty");
//	        }else {
//	        	System.out.println("Not");
//	        }
	    }
	}
