package leetCodeProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
// Find the index of two numbers which sum equals the given target
public class TwoSumArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-10, 5};
		int target = -5;

		System.out.println(Arrays.toString(twoSum(arr,target)));
		System.out.println((isSum(arr,target)));

		


	}

	public static int[] twoSum(int[]numArray, int targetSum){
	
		//O(n)
		int[] solution = new int[2];
		
		if(numArray == null || numArray.length == 0){
			return new int[0];
		}
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < numArray.length;i++){
			
			int temp = targetSum - numArray[i];
			
			if(map.containsKey(temp)){
				solution[0] = map.get(temp);
				solution[1] = i + 1;
				return solution;
			}
			else
				map.put(numArray[i], i+1);
		}
		
		return new int[0];
    
		//n^2 solution
	/*	int[] input = numArray;
		int[] solution = new int[2];

		for(int i = 0; i < input.length;i++){

			for(int j= 1 + i; j < input.length; j++){
              int sum = input[i] + input[j];
				
				if(sum == targetSum)
				{
					solution[0]= i+1;
					solution[1]= j+1;
					return solution;
				}	
			}
			
			
		}
		return solution;*/
		
		// O(n) solution
	/*	
		   int[] result = new int[2];
		    int[] cache = new int[99999];
		    int temp = 0;
		    for (int i = 0;; ++i) {
		       temp = targetSum - numArray[i];
		       if(cache[temp+5000] > 0){
		           result[0] = cache[temp+5000];
		           result[1] = i+1;
		           return result;
		       }else{
		           cache[numArray[i]+5000] = i+1;
		       }
		    }*/
		
		//O(n) solution
		
		
	   
		
	}
	
	public static boolean isSum(int[]numArray, int targetSum){
		
		//O(n)		
		if(numArray == null || numArray.length == 0){
			return false;
		}
		
		Set<Integer> numSet = new HashSet<Integer>();
		
		for(int elem: numArray){
			
			int temp = targetSum - elem;
			
			if(numSet.contains(temp)){
				return true;
			}
			else
				numSet.add(elem);
		}
		return false;
	}
	
	
}
