package startup;

import java.util.HashSet;
import java.util.Set;


//Find how many groups make the difference of k 
public class TwoDifferenceequalK {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArr = {1,3,4,5,7};
		System.out.println((isDifference(inputArr,2)));

	}
	
	
	public static  int isDifference(int[] numArray, int targetDifference){
		int counter = 0;
		if(numArray == null || numArray.length == 0){
			return 0;
		}
		
		Set<Integer> numSet = new HashSet<Integer>();
		
		//Put it in set
		for(int elem: numArray){
						
			if(!numSet.contains(elem)){
				numSet.add(elem);
				}
		}
			
	    //Get numbers
	    for(int elemn: numArray){
	    	
	    	int temp = elemn - targetDifference;
	    	
	    	if(numSet.contains(temp)){
	    		counter++;
	    	}
	    	
	    
				
		}
		return counter;

	}

}
