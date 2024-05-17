package programPractice;

public class FindTheRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Muthhu";
		char[] ch=name.toCharArray();
		int count =0;
		for (int i = 0; i <name.length(); i++) {

			for(int j=i+1; j<name.length();j++) {

				if(ch[i]==ch[j]) {
					System.out.println(ch[i]);
				}

			}


		}




	}

}
