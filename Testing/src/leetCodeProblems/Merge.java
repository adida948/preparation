package leetCodeProblems;

import java.util.ArrayList;

public class Merge {
	
/*	Sorting two sorted arrays A and B*/
	public static int[] merge(int[]A, int[]B,int endA,int endB){
		
		int[] answer = new int[A.length + B.length];
		
		while(endA > 0 && endB > 0){
			
			if( A[endA -1] > B[endB-1]){
				answer[endA + endB-1] = A[endA -1];
				endA--;
			}
			else{
				answer[endA + endB-1] = B[endB-1];
				endB--;
			}
		}
		
		while(endB > 0){
			answer[endA + endB-1] = B[endB-1];
			endB--;
		}
		
		return answer;
		
	}
	
	
	
	public static void main(String[] args){
		
		int[]sortedA = {2,4,7,8,9};
		int[]sortedB = {1,3,5,10,11};
		
		int[] solution = merge(sortedA,sortedB,sortedA.length,sortedB.length);
		
		for (int i = 0; i < solution.length; i++) {
			
			System.out.print(solution[i] + " ");
			
		}
		
	}

}
