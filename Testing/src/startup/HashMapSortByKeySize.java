package startup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.Map.Entry;

/*
Software Engineer Coding Assignment - 2/4/2016

Pick your programming language of choice, preferably something mainstream:
e.g. Python, Ruby, PHP, etc.

1. Write a function that sorts the keys in a hash/associative array by the length
 of the key as a string. 

For instance, the hash/associative array: 

{ abc: 'hello', 'another_key' => 123, 4567 => 'third' }

Should result in:

["abc", "4567", "another_key"]

*/
public class HashMapSortByKeySize {

	public static void main(String[] args){
		
		HashMap<String, String> inputMap = new HashMap<String, String>();
		inputMap.put("abc", "hello");
		inputMap.put("another_key", "123");
		inputMap.put("4567", "third");
		inputMap.put("4569", "third");
		
		sortKeysinMapBySize(inputMap);

	}
	
	public static void sortKeysinMapBySize(HashMap<String,String> input){
		TreeSet<String>  sortedData = new TreeSet<String>(new KeySizecompare());
		for( Entry<String, String> elem: input.entrySet()){
			sortedData.add(elem.getKey());
	    }
		
		System.out.println(sortedData);
	}
	
}

class KeySizecompare implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length() == o2.length())
			return 0;
		
		return o1.length() > o2.length() ? 1:-1;
	}
	
}
