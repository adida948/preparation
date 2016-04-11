package finishedCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GreatestCommonDenominator {
	
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int[] integers = new int[2];
		for(int i = 0; i < 2; i++)
		{
		    integers[i] = sc.nextInt();
		}
		
		int a = integers[0];
		int b = integers[1];
		
		System.out.println(a + " " + b);
		
		   
        int gcd = find_gcd(a,b);
        System.out.println(gcd);
	}

	 public static  int find_gcd(int a,int b){
         //Write the base condition
         if(b==0) return a;
         return find_gcd(b,a%b);
     }
}
