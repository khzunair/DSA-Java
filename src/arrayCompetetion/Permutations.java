package arrayCompetetion;

public class Permutations {
//	Permutation is checking wether the array elements of different arrays have same members or not
	
	protected boolean permutationCheck(int[] arr1, int[] arr2) {
		
		int sum1=0;
		int sum2=0;
		int product1=1;
		int product2=1;
		
		if (arr1.length != arr2.length) {
			System.out.println("Different Arrays");
			return false;
		}else {
			
			for(int i=0; i<arr1.length; i++) {

					 sum1 =+ arr1[i];
					 sum2 =+ arr2[i];
					 product1 = product1 * arr1[i];
					 product2 = product2 * arr2[i];
			}
			
			System.out.println(sum1);
			System.out.println(sum2);
			System.out.println(product1);
			System.out.println(product2);

			
			if(sum1==sum2 && product1==product2) {
				System.out.println("Array is permutation!");
				return true;
			}else {
				System.out.println("Array is not permutation!");
				return false;
			}
			
			
		}
	}
	
	public static class Main{
		public static void main(String args[]) {
			
			int[] array1 = {1,2,3,4,7};
			int[] array2 = {1,2,3,4,5};
			
			Permutations object = new Permutations();
			
			object.permutationCheck(array1, array2);
		}
	}

}
