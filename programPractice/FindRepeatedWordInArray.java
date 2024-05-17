package programPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindRepeatedWordInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Arr[]= {"muthu","muthu","hello","hai","hello"};
		
		HashMap<String, Integer> map=new HashMap<>();
		for (String names : Arr) {
			map.put(names, map.getOrDefault(names, 0)+1);
					}
		System.out.println("The repeated words are");
		
		for(Map.Entry<String,Integer> entry:map.entrySet()) {
			if(entry.getValue()>1) {
			}
			System.out.println("key: " + entry.getKey() + " and the value is " + entry.getValue());
		}
	}}