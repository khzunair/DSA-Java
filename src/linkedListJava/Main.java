package linkedListJava;

import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		
		LinkedList<String> animals = new LinkedList<>();

		
	    // Add elements to LinkedList
	    animals.add("Dog");
	    animals.add("Cat");
	    animals.add("Cow");
	    System.out.println("LinkedList: " + animals);
	    
	    
	 // add() method with the index parameter (index is optional sometimes)
	    animals.add(1, "Horse");
	    System.out.println("Updated Linked List: "+ animals );
	    
	    
	    // get the element from the linked list
	    String str = animals.get(1);
	    System.out.println("Element at index 1: " + str);
	    
	    
	    // change elements at index 3
	    animals.set(3, "Kotlin");
	    System.out.println("Updated LinkedList: " + animals);
	    
	    

	    // remove elements from index 1
	    String str1 = animals.remove(1);
	    System.out.println("Removed Element: " + str1);

	    System.out.println("Updated LinkedList: " + animals);
	    
//	    Contains method
	    if(animals.contains("Cat")) {
	    	System.out.println("Exists");
	    }else {
	    	System.out.println("Doesn't exists!");
	    }
	    
//	    Index of
	    String str2 = "Kotlin";
	    System.out.println((animals.indexOf(str2)));


//	    last Index
	     System.out.println(animals.getLast());
	     
	     
//	     Clears the linked list
//	     animals.clear();
	     
	     System.out.println(animals);
	     
	     
//	   System.out.println(animals.iterator()); 
	   
	   
//	   Additional Methods
			//addFirst()
			//		adds the specified element at the beginning of the linked list
			//
			//addLast()
			//		adds the specified element at the end of the linked list
			//
			//getFirst()
			//		returns the first element
			//
			//getLast()
			//		returns the last element
			//
			//removeFirst()
			//		removes the first element
			//
			//removeLast()
			//		removes the last element
			//
			//peek()
			//		returns the first element (head) of the linked list
			//
			//poll()
			//		returns and removes the first element from the linked list
			//
			//offer() adds the specified element at the end of the linked list
	     
	}

}

