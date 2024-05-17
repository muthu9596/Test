package programPractice;

public class PrintVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String name = "ABCDEF";
        printVowels(name);
    }

    public static void printVowels(String str) {
        // Convert the string to uppercase to handle both lowercase and uppercase vowels
        str = str.toUpperCase();

        System.out.print("Vowels in the string: ");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                System.out.print(c + " ");
            }
        }
        System.out.println();
    }

	

}
