package tree;

import java.util.ArrayList;

	public class TreeNode {
	  String data;
	  ArrayList<TreeNode> children;
	
	  
//	  Tree Node
	  public TreeNode(String data) {
	    this.data = data;
	    this.children = new ArrayList<TreeNode>();
	  }
	
	  
//	  Adding a Child Node
	  public void addChild(TreeNode node) {
	    this.children.add(node);
	  }
	
	  
//	  print method
	  public String print(int level) {
	    String ret;
	    ret = "  ".repeat(level)+data+"\n";
	    for (TreeNode node : this.children) {
	      ret += node.print(level+1);
	    }
	    return ret;
	  }
	  
	  
	}
