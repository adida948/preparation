package finishedCode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ZAPPOS {
	/*
	 * Complete the function below.
	 */

	/*
	 * static int maxDifference(int[] a) { HashMap<Integer, Integer> mapValues =
	 * new HashMap<Integer,Integer>(); int i = 0; int maxValue =
	 * Integer.MIN_VALUE; boolean found = false; for(int elem: a){
	 * mapValues.put(elem,i); i++; }
	 * 
	 * Arrays.sort(a); int endValue = 0;
	 * 
	 * for(int j =0; j < a.length;j++){
	 * 
	 * if( mapValues.get((a[(a.length-1) - endValue])) > mapValues.get(a[j]) ){
	 * int temDiff = a[a.length-1 - endValue] - a[j];
	 * 
	 * if(temDiff > maxValue ){ maxValue = temDiff; found = true; break; } }
	 * else{ endValue++; j+=-1; }
	 * 
	 * }
	 * 
	 * return found ? maxValue: -1;
	 * 
	 * }
	 */

/*	public static int maxDifference(int[] a) {

		boolean found = false;
		int maxValue = Integer.MIN_VALUE;

		for (int e = a.length - 1; e > 0; e--) {
			for (int j = 0; j < e; j++) {

				int temDiff = a[e] - a[j];
				if (temDiff > maxValue) {
					maxValue = temDiff;
					found = true;

				}
			}
		}
		return found ? maxValue : -1;
	}
*/
	
	public static int maxDifference(int[] a) {

		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		int[] diffArray = new int[a.length];
		
		//Find min value
		for(int i = 0; i < a.length;i++){
			
			if(a[i] < minValue){
				minValue = a[i];
			}
			diffArray[i]=minValue;
			
		}
		
		//Substract minValue array  from orgintal 
		for(int i = 0; i < a.length; i++){
			a[i]= a[i]- diffArray[i];
		}
		
		//fin maximum Sum
		for(int i = 0; i < a.length; i++){
			if(a[i]> maxValue){
				maxValue = a[i];
			}
		}
		
		return maxValue !=0? maxValue: -1;
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int _a_size = in.nextInt();

		int[] _a = new int[_a_size];
		int _a_item;
		for (int _a_i = 0; _a_i < _a_size; _a_i++) {
			_a_item = in.nextInt();
			_a[_a_i] = _a_item;
		}

		int res = maxDifference(_a);

		System.out.println(res);
	}
}
