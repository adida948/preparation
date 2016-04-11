package googleProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given
public class SerializeDeserialize {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> inputList = new ArrayList<String>();
		inputList.add("Hello");
		inputList.add("good");
		inputList.add("great");

		String enconded = serialize(inputList);
		System.out.println(enconded);

		System.out.println(deserialize(enconded));
	}

	public static String serialize(ArrayList<String> input) {

		StringBuilder builder = new StringBuilder();

		for (String elem : input) {
			int size = elem.length();
			builder.append(size + elem);
		}

		return builder.toString();
	}

	public static ArrayList<String> deserialize(String input) {

		ArrayList<String> myList = new ArrayList<String>();
		
		int beginIndex = 0;
		int endIndex = input.charAt(beginIndex) -'0';
		
		
		while(beginIndex < input.length()){
		String addString = input.substring(beginIndex+1, endIndex+1);
		myList.add(addString);
		
		beginIndex = endIndex + 1;
		if( beginIndex < input.length())
		endIndex = input.charAt(beginIndex) -'0' + beginIndex;
		
		}
		return myList;
	}

	//
	public static String serialize (List<String> words, List<Integer> pos){
        int currPos = 0;
        StringBuilder sb = new StringBuilder();
        for (String s : words){
                pos.add(currPos+s.length());
                currPos += s.length();
                sb.append(s);
        }
        return sb.toString();
    }

    public static List<String> deserialize(String s, List<Integer> pos){
        List<String> list = new ArrayList<String>();
        int start = 0;
        for (Integer end : pos){
            list.add(s.substring(start, end));
            start = end;
        }
        return list;
    }

}
