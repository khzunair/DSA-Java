package conversions;

import java.util.Stack;

public class BaseToDecimal {
	
	public void decimalToBase(int value, int base) {
		
		Stack<Integer> stack = new  Stack<Integer>();
		
		int divide = value / base ;
		int remainder = value % base ;
		
		stack.push(remainder);
//		System.out.println("I am first "+ remainder);
		
		while(divide >= base ) {

//			Calculating remainder first because we are saving divide value into the divide after dividing
			remainder   = divide % base;
			divide 	 	= divide / base;
			stack.push(remainder);
//			System.out.println("I am Inner "+remainder);
			
			
		}
		
		
		stack.push(divide);
//		System.out.println("I am last divide "+ divide);
		
		System.out.print("Converted ("+value+")"+10+" -->"+" ("  );
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());  
		}
		System.out.println(")"+base+". ");
		
	}

}
