package startup;

public class FindIntergerEqualsIndex {

	/**
	 * Integers in an array are unique and increasingly sorted. Please write a
	 * function/method to find an integer from the array who equals to its
	 * index. For example, in the array {-9, -6, -1, 3, 5}, the number 3 equals
	 * its index 3.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {-9, -6, -1, 0, 1,2,6,8,9,10,15};
		int startIndex = 0;
		int pivotIndex = (array.length-1)/2;
		int endIndex  = array.length-1;

		System.out.println(findNumEqualIndex(array,startIndex,pivotIndex,endIndex));
	}
	//LOG N using binary search!!! LOGN 
	public static int findNumEqualIndex(int[] inputArray,int start, int midIndex, int endI){
		int startIndex = start;
		int pivotIndex = midIndex;
		int endIndex   = endI;
		
		if(startIndex == endIndex) return startIndex;

		int answer = -1;
		if(midIndex == inputArray[midIndex])
			return midIndex;
		
		if(inputArray[midIndex] < midIndex)
			answer = findNumEqualIndex(inputArray, midIndex+1,(pivotIndex+endIndex)/2,endIndex);
		else 
			answer = findNumEqualIndex(inputArray, startIndex, (startIndex+pivotIndex)/2, pivotIndex);

		return answer;
	}
	
	


	
	public static int findNumEqualIndexSlow(int[] inputArray,int start, int midIndex, int endI){
		if(inputArray[0] == 0)
			return 0;
		
		for(int i = midIndex; i < inputArray.length; i++){
			
			if(inputArray[i] == i)
				return inputArray[i];
		}
			
		
		return -1;
	
	}

}
