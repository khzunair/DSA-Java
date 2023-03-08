package tree.linkedList;

public class Main {

	public static void main(String[] args) {
		BinaryTreeLL bt = new BinaryTreeLL();
		bt.insert("bello");
		bt.insert("jello");
		
		bt.search("dk");

		BinaryNode node = new BinaryNode();
		node.value="hlo";
		bt.insert("widjw");
		bt.insert("dede");
		bt.insert("efde");
//		String root = node.value="heelo";
		bt.inOrder(node);
		
	}

}
