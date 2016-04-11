package projects;

import java.util.Arrays;

public class RepeatedNumber {

	/**
	 */
	public static void main(String[] args) {
		remove("ad");
		remove("acbac");
		remove("aaac");
		remove("react");
		remove("aa");
		remove("ababaac");
		}
	
	public static void remove(String str) {
		int n = str.length();
	  
		int j = 0;
		char[] arr = str.toCharArray();
		for (int i = 0; i < n; ++i) {
			if (arr[i] == 'b') {
				continue;
			} else if (i + 1 < n && arr[i] == 'a' && arr[i + 1] == 'c') {
				++i; // When the loop is over i increases by one again.
			} else {
				arr[j++] = arr[i]; // Copy char to head.
			}
		}
		
		
		arr = Arrays.copyOfRange(arr, 0, j);
		System.out.println(arr);
	}
}