package programs;

public class Fibonacci {

	public static void main(String[] args) {
		
		int num1 =0 , num2 = 5;
		int sum = 0;
		
		System.out.println(" the fibonacci series are ");
		
		for(int i=1; i<=10; i++) {
			
			sum = num1+num2;
			num1=num2;
			num2=sum;
			System.out.println(sum);
		}
	}

}
