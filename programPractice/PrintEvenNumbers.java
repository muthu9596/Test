package programPractice;

import java.util.Scanner;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the number muthu");

		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		
		
		for(int i =2; i<num;i++) {
			if(i%2==0) {
				
				System.out.println(i);
			}
		}
		
		
	}

}
