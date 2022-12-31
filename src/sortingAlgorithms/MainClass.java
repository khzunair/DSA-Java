package sortingAlgorithms;

public class MainClass {
	
	public static void main(String args[]) {
		
		int[] array = {12,33,44,5,3,53,23,43,24,45,455};
		Sort object = new Sort();
		System.out.println("First Bubble Sort");
		object.bubbleSort(array);
		
		System.out.println("Now Selection Sort");
		object.selectionSort(array);
		
		System.out.println("Now Insertion Sort");
		object.insertionSort(array);
		
//		System.out.println("NMY MEth Sort");
//		object.insertTSort(array);
		
	}
	


}
