package programPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class stringReoccuringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String name = "muthu muthu good knowledge in java java";
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		Integer count =1;
		String[]arr=name.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], count);

			} else {
				map.put(arr[i], map.get(arr[i])+1);
			}
			for (String na : map.keySet()) {
				System.out.println("the count of words is : "+ na +" = "+map.get(na));

			}
		}


	}

}
