package searchingAlgorithms;

public class SearchingMainClass {
	public static void main(String args[]) {
		
		Search obj = new Search();
		
		
//		int[] array = {1,2,3,4,5,6,17,7,8,990,99,7,5};
//		obj.linearSearch(array, 67675);
		
		int[] sortedArray = {1,2,3,5,6,7,10,100,298,878};
		obj.binarySearch(sortedArray, 10);

	}

}
