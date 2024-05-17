package programPractice;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindTheRepeatedCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "muthhu";

		HashMap<Character, Integer> charFrequency=new HashMap<>();

		for (char c : input.toCharArray()) {
			//if(Character.isLetterOrDigit(c)) {
				charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
			//}
		}

		System.out.println("Repeated characters in the string:");
		for (Entry<Character, Integer> entry : charFrequency.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("'" + entry.getKey() + "': " + entry.getValue() + " times");
			}
		}
	}

}
