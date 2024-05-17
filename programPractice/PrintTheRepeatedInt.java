package programPractice;

import java.util.HashMap;
import java.util.Map;

public class PrintTheRepeatedInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,1,5,8,1};
		System.out.println("The duplicate values are");
		HashMap<Integer, Integer>	map=new HashMap<>();
		for (int i : array) {
		map.put(i, map.getOrDefault(i, 0)+1 );
		}
		for(Map.Entry<Integer, Integer> entry :map.entrySet()) {
		if(entry.getValue()>1);
		System.out.println(" key: " + entry.getKey() + " value: " + entry.getValue());
		}
	}
}
