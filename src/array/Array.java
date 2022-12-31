package array;
import java.util.Arrays;
public class Array {
	
	public static void main(String[] args) {
		
//		First and Fixed array
		int[] intArray;
		intArray = new int[3];
		
		intArray[0]= 1;
		intArray[1]= 2;
		intArray[2]= 3;
		
		System.out.println(Arrays.toString(intArray));
		
//		Second and dynamic array
		String sArray[] = {"a","b","c"};
		System.out.println(Arrays.toString(sArray));
		
		
//		Third and Fixed array
		int[] array;
		array = new int[6];
		
		array[0]= 1;
		array[1]= 23;
//		array[2]= 23;
//		System.out.println(Arrays.toString(array));
		System.out.println(array.length);
		
//		Fourth and For Loop array
		for(int i=2 ; i>=0 ; i--) {
			System.out.println(sArray[i]);
		}
		
		
//		Fifth and for-each loop array
		
//		Syntax
//		for(type (space) iteration-variable : arrayname){
//		sysout(i)
//		}
		for(int i: array) {
			System.out.println(i);
		}
		
	}

}
