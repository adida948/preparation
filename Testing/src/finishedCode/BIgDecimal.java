package finishedCode;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Queue;
import java.util.Stack;

public class BIgDecimal {

	/*
	 * Java BigDecimal class can handle arbitrary-precision signed decimal
	 * numbers. Lets test your knowledge on them!
	 * 
	 * 
	 * You are given n real numbers, sort them in descending order! Read data
	 * from System.in.
	 * 
	 * Note: To make the problem easier, we provided you the input/output part
	 * in the editor. Print the numbers as they appeared in the input, don't
	 * change anything. If two numbers represent numerically equivalent values,
	 * the output must list them in original order of the input.
	 * 
	 * 
	 * Input Format
	 * 
	 * 
	 * The first line will consist an integer n , each of the next n lines will
	 * contain a real number. n will be at most 200. The numbers can have at
	 * most 300 digits!
	 * 
	 * 
	 * Output Format
	 * 
	 * 
	 * Print the numbers in descending orders, one number in each line
	 * 
	 * Sample Input
	 * 
	 * 9 
	 * -100
	 * 50 
	 * 0 
	 * 56.6 
	 * 90 
	 * 0.12 
	 * .12 
	 * 02.34 
	 * 000.000
	 * 
	 * 
	 * Sample Output
	 * 
	 * 90 
	 * 56.6 
	 * 50 
	 * 02.34 
	 * 0.12 
	 * .12 
	 * 0 
	 * 000.000 
	 * -100
	 */

	public static void main(String[] args) {

		double a = 2.3;
		double b = 3.4;
		String[] input = { "-100", "50", "0", "56.6", "90", "0.12", ".12",
				"02.34", "000.000" };

		Arrays.sort(input, Collections.reverseOrder(new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				// TODO Auto-generated method stub
				return new BigDecimal(a).compareTo(new BigDecimal(b));
			}
		}));

		for (String elem : input) {
			System.out.println(elem);
		}

     

		 
		System.out.println();
		System.out.println(a + b);
		System.out.println(new BigDecimal(a));
		System.out.println(new BigDecimal(b));
		System.out.println(new BigDecimal(a).add(new BigDecimal(b)));

		BigInteger c = new BigInteger("4232323");
		BigInteger d = new BigInteger("323232323");

		BigInteger sum = c.add(d);
		BigInteger mult = c.multiply(d);
		System.out.println(sum);
		System.out.println(mult);

	}
	
}

/*
 * class DecimalComparator implements Comparator<BigDecimal>{
 * 
 * @Override public int compare(BigDecimal o1, BigDecimal o2) { // TODO
 * Auto-generated method stub
 * 
 * return o1.compareTo(o2); }
 * 
 * }
 */

/*
 * class DecimalComparatorString implements Comparator<String>{
 * 
 * @Override public int compare(String o1, String o2) { BigDecimal a = new
 * BigDecimal(o1); BigDecimal b = new BigDecimal(o2);
 * 
 * // TODO Auto-generated method stub
 * 
 * return o1.compareTo(o2); }
 * 
 * }
 */
