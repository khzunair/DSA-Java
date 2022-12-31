package array.twoDimensionalArray;

public class TwoDimenstionalMain {

	public static void main(String[] args) {
		TwoDimensionalArray object = new TwoDimensionalArray(3,3);
		object.insertValueInArray(0, 0, 6);
		object.insertValueInArray(2, 2, 78);
		object.insertValueInArray(2, 0, 67);
		object.accessCell(0, 1);
		object.traverse();
		object.searchValue(78);
		object.DeleteValue(0,1);
//		System.out.println(object.twoDArray[0][1]);
		

	}

}
