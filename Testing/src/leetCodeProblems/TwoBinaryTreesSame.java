package leetCodeProblems;

public class TwoBinaryTreesSame {
	
	
	public static boolean isSameTree( TreeNode p, TreeNode q){
		
		//Both empty trees
		if(p == null && q == null){
			return true;
		}
		
		//Both Non-empty Tress
		if( p != null && q != null){
			
			return p.val == q.val &&  isSameTree(p.left, q.left) && isSameTree(p.right,q.right);
		}
		//Either one is empty tress
		return false;
	}
	
	
	public static void main(String[] args)
	 {
	 
	  // Creating a binary tree
	  TreeNode rootNode1=createBinaryTree1();
	  TreeNode rootNode2=createBinaryTree2();
	  System.out.println("Are both Binary Trees equal?");
	  
	  System.out.println(isSameTree(rootNode1, rootNode2));
	 }

	public static TreeNode createBinaryTree1()
	 {
	  
	  TreeNode rootNode =new TreeNode(0);
	  TreeNode node1=new TreeNode(1);
	  TreeNode node2=new TreeNode(10);
	  TreeNode node3=new TreeNode(30);

	  
	  rootNode.left=node1;
	  rootNode.right=node2;
	  
	  node1.left=node3;
	  
	  return rootNode;
	 }

	public static TreeNode createBinaryTree2()
	 {
	  
	  TreeNode rootNode =new TreeNode(0);
	  TreeNode node1=new TreeNode(20);
	  TreeNode node2=new TreeNode(10);
	  TreeNode node3=new TreeNode(30);

	  
	  rootNode.left=node1;
	  rootNode.right=node2;
	  
	  node1.left=node3;
	  
	  return rootNode;
	 }
	
}

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){ val = x;}
	}
    
