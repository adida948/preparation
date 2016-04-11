package leetCodeProblems;

public class ArrayFullOfDoubleExceptOneNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 2, 2, 3, 3, 4, 4, 5 };
		
		System.out.println(singleNumber(num));
	}

	public static int singleNumber(int[] nums) {
		int loneNumber = nums[0];

		for (int i = 1; i < nums.length; i++) {
			loneNumber ^= nums[i];
		}
		return loneNumber;
	}

}
