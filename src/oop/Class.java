package oop;

public class Class{
	int a;
	int b;
	
	Class(int x, int y){
		this.a = x;
		this.b = y;
	}
	public void showResults() {
		System.out.println("Value of a is: " + a + "\nValue of b is: "+b);;
	}
	
	
	public static void main(String[] args) {
		Class obj = new Class(12,32);
//		System.out.println(obj.a);
		obj.showResults();
	}
}
