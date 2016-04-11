package leetCodeProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {

	/**
	 * @param args
	 * Find if an array contains duplicates
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1};
	System.out.println(ContainsDuplicate.hasDuplicate(nums));
		
	}
	
	public static boolean hasDuplicate(int[] nums){
		
		// N Solution
		/* Map<Integer,Boolean> myMap = new HashMap<Integer, Boolean>();
		
		for (int i = 0; i < nums.length; i++) {
			
			if(myMap.containsKey(nums[i])){
				return true;
			}
			else{
		     myMap.put(nums[i], false);
			}
			
		}
		
		return false;*/
		
		//O(N) solution
		Set<Integer> numSet = new HashSet<Integer>();
		
		for (int i : nums) {
			
			if( numSet.contains(i)) return true;			
			numSet.add(i);
			
		}
		System.out.println(numSet);
		return false;
		
		
	
		
	}

}
