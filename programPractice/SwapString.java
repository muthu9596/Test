package programPractice;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="hello";
		String s2="world";
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		System.out.println(s2);
		s1=s1.substring(s2.length());
		System.out.println(s1);
		System.out.println(" s1 : " + s1 + " s2 : " + s2);
	}

}
