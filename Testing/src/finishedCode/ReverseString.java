package finishedCode;

import java.util.Iterator;
import java.util.Stack;

public class ReverseString {

	/**
	 * Given a String, reverse it
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String alive = "Alive is Awesome";
		System.out.println(alive);
		
		Stack<Character> myStack = new  Stack<Character>();
		
		for(int i = 0; i < alive.length(); i++){
			char ch = alive.charAt(i);
			myStack.push(ch);
		}
		
		StringBuilder myReverese = new StringBuilder();
		
		while(myStack.size()!= 0){
			myReverese.append(myStack.pop().charValue());
		}
		
		System.out.println(myReverese.toString());
	}

}
