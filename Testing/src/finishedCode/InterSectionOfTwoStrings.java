package finishedCode;

import java.util.HashSet;
import java.util.Set;

public class InterSectionOfTwoStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "abxx";
		String b = "cbxx";

		System.out.println(getIntersection(a, b));
		System.out.println(getIntersectionNormal(a, b));

	}

	// O(n) not using retainsAll()
	public static String getIntersectionNormal(String a, String b) {

		String answer = "";
		HashSet<Character> firstSet = new HashSet<Character>();
		HashSet<Character> secondSet = new HashSet<Character>();

		for (char elem : b.toCharArray()) {
			secondSet.add(elem);
		}

		for (char elem : a.toCharArray()) {

			if (!firstSet.contains(elem)) {
				firstSet.add(elem);
				if (secondSet.contains(elem)) {
					answer += elem;
				}
			}

		}

		return answer;

	}

	// getIntersection using retainAll method
	public static String getIntersection(String a, String b) {

		HashSet<Character> firstSet = new HashSet<Character>();
		HashSet<Character> secondSet = new HashSet<Character>();

		for (char elem : a.toCharArray()) {

			firstSet.add(elem);
		}

		for (char elem : b.toCharArray()) {

			secondSet.add(elem);
		}

		// Constant operation
		firstSet.retainAll(secondSet);
		System.out.println(firstSet);

		return firstSet.toString();

	}

}
