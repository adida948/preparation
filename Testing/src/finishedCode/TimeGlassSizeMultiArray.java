package finishedCode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
 * Input 
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

Output
Actually there are many hourglasses in the array above. The three leftmost hourglasses are the following:
1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0


The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

In this problem you have to print the largest sum among all the hourglasses in the array.

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0



Sample Output
19

Explanation
The hourglass which has the largest sum is:
2 4 4
  2
1 2 4

*/
public class TimeGlassSizeMultiArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}

    //System.out.println("Maximum Size is: " + findMaxSumHourGlass(arr));
	//System.out.println("Maximum Size is: " + getHourSum(arr));
	System.out.println("Maximum Size is: " + getSumOfData(arr));


}

public static int findMaxSumHourGlass(int[][] input) {
	int maxSum = Integer.MIN_VALUE;
	int tempSum = 0;

	for (int b = 0; b < 4; b++) {

		for (int a = 0; a < 4; a++) {
			tempSum = maxSum;
			maxSum = 0;
			for (int i = b; i < 3 + b; i++) {
				boolean middleNum = false;

				for (int j = a; j < 3 + a; j++) {
					System.out.print(input[i][j]);

					if (i - b == 0) {
						maxSum += input[i][j];
					}

					if ((i - b) == 1 && (j + 1) < 6 && middleNum == false) {
						maxSum += input[i][j + 1];
						middleNum = true;
					}

					if (i - b == 2)
						maxSum += input[i][j];

				}

				System.out.println();

			}

			if (tempSum > maxSum) {
				maxSum = tempSum;
			}

		}

		// break;
		}

		return maxSum;
	}

public static int getHourSum(int[][] arr) {

		int c = 0;
		int maxSum = Integer.MIN_VALUE;
		int e = 1;
		for (e = 1; e < 5; e++) {
			for (int j = 1; j < 5; j++) {
				int line1 = arr[e - 1][j - 1] + arr[e - 1][j] + arr[e - 1][j + 1];
				int line2 = arr[e][j];
				int line3 = arr[e + 1][j - 1] + arr[e + 1][j] + arr[e + 1][j + 1];
				c = line1 + line2 + line3;
				if (maxSum <= c) {
					maxSum = c;
				}
			}
		}
		return maxSum;
	}

//



public static int getSumOfData(int[][] arr){
	

     
      

	int sum = Integer.MIN_VALUE;
	int e= 1; 
	
	for(e =1; e <5; e++ ){
		for(int j = 1; j < 5; j++){
		
			int line1 = arr[e - 1][j - 1] + arr[e - 1][j] + arr[e - 1][j + 1];
			int line2 = arr[e][j];
			int line3 = arr[e + 1][j - 1] + arr[e + 1][j] + arr[e + 1][j + 1];
		    
			int sumNum = line1 + line2 + line3;
			
			if(sum <= sumNum){
				sum = sumNum;
			}
		}
	}
	
	return sum;
}

}






















