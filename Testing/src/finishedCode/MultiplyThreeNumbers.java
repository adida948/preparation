package finishedCode;

import java.util.Arrays;

public class MultiplyThreeNumbers {

	public static void main(String[] args) {

		int[] numArray = {1,2,3,-5,-6,-7};
		Arrays.sort(numArray);

		System.out.println(Arrays.toString(numArray));

		//System.out.println(getThreeSumNumber(numArray));
		
		try {
			System.out.println(getThreeSumNumberLessCode(numArray));
		} catch (EmptyException e) {
			// TODO Auto-generated catch block
			System.out.println("Array has to be less than 3 elements. Not valid input");
		}
	}

	// Checking for biggest multiplication of three numbers nlogn
	public static int getThreeSumNumber(int[] numArray) {
		int length = numArray.length;
		int multiplyResult = 0;

		if (length == 3) {
			return numArray[0] * numArray[1] * numArray[2];
		}

		if (numArray[0] < 0 && numArray[length - 1] < 0) {
			System.out.println("All negative ");
			return multiplyResult = numArray[length - 1] * numArray[length - 2]
					* numArray[length - 3];
		} else if (numArray[0] >= 0) {
			System.out.println("All postive");
			return multiplyResult = numArray[length - 1] * numArray[length - 2]
					* numArray[length - 3];
		} else if (numArray[0] < 0 && numArray[length - 1] > 0) {
			System.out.println("postive and Negative ");
			return multiplyResult = numArray[0] * numArray[1]
					* numArray[length - 1];

		}

		return multiplyResult;

	}

	public static int getThreeSumNumberLessCode(int[] numArray)
			throws EmptyException {
		int maxValue1 = Integer.MIN_VALUE;
		int maxValue2 = Integer.MIN_VALUE;
		int length = numArray.length;

		if (numArray.length < 3) {
			throw new EmptyException();
		}

		Arrays.sort(numArray);
		// Get multiplication for the last three numbers
		maxValue1 = numArray[length - 1] * numArray[length - 2]
				* numArray[length - 3];

		// check for the first two elements and the largest at the end.
		maxValue2 = numArray[0] * numArray[1] * numArray[length - 1];

		// Find which one is bigger.
		return Math.max(maxValue1, maxValue2);

	}

}

class EmptyException extends Exception {

}