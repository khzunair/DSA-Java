package stack;

public class StackClass {
	 
	int[] array;
	int topOfStack;
//	
//	public StackClass(int sizeOfArray) {
//		this.array = new int[sizeOfArray];
//		this.topOfStack = -1;
//		System.out.println("Stack is Created with Size of "+ sizeOfArray );
//	}
	public void createStack(int sizeOfArray) {
		this.array = new int[sizeOfArray];
		this.topOfStack = -1;
		System.out.println("Stack is Created with Size of "+ sizeOfArray );
	}
	
//	To Check Stack is empty
	public boolean isEmpty() {
		if (topOfStack == -1) {
			return  true;
		}else {
			return false;
		}
	}
	
//	ToCheck if Stack is full
//	because tos and array index comparison when we do comparison with arr.length 
//	then it compare wit h .length it will try to store one element greater than the size so the last element/index is -1 of arr.length  
	public boolean isFull() {
		if (topOfStack == array.length-1) {
			return true;
		}else {
			return false; 
		}
	}
	
//	Push method
	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack is Full");
		}else {
			topOfStack++;
			array[topOfStack] = value;
			System.out.println("Pushed");
		}
	}
	
//	Pop Method
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}else {
			System.out.println(array[topOfStack]);
			topOfStack-- ;
		}
	}
	
//	Peek Method
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty!");
		}else {
			System.out.println("Peek of Stack "+ array[topOfStack]);
		}
	}
	
//	Delete Method
	public void deleteStack() {
		array = null;
		System.out.println("Stack is Deleted!");
	}

}
