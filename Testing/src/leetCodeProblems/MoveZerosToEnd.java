package leetCodeProblems;

import java.util.Arrays;

public class MoveZerosToEnd {

	/**
	 * @param args
	 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
	For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {0,1,2,3,0,12,0,0,0,1,2,3,};
		
		moveZeroes(array);
		
			
		System.out.println(Arrays.toString(array));

	}
	// Check each element
	public static void moveZeroes(int[] nums) {
		int j = 1;
		for (int i = 0; i < nums.length; i++) {	
			//if element at index i is 0, 
			if(nums[i] == 0)
			{
				//then compare it to the next possible index.
				while( (i+j) < nums.length)
				{
					//if the next index is not 0, swap it and get out of the while loop 
					if( nums[i+j] != 0){
					    nums[i] = nums[i+j];
					    nums[i+j] = 0;
					    break;
					}
					// If the next value is 0, keep looking until you find a nonzero value or the end of the array. 
					j++;
				}				
			}				
		}        
    }

}
