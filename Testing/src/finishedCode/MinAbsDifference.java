package finishedCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MinAbsDifference {

	public static void main(String[] args) {
	
		 Scanner sc  = new Scanner(System.in);
	        
	        int listSize = sc.nextInt();
	        int[] numArray = new int[listSize];
	        for(int elem =0; elem < numArray.length; elem++){
	            int inputNum = sc.nextInt();
	            numArray[elem] = inputNum; 
	        }
	        
	        Arrays.sort(numArray);
	        
	        getMinAbsDiff(numArray);
		
	}
	
	public static void getMinAbsDiff(int[] input){
		int minDif = Integer.MAX_VALUE;
		Map<Integer,ArrayList<Integer>> sum = new HashMap();
		
		for(int i = 1; i < input.length; i++)
		{
			int currentMinDif = minDif;

				currentMinDif = Math.abs(input[i-1] - input[i]);
				ArrayList<Integer> minAbsDif  = new ArrayList<Integer>();
				minAbsDif.add(input[i-1]);
				minAbsDif.add(input[i]);
				
				if(sum.containsKey(currentMinDif)){
				ArrayList<Integer> newArrayList = sum.get(currentMinDif);
				newArrayList.add(input[i-1]);
				newArrayList.add(input[i]);
				  sum.put(currentMinDif,newArrayList);
				}
				else
				sum.put(currentMinDif, minAbsDif);
				
			if(currentMinDif < minDif){
				minDif = currentMinDif;
			}
			
			
		}
		
		for( int elem : sum.get(minDif))
		    System.out.print(elem + " ");
	}

}
