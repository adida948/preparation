package leetCodeProblems;

import java.util.Stack;

public class ReverseWordsInAString {

	/*
	 * Given an input string, reverse the string word by word.
	 * 
	 * For example, Given s = "the sky is blue", return "blue is sky the".
	 */

	public static void main(String[] args) {

		String input = "the sky is         blue";
		reverseWordsInString(input);
	}

	private static void reverseWordsInString(String input) {
		// TODO Auto-generated method stub
		Stack<String> wordStack = new Stack<String>();
		String[] words = input.trim().split(" ");
		for (String elem : words) {
			if (!elem.equals(""))
				wordStack.add(elem);
		}
		StringBuilder builder = new StringBuilder();
		int spaceCounter =  wordStack.size()-1;
		while (!wordStack.isEmpty()) {
			builder.append(wordStack.pop());
			if(spaceCounter > 0){
			builder.append(" ");
			spaceCounter--;
			}
		}

		String newSentence = builder.toString();

		System.out.println(newSentence);
	}

}
