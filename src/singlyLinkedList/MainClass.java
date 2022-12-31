package singlyLinkedList;

public class MainClass {

	public static void main(String[] args) {

		SingleLinkedList sLL = new SingleLinkedList();
		
		sLL.createSingleLinkedList(5);
		System.out.println(sLL.head.value);

	} 

}
