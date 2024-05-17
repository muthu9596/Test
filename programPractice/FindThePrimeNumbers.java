package programPractice;

import java.util.Scanner;

public class FindThePrimeNumbers {
	public static void main(String[] args) {
		System.out.println("enter the number bro");
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		for(int i=2;i<=num;i++){
		boolean isPrime=true;
		       //  2<=1
		for(int a=2; a<=i/2;a++){
		if(i%a==0){
		isPrime=false;
		break;}}
		if(isPrime){
		System.out.println(i+" " );
	}

}}}
