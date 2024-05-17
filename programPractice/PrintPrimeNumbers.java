package programPractice;

public class PrintPrimeNumbers {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
			for(int i=2;i<=50;i++){
			boolean isPrime=true;
			for(int a=2; a<=i/2;a++){
			if(i%a==0){
				isPrime=false;
			break;}}
			if(isPrime){
			System.out.println(i+" " );
		            }
		        }
		    }
		}
	


