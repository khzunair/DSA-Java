package arrayList;
import java.util.ArrayList;

public class ArrayListClass {
	public static void main(String[] args) {
	ArrayList<String> cars = new ArrayList<String>();
	cars.add("BMW");
	cars.add("Mazda");
	cars.add("Ford");
	
	cars.get(0);
	cars.set(0, "Ferrari");
	cars.size();
	cars.remove(1);
	System.out.println(cars);
	cars.clear();
	System.out.println(cars);
	cars.size();
	
//	For Loop
	   for (int i = 0; i < cars.size(); i++) {
		      System.out.println(cars.get(i));
		    }
	   
//	   For Each
	   for (String i : cars) {
		      System.out.println(i);
		    }
	   
	   
//	   For Sorting
	   
//	   import java.util.Collections;  // Import the Collections class
//	   Import this class
//	   Collections.sort(cars);  // Sort cars
//	    for (String i : cars) {
//	      System.out.println(i);
//	    }
	   
	}

}
