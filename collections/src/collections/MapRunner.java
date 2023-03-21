package collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "This is an awesome occasion. This has never happened before";

		// Char occurances
		Map<Character, Integer> occurances = new HashMap<>();

		char[] strChars = str.toCharArray();

		for (char ch : strChars) {
			Integer count = occurances.get(ch);
			if (count == null) {
				occurances.put(ch, 1);
			} else {
				occurances.put(ch, count + 1);
			}

		}

		System.out.println(occurances);

		// Word occurances
		Map<String, Integer> wordOccurances = new HashMap<>();

		String[] words = str.split(" ");

		for (String word : words) {
			Integer count = wordOccurances.get(word);
			if (count == null) {
				wordOccurances.put(word, 1);
			} else {
				wordOccurances.put(word, count + 1);
			}

		}

		System.out.println(wordOccurances);
	}

}
