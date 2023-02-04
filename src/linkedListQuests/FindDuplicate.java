package linkedListQuests;

//import java.util.Arrays;
import java.util.LinkedList;
public class FindDuplicate {

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(1);
		ll.add(9);
		ll.add(14);
		ll.add(12);
		ll.add(12);
		ll.add(18);
		
		
			Object[] array = ll.toArray() ;
				for(int i=0; i<array.length-1 ;i++) {
					for(int j=i+1; j<array.length;j++) {
						if(array[i] == array[j]) {
							System.out.println("Array contains Duplicate Members");
							return;
						}
						
					}
					
				}
		System.out.println("Array doesn't contains Duplicate Members");

	}

}
