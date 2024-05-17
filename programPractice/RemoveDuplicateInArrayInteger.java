package programPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateInArrayInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Integer []array= {1,5,7,9,1,2,2,4,4,};
		  
		  //System.out.println(array.length);
		  //System.out.println(Arrays.toString(array)); 
		  Set<Integer> set=new HashSet<Integer>(Arrays.asList(array));
		  
		  System.out.println(set);
		  
		 
//-------------------------------------------------------------------------------------------------		
		
		  String[] arr = {"muthu", "muthu", "hello", "hai", "hello"}; 
		  String[] uniqueArr = removeDuplicates(arr);
		  
		  System.out.println("Array without Duplicates: " +Arrays.toString(uniqueArr)); }
		  
		  public static String[] removeDuplicates(String[] arr) { 
			  HashSet<String> uniqueSet = new HashSet<>(); 
			  for (String element : arr) {
		  uniqueSet.add(element); }
			  return uniqueSet.toArray(new String[1]);
		 
	    }
	
	}


