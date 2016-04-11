package leetCodeProblems;

/*Invert a binary tree.

       4
     /   \
    2     7
   / \   / \
  1   3 6   9
   to
       4
     /   \
    7     2
   / \   / \
  9   6 3   1*/
public class InvertBinaryTree {
	
public static void main(String[] args) {
		
		
		TreeNode rootNode = new TreeNode(4);
		TreeNode node1     = new TreeNode(2);
		TreeNode node2     = new TreeNode(7);
		TreeNode node3     = new TreeNode(1);
		TreeNode node4     = new TreeNode(3);
		TreeNode node5     = new TreeNode(6);
		TreeNode node6	   = new TreeNode(9);
		
		rootNode.left = node1;	
		node1.left    = node3;
		node1.right   = node4;

	
		rootNode.right= node2;
		node2.left    = node5;
		node2.right   = node6;

		
		printBinaryTree(rootNode);
		System.out.println("--------------");
        printBinaryTree(invertTree(rootNode));
	}
	public static TreeNode invertTree(TreeNode root) {		
		//If Node is empty
		if( root == null){
			return root;
		}
		
		//If node has left and right subtrees
		if( root.left != null && root.right != null ){				
			TreeNode tempHolder = root.left;			
			root.left  = root.right;
			root.right = tempHolder; 				
		}
		else if ( root.left == null && root.right!=null){//if the left node is empty
			TreeNode tempHolder = root.right;
			root.right = null;
			root.left = tempHolder;}
		else if ( root.left != null && root.right==null){//if right node is empty
			TreeNode tempHolder = root.left;
			root.left = null;
			root.right = tempHolder;}
			
		invertTree(root.left);  //Keep going deeper into the left tree
		invertTree(root.right);	//Keep going deeper into the left tree
			
		return root;   
	}
	
	public static void printBinaryTree(TreeNode root){
		
		if(root == null)
		{
			return;
		}
		System.out.println(root.val);
		printBinaryTree(root.left);
		printBinaryTree(root.right);
		
	}
	
	public static class TreeNode{
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x){ val = x;}
	}

}


