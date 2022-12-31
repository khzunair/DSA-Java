package searchingAlgorithms;

public class Search {
	
//	Linear Search
		public int linearSearch(int[] array, int valueToBeSearched) {
			for(int i=0;i<array.length;i++) {
				if(array[i] == valueToBeSearched) {
					System.out.println("Result found at index: "+ i);
					return i;
				}
			}
			System.out.println("Value not found!");
			return -1;
			
		}
	
//	Binary Search
		public int binarySearch(int array[], int valueToBeSearched ) {
			int start=0;
			int end= array.length-1;
			int middle = (start+end)/2;
			
			while(array[middle] != valueToBeSearched && start < end) {
				if(valueToBeSearched < array[middle]) {
					end = middle-1;
				}else {
					start = middle+1;
				}
				middle = (start+end)/2;
			}
			if(array[middle] == valueToBeSearched) {
				System.out.println("Result found at index: "+ middle);
				return middle;
			}else {
				System.out.println("Value not found!");
				return -1;
			}
			
		}

}
