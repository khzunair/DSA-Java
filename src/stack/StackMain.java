package stack;

public class StackMain {

	public static void main(String[] args) {
		
		StackClass sc = new StackClass();
		sc.createStack(3);
		
		sc.push(1);
		sc.push(67);
		sc.push(7);
		sc.push(3);
		sc.push(93);
		sc.peek();
		sc.pop();
		sc.peek();
		sc.pop();
		sc.pop();
		sc.pop();
		sc.pop();
//		if want to use delete stack one should also have createStack Function
		sc.deleteStack();

	}

}
