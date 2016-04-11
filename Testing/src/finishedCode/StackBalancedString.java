package finishedCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StackBalancedString {

	// Find out if a string with [].{},() is balanced
	public static void main(String[] args) {

		String testString = "({()})";
		System.out.println(isStringBalanced(testString));
		System.out.println(isExpressionBalanced(testString));

	}

	public static boolean isStringBalanced(String input) {

		Map<Character, Character> charMap = new HashMap<Character, Character>();
		Stack<Character> stack = new Stack<Character>();
		System.out.println(input.length());
		if (input.length() == 0) {
			return false;
		}

		if (input.length() % 2 != 0) {
			return false;
		}

		charMap.put('(', ')');
		charMap.put('{', '}');
		charMap.put('[', ']');

		for (int i = 0; i < input.length(); i++) {

			if (charMap.containsKey(input.charAt(i))) {
				stack.push(input.charAt(i));
			} else if (stack.isEmpty()
					|| (input.charAt(i) != charMap.get(stack.pop()))) {

				return false;
			}
		}

		return true;

	}

	public static boolean isExpressionBalanced(String input) {
		HashMap<Character, Character> symbolMap = new HashMap<Character, Character>();
		Stack<Character> symbolStack = new Stack<Character>();

		if (input.length() == 0)
			return true;
		if (input.length() % 2 != 0 || input == null)
			return false;

		symbolMap.put('(', ')');
		symbolMap.put('[', ']');
		symbolMap.put('{', '}');

		for (char elem : input.toCharArray()) {

			//If it has open symbol, add that symbol to teh stack
			if (symbolMap.containsKey(elem))
				symbolStack.push(elem);
			//if the stack is empty(nothing has been inserted at this point, it means that the string started with ) } ]
			//if the element we pop out of the stack is not equal to the current element i.g elem = ) 
			// comparing wih symbolMap.get(symbolStack.pop) != '('  then it is not balanced
			else if (symbolStack.isEmpty()
					|| elem != symbolMap.get(symbolStack.pop())) {
				return false;
			}
		}

		return true;

	}

}
