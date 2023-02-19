package sortingAlgorithms;

import java.util.Arrays;

public class Sort {
	
//	Bubble Sort
//		According to my observation in bubble sort we compare every element with the successor one and if it is greater we swap them for example
//			in our order is like 3,2 it will swap them and will to so till the second-last element comparison with its successive which is the last one.
	public int[] bubbleSort(int array[]) {
		int n = array.length -1 ;
		for(int i = 0 ; i<n ; i++) {
			for(int j = 0 ; j<n-i ; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
		return array;
	}
	
	
//	Selection Sort
//		According to my observation, in selection-sort we find the minimum value in the array and swap it with the first element and the next iteration/startof
//	loop starts with i+1 so at the end it is also sorted
	public int[] selectionSort(int[] array) {
		
		for(int i=0; i<array.length ; i++) {
			int minIndex = i;
			for(int j=i+1 ; j<array.length ; j++) {
				if(array[j]<array[minIndex]) {
					minIndex = j;
				}
			}
			if(minIndex != i) {				
				int temp = array[minIndex];
				array[minIndex] = array[i];
				array[i] = temp;
			}
			}
		System.out.println(Arrays.toString(array));
		return array;
		
	}
	
//	Insertion Sort
	public int[] insertionSort(int[] array) {
		for(int i = 1; i<array.length; i++) {
			int temp = array[i];
			int j = i;
			
			while(j>=0 && array[j-1]> temp) {
				array[j] = array[j-1];
				j--;
				
			}
			array[j] = temp; 	
		}
		System.out.println(Arrays.toString(array));
		return array;
	}
	
	

}
