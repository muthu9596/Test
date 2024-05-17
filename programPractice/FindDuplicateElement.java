package programPractice;
import java.util.HashMap;
import java.util.Map;
public class FindDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       int array[] = {2, 2,2, 6, 10, 6, 11};

	       System.out.println("the duplicate vales is ");
	       HashMap<Integer, Integer> map=new HashMap<>();
	       for (int i : array) {
			map.put(i, map.getOrDefault(i, 0)+1);
	       }
			for (Map.Entry <Integer,Integer> entry: map.entrySet()) {
				if(entry.getValue()>1) {
					System.out.println( entry.getKey()+"  :" + entry.getValue());
				}
				
			}
			
				
			}
		}
	       
	       
	       
	        
	


