package programPractice;

import java.util.HashMap;
import java.util.Map;


import oops.Polymorphism;
public class FindTheRepeatedWord {

	public static void main(String[] args) {

		String GivenString = "iam a a aa iam a good boy boy";
		String[] words = GivenString.split(" ");
		Map<String , Integer> map = new HashMap<>();
		for (String word : words) {
			//  word = words.toLowerCase(); // Convert to lowercase to consider case-insensitive matches
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		System.out.println("Repeated words and their counts:");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " : "  + entry.getValue());
			}
		}
		
	
	}


}