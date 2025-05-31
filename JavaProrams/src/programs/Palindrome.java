package programs;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int num =121 , temp=num;
		int rem  , sum=0;
		
		while(num>0) {
			rem = num%10;
			sum = (sum*10)+rem;
			num = num/10;
		}
		if(sum ==temp) {
			System.out.println(" it is palindrome "+sum);
		}
		else 
		{
			System.out.println(" it is not palindrome");
		}
	}
}
