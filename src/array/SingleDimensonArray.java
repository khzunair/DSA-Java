package array;
//import java.io.IOException;

public class SingleDimensonArray {

		int arr[] = null ;
		
//		Constructor
		public SingleDimensonArray(int sizeOfArray) {
			 this.arr = new int[sizeOfArray] ;
			 
			 for(int i = 0 ; i<arr.length ; i++) {
				 arr[i] = Integer.MIN_VALUE;
			 }
		}
		
//		Insert Method

		public void insert(int location , int valueToBeInserted) {
			
			try {
				
//				Here we are assigning each element of array with minnest value of int (That value would be our identity that the
//				element is not used 
				
				if(arr[location] == Integer.MIN_VALUE) {
					arr[location]= valueToBeInserted;
					System.out.println("Successfully Inserted!");
				}
				
				else {
					System.out.println("This cell is already occupied!");
				}
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Invalid index to access array!");
			}
		}
		
//		Traversal Method
		public void traverseArray() {
			try {
				
				for (int i = 0 ;i < arr.length ;i++) {
					System.out.print(arr[i] + " ");
				}
			}
				
			catch(Exception e){
				System.out.println("Array no longer exists!");
			}
		}
		
//		Search for an element in the array 
		
		public void searchInArray(int valueToSearch) {
			for (int i=0; i< arr.length ; i++) {
				if(arr[i] == valueToSearch) {
					System.out.println("Value is found at the index of "+ i);
					return;  
//					to come-out from the loop!
				}
			}
			System.out.println(valueToSearch +"  not found");
		}
		
//		Delete Value from array
		
		public void deleteValue(int valueToDelete) {
			try {
				  arr[valueToDelete] = Integer.MIN_VALUE;
				  System.out.println("The value have been deleted Successfully");
			}
			catch(ArrayIndexOutOfBoundsException e){
				 System.out.println("Provided Value is not in the range");
			}
		}
		
		

}
