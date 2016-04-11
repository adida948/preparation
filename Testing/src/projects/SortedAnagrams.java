package projects;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class SortedAnagrams {

	/**
	 * @param args
	 * Write a method to sort arrays of strings so that all anagrams are next to each other
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] anagramsMixed = {"listen","silent","ha","ah","frog","dance","rude","fancy","deru"};
	 	String[] sortedAnagram = getSortedArray(anagramsMixed);
	 for (int i = 0; i < sortedAnagram.length; i++) {
		 System.out.println(sortedAnagram[i]);
		
	}

	}
	
	public static String[] getSortedArray(String[] anagrams){
		
		Map<String, LinkedList<String>> myMap = new HashMap<String, LinkedList<String>>();
		String[] answer = new String[anagrams.length];
		LinkedList<String> myAnagramList;
		int i = 0;
		
		for (String element : anagrams) {
			
			String sort = element;
			char[] sorting = sort.toCharArray();
			Arrays.sort(sorting);
			String sorted = new String(sorting);
			
			if(myMap.containsKey(sorted)){
				myMap.get(sorted).add(element);				
				myMap.put(sorted, myMap.get(sorted));
			}
			else{
				myAnagramList = new LinkedList<String>();
				myAnagramList.add(element);
				myMap.put(sorted, myAnagramList);
			}
		
		}
		
		//Iterating over the Hashmap entries
		for(Map.Entry<String, LinkedList<String>> entry : myMap.entrySet() ){	
			//Iterating over the LinkedList values
			for( String listValue: entry.getValue()){
			answer[i] = listValue;
			i++;
			}
		}
		
		return answer;
	}

}
