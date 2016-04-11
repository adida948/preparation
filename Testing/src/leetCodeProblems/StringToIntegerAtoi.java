package leetCodeProblems;

import java.util.Arrays;

public class StringToIntegerAtoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "1110";
		//System.out.println(myAtoi(input.trim()));
		System.out.println(myFastAtoi2(input));
		System.out.println(getBSum("1110","-1"));
	}

	public static int myAtoi(String str) {

		String newStringTrim = str.trim();
		String[] newStrings = newStringTrim.split(" ");
		String newString = newStrings[0];
		// System.out.println(newString);

		if (newString.length() == 0)
			return 0;

		char[] number = newString.toCharArray();
		int answer = 0;
		int size = number.length - 1;
		boolean isNegative = false;
		int index = 0;
		int numsToPrint = 0;
		boolean isPostive = false;
		boolean isFillZero = false;

		// Check if it is negative
		if (number[0] == '-') {
			isNegative = true;
			index++;
			size--;
		}

		// Check if it is negative
		if (number[0] == '+') {
			isPostive = true;
			index++;
			size--;
		}
		// Extract valid Index
		for (int j = index; j < number.length; j++) {
			int num = number[j] - '0';

			if (num == 0 && !isFillZero) {
				index++;
				continue;

			}

			if (num >= 0 && num <= 9) {
				numsToPrint++;
				isFillZero = true;
			} else
				break;

		}

		for (int i = index; i < number.length; i++) {

			int value = number[i] - '0';
			if (value >= 0 && value <= 9) {
				if (isNegative)
					answer += (Math.abs(1) * -1) * value
							* Math.pow(10, --numsToPrint);
				else
					answer += value * Math.pow(10, --numsToPrint);

			} else
				break;
		}
		int negative = (Math.abs(answer) * -1);
		System.out.println(answer);

		// System.out.println(answer);
		return answer;
	}

	public static int myFastAtoi(String str) {

		if (str.isEmpty())
			return 0;
		
		str = str.trim();
		
		int i = 0, ans = 0, sign = 1, len = str.length();
		
		if (str.charAt(i) == '-' || str.charAt(i) == '+')
			sign = str.charAt(i++) == '+' ? 1 : -1;
		
		for (; i < len; ++i) {
			int tmp = str.charAt(i) - '0';
			
			if (tmp < 0 || tmp > 9)
				break;
			int val = Integer.MAX_VALUE / 10;
			if (ans > val || ans == val && Integer.MAX_VALUE % 10 < tmp)
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			else
				ans = ans * 10 + tmp;
		}
		return sign * ans;
	}
	
	public static int myFastAtoi2(String str) {

		if (str.isEmpty())
			return 0;
		
		str = str.trim();
		
		int  len = str.length();
		int  ans =0;
		
		for (int i=0; i < len; i++) {
			int tmp = str.charAt(i) - '0';
			
		     ans = (int) (ans + tmp*Math.pow(2,(len-1)-i));
		}
		return ans;
	}
	

		 public String addBinary(String a, String b) {
		        char[] str1 = a.toCharArray();
		        char[] str2 = b.toCharArray();

		        int carry = 0;
		        int index1,index2;
		        index1=str1.length-1;
		        index2=str2.length-1;
		        String res="";
		        while(index1>=0&&index2>=0){
		            int num1 = str1[index1--]-'0';
		            int num2 = str2[index2--]-'0';
		            int thisNum = num1^num2^carry;
		            if(num1+num2+carry>1)
		                carry=1;
		            else
		                carry=0;

		            res = String.valueOf(thisNum)+res;    

		        }
		        while(index1>=0){
		            int num1 = str1[index1--]-'0';

		            int thisNum = num1+carry>1?0:num1+carry;
		            carry = num1&carry;
		            res = String.valueOf(thisNum)+res;

		        }
		        while(index2>=0){

		            int num2 = str2[index2--]-'0';

		            int thisNum = num2+carry>1?0:num2+carry;
		            carry = num2&carry;
		            res = String.valueOf(thisNum)+res;

		        }
		        if(carry==1)
		        res = "1"+res;

		        return res;
		    }
		 
		 public static void getBinarySum(String a, String b){
		      
		     char[] str1 =  a.toCharArray();
		     char[] str2 =  b.toCharArray();
		     
		     int carry=0;
		     
		     int index1, index2;
		     String res = "";
		     index1 = str1.length -1;
		     index2 = str2.length -1;
		     
		     while( index1 >= 0 && index2>=0 ){
		         int num1 = str1[index1--] - '0';
		         int num2 = str2[index2--]  - '0';
		         
		         int thisNum = num1^num2^carry;
		         if(num1+num2+carry > 1){
		             carry  = 1;
		         }
		         else 
		            carry = 0;
		      
		      res  = String.valueOf(thisNum) + res;
		      
		     }
		     
		     while(index1>= 0){
		          int num1 = str1[index1--] - '0';
		          int thisNum = num1 + carry > 1 ? 0:  num1 + carry; 
		          
		          carry = num1 &carry;
		          
		          res = String.valueOf(thisNum ) + res;
		         
		     }
		     
		     while(index2 >=0){
		         
		         int num2 = str2[index2--] - '0';
		         int thisNum = num2 + carry > 1?0: num2 + carry;
		         carry = num2&carry;
		         res = String.valueOf(thisNum) + res;
		     }
		     
		     if( carry == 1)
		     res = "1" + res;
		     
		     System.out.println(res);

		  }	 
	
   public static String getBSum(String a, String b){
	   
	   System.out.println("First Value" + a) ;
	   
	   int firstNum  = Integer.parseInt(a,2);
	   int secondNum = Integer.parseInt(b,2);
	   
	   int sum = firstNum + secondNum;
	   
	   String result = Integer.toBinaryString(sum);
	   
	   return result;
   }
   
   public static String binaryAddition(String s1, String s2) {
	    if (s1 == null || s2 == null) return "";
	    int first = s1.length() - 1;
	    int second = s2.length() - 1;
	    StringBuilder sb = new StringBuilder();
	    int carry = 0;
	    while (first >= 0 || second >= 0) {
	        int sum = carry;
	        if (first >= 0) {
	            sum += s1.charAt(first) - '0';
	            first--;
	        }
	        if (second >= 0) {
	            sum += s2.charAt(second) - '0';
	            second--;
	        }
	        carry = sum >> 1;
	        sum = sum & 1;
	        sb.append(sum == 0 ? '0' : '1');
	    }
	    if (carry > 0)
	        sb.append('1');

	    sb.reverse();
	    return String.valueOf(sb);
   }
 /* public static boolean isOverllaped(int[] recA, int[]rectB){
	  
    //Getting recA points
	int x = recA[0];
	int y = recA[1];
	int width = recA[2];
	int height = recA[3];
	
	  
    Point bottonLeft  = new Point(x,y);
	Point bottomright =  new Point(x+width,y);
	Point topRight    =  new Point(x + width)
    Point topLeft     =  
      
	  
	  
	  return false;
  }
  
  static class Point{
	  int x;
	  int y;
	  
	  public Point(int x,int y){
		  this.x = x;
		  this.y = y;
	  }
	  
  }*/
	
}
