package finishedCode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 Given a string S, find number of words in that string. For this problem a word is defined by a string of one or more English letters.

 Note: Space or any of the special characters like ![,?.\\_'@+] will act as a delimiter.

 Input Format
 The string will only contain lower case english alphabets, upper case english alphabets, blank spaces and this special characters: ![,?.\_'@+].



 Output Format
 In the first line, print number of words in the string. The words don't need to be unique. Also print each word in a separate line.

 Sample Input
 He is a very very good boy, isn't he?"


Sample Output
10
He
is
a
very
very
good
boy
isn
t
he*/
public class StringSplit {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		//Scanner sc = new Scanner(System.in);
		String inputString = "He is a very very  good boy,  isn't he?";//sc.nextLine();
		getStringTokens(inputString);
		getStringTokens2(inputString);

        
		

	}

	private static void getStringTokens2(String inputString) {
		// TODO Auto-generated method stub
		String[] output = inputString.trim().split("([^a-zA-Z])+");
		System.out.println(output.length);
		
		for(String word : output){
			System.out.println(word);
		}
	}

	public static String[] getStringTokens(String input) {
		int answerSize = 0;

		String[] output = input.replace("!", " ")
		.replace("[", " ")
		.replace(",", " ")
		.replace("?", " ")
		.replace(".", " ")
		.replace("\\", " ")
		.replace("_", " ")
		.replace("'", " ")
		.replace("@", " ")
		.replace("+", " ")
		.replace("]", " ")
		.trim()
		.split("\\s+");
		
		if (output[0].isEmpty())
			answerSize = output.length - 1;
		else
			answerSize = output.length;

		System.out.println(answerSize);

		for (String elem : output) {
			System.out.println(elem);
		}
		System.out.println("##########################");
		return output;

	}
}