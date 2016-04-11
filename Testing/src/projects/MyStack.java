package projects;

import java.util.Stack;

public class MyStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> unsortedStack = new Stack<Integer>();
		
		unsortedStack.push(3);
		unsortedStack.push(1);
		unsortedStack.push(4);

		
		System.out.println(unsortedStack);

		Stack<Integer> sortedStack = new Stack<Integer>();
		
		while(!unsortedStack.isEmpty()){
			int tmp = unsortedStack.pop();
			while(!sortedStack.isEmpty() && sortedStack.peek() > tmp){
				unsortedStack.push(sortedStack.pop());			
		    }
			sortedStack.push(tmp);
		}

		System.out.println(sortedStack);
		
		int[][] myArray = new int[4][4];
		
		for (int i = 0; i < myArray.length; i++) {
			
			for (int j = 0; j < myArray.length; j++) {
				
				myArray[i][j] = 1;
			}
		}
		
		for (int[] is : myArray) {
			 for(int val: is)
			        System.out.print(val);	 
			        System.out.println(" ");
		}
			
		
		

	}

}
