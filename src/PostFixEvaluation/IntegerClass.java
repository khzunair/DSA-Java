package PostFixEvaluation;

public class IntegerClass {

	int[] array = null;
	int topOfStack = -1;
	
//	public void createStack(int sizeOfArray) {
//		this.array = new int[sizeOfArray];
//		System.out.println("Stack is Created with Size of "+ sizeOfArray );
//	}
	public IntegerClass(int sizeOfArray){
		this.array = new int[sizeOfArray];
	}
//	
//	ToCheck if array is empty or not
	public boolean isEmpty() {
		if (topOfStack == -1) {
			return  true;
		}else {
			return false;
		}
	}
	
//	To Check if array is Full or not
	public boolean isFull() {
		if (topOfStack == array.length-1) {
			return true;
		}else {
			return false; 
		}
	}
	
//	Push method
	public String push(int value) {
		if(isFull()) {
			System.out.println("Stack is Full");
			return "Stack is Full";
		}else {
			topOfStack++;
			array[topOfStack] = value;
			System.out.println("Pushed");
			return value+" Pushed!";
		}
	}
	
//	Pop Method
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return 0;
		}else {
			
			System.out.println(array[topOfStack]);
			int Value = array[topOfStack];
			topOfStack-- ;
			return Value;
		}
		
	}
	
//	Peek Method
	public String peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty!");
			return "Stack is Empty!";
			
		}else {
			System.out.println("Peek of Stack "+ array[topOfStack]);
			return "Peek of Stack "+ array[topOfStack];
		}
	}
	
	

}
