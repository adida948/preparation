package leetCodeProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class IsAnagram {

	/**
	 * @param args
	 * Given two strings s and t, write a function to determine if t is an anagram of s.

	For example,
	s = "anagram", t = "anagaram", return true.
	s = "rat", t = "car", return false.

	Note:
	You may assume the string contains only lowercase alphabets.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String input1 = "aa";//sc.nextLine();
		String input2 = "bb";//sc.nextLine();

		System.out.println(isAnagram(input1, input2));
		System.out.println(isAnagram2(input1.toLowerCase(), input2.toLowerCase()));
		System.out.println(isAnagram3(input1.toLowerCase(), input2.toLowerCase()));


	}
	
	//(nlogn) Running time
	 public static boolean isAnagram(String s, String t) {
	           
		 if( s.length() != t.length())
			 return false;
		 
		 char[] firstInput = s.toLowerCase().toCharArray();
		 char[] secondInput = t.toLowerCase().toCharArray();
		
		 Arrays.sort(firstInput);
		 Arrays.sort(secondInput);
		 
	  return Arrays.equals(firstInput, secondInput);
	 }
	 
	 //O(n) running time
	 public static boolean isAnagram2(String s, String t){
		 boolean anagram = true;
		 
		 //Check Size of both strings, if not equal, it is not an anagaram.
		 if(s.length() != t.length()){
			 return false;
		 }
		 
		 //Declare Map
		 Map<Character, Integer> myMap = new  HashMap<Character,Integer>();


		 //Iterating over character array of firstString 
		 for( Character elem : s.toCharArray()){
			 if(myMap.containsKey(elem))
				 myMap.put(elem,myMap.get(elem) + 1);
			 else
				 myMap.put(elem,1 );
		 }
		 
		 //Iterating over character array of second String 
		 for( Character elem2 : t.toCharArray()){
			 if(myMap.containsKey(elem2))
				 myMap.put(elem2,myMap.get(elem2) -1);
			 else
				 myMap.put(elem2, 1);
		 }
		 
		//Iterating over all the keys in the Map. If one of them has a value that is not 0, it is not an anagram.
		 for(Character key : myMap.keySet()){
			 
			 if(myMap.get(key) != 0){
				 return !anagram;
			 }
			 
		 }
		
	  return anagram;
	 }	
	 
	 public static  boolean isAnagram3(String a, String b){
		 String gluedWords = a + b;
		 char letter =' ';
		 
		 for(Character elem : gluedWords.toCharArray()){
			 
			 letter ^= elem;
		 }
		 return letter == ' ' ? true:false;
		
	 }
	
}
