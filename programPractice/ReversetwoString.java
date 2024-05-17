package programPractice;

public class ReversetwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "muthu prabhakar hello";


		String[] parts = name.split(" ");

		String reversedFirstName = reverseString(parts[0]);
		String reversedLastName = reverseString(parts[1]);
		String reversedGreeting = reverseString(parts[2]);

		//System.out.println(reversedFirstName + " " + reversedLastName + " " + reversedGreeting);
	}

	public static String reverseString(String str) {
		char[] chars = str.toCharArray();
		System.out.println(chars);
		int left = 0;
		int right = chars.length -1;
	//	System.out.println(right);

		while (left < right)//0->1 -->2->3-->4
		{
			char temp = chars[left];//0
			chars[left] = chars[right];//4
			chars[right] = temp;//0
			left++;
			right--;
		}

		return new String(chars);
	}
}