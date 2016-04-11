package projects;

import java.util.ArrayList;
import java.util.LinkedList;

public class StringToNumber {
	
	
	public static int parseInt(String input){
		char[] numbers = input.toCharArray();
		int makeNumber = 0;
		int currentNumber = 0;
		int answer = 0;
		int arraySize = input.length();
		
		boolean isNegative = false;
		//for (int i = numbers.length-1; i >= 0; i--) {  --> used to read numbers from end of the aarray
		for (int i = 0; i < numbers.length; i++) {
			if( numbers[i] == '-' && isNegative == false)
			{
				isNegative= true;
			}else
			makeNumber = (int)Math.pow(10,arraySize -(i+1));
			
			switch (numbers[i]) {
			case '-':
				break;
			case '+':
				break;
			case '0':
				currentNumber = 0;
				break;
			case '1':
				currentNumber = 1;
				break;
			case '2':
				currentNumber = 2;
				break;
			case '3':
				currentNumber = 3;
				break;
			case '4':
				currentNumber = 4;
				break;
			case '5':
				currentNumber = 5;
				break;
			case '6':
				currentNumber = 6;
				break;
			case '7':
				currentNumber = 7;
				break;
			case '8':
				currentNumber = 8;
				break;
			case '9':
				currentNumber = 9;
				break;			
			default:
				answer = answer/makeNumber/10;
				return isNegative ? -(answer): answer;				
			}
			
			answer += makeNumber*currentNumber;		
		}
		
		return isNegative ? -(answer): answer;
	}
	
	public static int parseInt2(String input){
		boolean isMinus = false;
		int i = 0;
		if(input.toCharArray()[0] == '-') 
			isMinus = true;
		
		char[] inputValues = input.toCharArray();
		int solutionNubmer = 0;
		int isNegative = 0;
		if( isMinus) isNegative++;
		
		for(i =isNegative; i < inputValues.length; i++){
			int asciiCode =    inputValues[i] - '0';
			solutionNubmer += asciiCode*Math.pow(10, (input.length()-1)-i);
		}
		
		return isMinus? (-1)*solutionNubmer: solutionNubmer;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "244";
		
		System.out.println(StringToNumber.parseInt(input));
		
		System.out.println(parseInt2(input));

	}

}
