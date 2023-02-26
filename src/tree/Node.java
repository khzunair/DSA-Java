package tree;

class Node {
    int data;
    Node left, right;
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;
    public BinaryTree() {
        root = null;
    }
    public void insert(int data) {
        root = insertRecursive(root, data);
    }
    private Node insertRecursive(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data)
            root.left = insertRecursive(root.left, data);
        else if (data > root.data)
            root.right = insertRecursive(root.right, data);
        return root;
    }
    
    public class Main {
        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            tree.insert(50);
            tree.insert(30);
            tree.insert(20);
            tree.insert(40);
            tree.insert(70);
            tree.insert(60);
            tree.insert(80);
        }
    }
    
}



