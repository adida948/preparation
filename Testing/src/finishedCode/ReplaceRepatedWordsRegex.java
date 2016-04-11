package finishedCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceRepatedWordsRegex {

	public static void main(String[] args) {

		/*
		 * The pattern below basically means to capture any pattern where a word
		 * ((\w+)) is followed by non-word character (e.g., space) then by
		 * itself again (\1 is the backreference to (\w+) earlier).
		 * 
		 * So for the example input"Goodbye bye bye world world world", the
		 * matcher will find 3 patterns:
		 * 
		 * 1) Goodbye
		 * 
		 * 2) bye bye
		 * 
		 * 3) world world world
		 * 
		 * Then for each of them, we can call replaceAll to replace the whole
		 * group with the first group (i.e., the first word - m.group(1)).
		 * 
		 * Hope this helps.
		 */
		String pattern = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";

		Pattern r = Pattern.compile(pattern, Pattern.MULTILINE
				+ Pattern.CASE_INSENSITIVE);

		String input = "Goodbye bye bye bye bye bye bye world world world awesome";

		Matcher m = r.matcher(input);

		boolean findMatch = true;

		while (m.find()) {
			input = input.replaceAll(m.group(), m.group(1));
			findMatch = false;
		}
		System.out.println(input);

	}

}
