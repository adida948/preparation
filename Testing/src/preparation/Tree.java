package preparation;

import java.util.LinkedList;

public class Tree {

	static class TreeNode {
		TreeNode left;
		TreeNode right;
		int data;

		TreeNode(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		TreeNode root = createBinaryTree();
		System.out.println("Preorder Traversal");
        preOrderTraversal(root);
		System.out.println();

		System.out.println("\nInorder Traversal");
        inOrderTraversal(root);
		System.out.println();
		
		System.out.println("\nPostorder Traversal");
		postOrderTraversal(root);
		System.out.println();
		
		//BFS target 4
		System.out.println("\nBreath First search");
		System.out.println("\n Is 55 in the tree--->" + bfs(root,55));
		
		//DFS target 5
		System.out.println("\nDepth First search");
		System.out.println("\nIs 55 in the tree--->" + dfs(root,55));
        
	}
	
	//breath First search
	public static boolean bfs(TreeNode root, int target){
		
		if( root == null) return false;
		
		java.util.LinkedList<TreeNode> list = new LinkedList<TreeNode>();
		TreeNode temp;
		list.add(root);
		 System.out.print(root.data);
		while(list.size() > 0){
			temp = list.remove();
			
		  if(temp.data == target){
			  return true;
		  }
		  if(temp.left != null){
			  list.add(temp.left);
			  System.out.print(" " + temp.left.data + " ");
		  }
		  if(temp.right != null){
			  list.add(temp.right);
			  System.out.print(temp.right.data);

		  }}
		return false;
	}
	//Depth first search
	public static boolean dfs(TreeNode root, int target){
		
		if(root == null){
			return false;
		}
		System.out.print(" " + root.data + " ");

		
		if(root.data == target)
			return true;

		return dfs(root.left,target) || dfs(root.right,target);
	}

	public static void preOrderTraversal(TreeNode root) {

		if (root != null) {

			int val = root.data;
			System.out.print(val + " ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	
	public static void inOrderTraversal(TreeNode root) {

		if (root != null) {

			inOrderTraversal(root.left);
			int val = root.data;
			System.out.print(val + " ");
			inOrderTraversal(root.right);
		}
	}
	
	public static void postOrderTraversal(TreeNode root){
		if(root != null){
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			int value = root.data;
			System.out.print(value + " ");
		}
	}

	public static TreeNode createBinaryTree() {

		TreeNode rootNode = new TreeNode(8);
		TreeNode node5 = new TreeNode(5);
		TreeNode node4 = new TreeNode(4);
		
		TreeNode node9 = new TreeNode(9);
		TreeNode node7 = new TreeNode(7);
		TreeNode node11 = new TreeNode(11);
		TreeNode node1 = new TreeNode(1);
		TreeNode node12 = new TreeNode(12);
		TreeNode node3 = new TreeNode(3);
		TreeNode node2 = new TreeNode(2);


		rootNode.left = node5;
		rootNode.right = node4;

		node5.left = node9;
		node5.right = node7;

		node7.left = node1;
		node7.right = node12;
		
		node12.left = node2;
		
		node4.right = node11;
		node11.left = node3;
		return rootNode;

	}
}
