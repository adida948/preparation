package startup;

import java.util.ArrayList;
import java.util.List;

public class BinarySum {

	/**
	 * Given 2 Strings in binary, sum both of them and print out the result
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(getBinarySum("1110","0"));
		System.out.println(getBSum("111","10"));

	}
	
	public static String getBinarySum(String firstNum , String secondNum){
		
		int first = Integer.valueOf(firstNum,2);
		int second = Integer.valueOf(secondNum,2);
		
		int sum = first + second;
		String result = Integer.toBinaryString(sum);		
		return result;
	}

	
	public static String getBSum(String firstNum , String secondNum){
		
		if(firstNum == null || secondNum == null){
			return "";
		}
		
		int first = firstNum.length()-1;
		int second = secondNum.length()-1;
		
		StringBuilder sb = new StringBuilder();
		int carry =0;
		
		while(first >= 0 || second >=0 ){
			int sum = carry;
			if(first >= 0){
				sum+= firstNum.charAt(first) - '0';
				first--;				
			}
			
			if(second >=0){
				sum+= secondNum.charAt(second) - '0';
				second--;
			}
			
			carry = sum >> 1;
			sum = sum & 1;
			sb.append(sum == 0 ? '0': '1');
		
		}
		
		if(carry > 0)
			sb.append('1');
		
		sb.reverse();
			
		return String.valueOf(sb);
	}
}
