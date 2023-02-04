package arrayCompetetion;


public class FindSumPairs {
	public void twoSum(int number , int[] array) {

		for(int i=0 ; i< array.length-1 ; i++) {
			for(int j=i+1 ; j< array.length ; j++) {
				if(array[i]+array[j] == number ) {
					System.out.println("Pair is "+"["+array[i]+","+array[j]+"]");
				}
			}
		}

		
	}
	
	public static class Main{
		public static void main(String args[]) {
			
			int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
			
			FindSumPairs object = new FindSumPairs();
			
			object.twoSum(7,array);
		}
	}

}
