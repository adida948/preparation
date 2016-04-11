package finishedCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SnapChatQuestionToFrom {
	
	private static Set<Character> set;
	private static Set<String> setWords;
	private static String[] array  = {"dog","jar","dug","bug","bur","bir","bar"};
	
	public static void main(String[] args)
	{		
		
	    		
		set = new TreeSet<Character>();
		setWords = new TreeSet<String>();
		
		for (int i = 0; i < array.length; i++) {
			setWords.add(array[i]);
			char[] myChar = array[i].toCharArray();
			for(int j = 0; j < 3; j++){			
				set.add(myChar[j]);
				
			}		
		}
		
		System.out.println(set);
		System.out.print(isTherePath());

	}
	
	public static boolean pathToFind(String from, String to){
		
		String newWord = "";
		boolean result = false;
		
		//Base Case
		if( from.compareTo(to) == 0)
		{
			return true;
		}
		
		//Logic 
		
			
		
		//Return
		
		return false;
	}
	public static boolean isTherePath(){
		
		for(int i = 0; i < array.length; i++)
		{
			char[] myCharWord = array[i].toCharArray();
			for(char element: set){				
			     myCharWord[0] = element;			     
			     System.out.println(myCharWord);
			     if(setWords.contains(String.valueOf(myCharWord))){
			    	 return true;
			     }
			}		
		}
		
		return false;
	
	}
	
	
}
