package leetCodeProblems;

import java.util.HashMap;
import java.util.Map;

public class ArrayElemnsThreeTimesExceptOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {11,11,11,2,2,2,3,3,3,5};
        
        //System.out.println(singleNumber(nums));
        System.out.println(singleNumber2(nums));

	}

	
//Using Extra Space	O(1) running time and O(n) space 
public static int singleNumber(int[] nums) {
        
        HashMap<Integer,Integer> numMap = new HashMap<Integer,Integer>();
        
        for(int elem: nums){
            if(!numMap.containsKey(elem))
               numMap.put(elem,1);
            else 
               numMap.put(elem,numMap.get(elem) + 1);
        }
        
        for(Map.Entry<Integer,Integer> elem : numMap.entrySet()){
            if( elem.getValue() != 3) return elem.getKey();
        }
        
        return -1;
    }


//Very fast approach using biwise operations

public static int singleNumber2(int[] nums) {
    int len = nums.length, result = 0;
    for (int i = 0; i < 32; i++) {
        int sum = 0;
        for (int j = 0; j < len; j++) {
            sum += (nums[j] >> i) & 1;
        }
        result |= (sum % 3) << i;
    }
    return result;
}
}
