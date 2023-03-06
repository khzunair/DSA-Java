package tree;

public class Main {

	public static void main(String[] args) {
		
//		Drinks System
		TreeNode drinks  = new TreeNode("DRINKS");
		TreeNode cold    = new TreeNode("COLD DRINKS");
		TreeNode hot     = new TreeNode("HOT DRINKS");
		TreeNode tea     = new TreeNode("TEA");
		TreeNode coffee  = new TreeNode("COFFEE");
		TreeNode wine    = new TreeNode("WINE");
		TreeNode beer    = new TreeNode("BEER");
		
//		Drink System Child
		drinks.addChild(cold);
		drinks.addChild(hot);
		hot.addChild(tea);
		hot.addChild(coffee);
		cold.addChild(wine);
		cold.addChild(beer);
		
		System.out.println(drinks.print(0));
	}
	


}
