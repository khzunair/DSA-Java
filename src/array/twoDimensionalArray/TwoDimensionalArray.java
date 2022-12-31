package array.twoDimensionalArray;

import java.util.Arrays;

//import java.util.Arrays;

public class TwoDimensionalArray {
	
	int[][] twoDArray = null ;
	
	public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
		
//				To find lengths		[array.length] [array[0].length]
		this.twoDArray = new int[numberOfRows][numberOfColumns];
		
		for(int row = 0 ; row<twoDArray.length; row++) {
			for(int column=0 ; column<twoDArray[0].length ; column++) {
				twoDArray[row][column] = Integer.MIN_VALUE;
			}
			
		}
	}
	
//	Insert Method
	
	public void insertValueInArray(int row, int column, int value) {
		try {
			if(twoDArray[row][column] == Integer.MIN_VALUE) {
				twoDArray[row][column] = value ;
				System.out.println(value+ " Inserted Successfully!");
				System.out.println(Arrays.deepToString(twoDArray));
			}else {
				System.out.println("This cell is already occupied!");
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index for two-D array");
		}
	}
	
//	Access Method
	public void accessCell(int row, int column) {
		try {
			System.out.println("Cell value is "+ twoDArray[row][column]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index for Two Dimenstional Array");
		}
	}
	
//	Traversing Method
	public void traverse() {
//		System.out.println(Arrays.deepToString(twoDArray));
		for(int row = 0 ; row<twoDArray.length;row++) {
			
			for(int column=0 ; column<twoDArray[0].length;column++) {
				System.out.print(twoDArray[row][column]+"    ");
			}
			System.out.println();
		}
	}
	
//	Searching Method
	public void searchValue(int value) {
		for(int row = 0 ; row<twoDArray.length;row++) {
			for(int column=0 ; column<twoDArray[0].length;column++) {
				if(twoDArray[row][column] == value) {
					System.out.println("Value found at index ["+row+"]"+"["+column+"]");
					return;
				}
				
			}
		}
		System.out.println("Value Not Found");
			
	}
	
//	Delete Method
	public void DeleteValue(int row,int column) {
		
					twoDArray[row][column]= Integer.MIN_VALUE;
					System.out.println("Value Deleted Successfully!");
			
	}

}
