package programPractice;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String name ="hello";
//		StringBuilder buf=new StringBuilder(name);
//	System.out.println(buf.reverse());
//		
//	
	String rev="";
	char[] ch=name.toCharArray();
	for(int i=ch.length-1;i>=0;i--) {
	rev=rev+ch[i]	;	
	}
	System.out.println(rev);
	
	
	
	}

}
