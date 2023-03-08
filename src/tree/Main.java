package tree;

public class Main {

	public static void main(String[] args) {
		
//		Drinks System
		TreeNode greatGrandFather  = new TreeNode("GREAT-GRAND-FATHER");
		TreeNode grandFather    = new TreeNode("GRAND-FATHER");
		TreeNode father     = new TreeNode("FATHER");
		TreeNode Aunt     = new TreeNode("Aunt");
		TreeNode Uncle     = new TreeNode("Uncle");
		TreeNode me     = new TreeNode("ME");
		TreeNode sister  = new TreeNode("SISTER");
		TreeNode brother    = new TreeNode("BROTHER");

		
//		Drink System Child
		greatGrandFather.addChild(grandFather);
		grandFather.addChild(father);
		grandFather.addChild(Aunt);
		grandFather.addChild(Uncle);
		father.addChild(me);
		father.addChild(sister);
		father.addChild(brother);
		
		System.out.println(greatGrandFather.print(0));
	}
	


}
