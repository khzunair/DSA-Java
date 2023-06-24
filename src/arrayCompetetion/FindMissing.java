package arrayCompetetion;

public class FindMissing {
	public void findMissingArrayElement(int[] array) {
		
		int element = array[0] ;
		
		for(int i: array) {
			if(i == element) {
				element++ ;
			}
			else if(i != element) {
				System.out.println("Missing Number is : " + element);
				return;
			}
		}
		System.out.println("There is no missing number in this sequence");

	}

	public static class Main{
		public static void main(String args[]) {
			
			int[] array = {1,2,3,4,5,6,7,8,10,11,12,13,14};
			
			FindMissing object = new FindMissing();
			
			object.findMissingArrayElement(array);
		}
	}
}
