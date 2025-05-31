package programs;

import java.util.Scanner;

public class Multiple_number_of_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	count;
		
		System.out.println(" enter the numbers ");
		Scanner sc = new Scanner(System.in);
		
		count = sc.nextInt();
		
		int numbers , sum=0;
		
		for(int i=0; i<count; i++) {
			numbers =sc.nextInt();
			
			sum= numbers+sum;
		}
		
		System.out.println(" all sum of numbers is " +sum);

	}

}
