package startup;

import java.util.Arrays;

/*Write a function to print out the first 10 fibonacci numbers

 Fibonacci numbers are: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55*/

public class FirstTenFibonacci {

	public static void main(String[] args) {

		try {
			printFirst10Fib(10);
		} catch (NumberFormatException e) {
			System.out.println("Not a valid number");

		}
	}

	public static void printFirst10Fib(int n) {
		int[] bitArray = new int[n + 1];
		Arrays.fill(bitArray, -1);

		printFibo(bitArray, n);
		bitArray[0] = 0;
		for(int elem: bitArray){
			System.out.println(elem);
		}

	}

	public static int printFibo(int[] compareArray, int n) {
         
		if(n == 0){
			if(compareArray[n] == -1){
				compareArray[n] =0;
				System.out.print(0 + " ");
			}
			return 0;
			
		}
		
		if (n == 1 || n == 2 ) {
			if (compareArray[n] == -1) {
				compareArray[n] = 1;
				System.out.print(1 + " ");
			}
			return 1;
		}

		int temp = 0;

		if (compareArray[n] == -1) {
			temp = printFibo(compareArray, n - 1)+ 
			       printFibo(compareArray, n - 2);
			
			compareArray[n] = temp;
			System.out.print(temp+" ");
		}

		temp = compareArray[n];

		return temp;

	}
}
