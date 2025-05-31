package programs;

import java.util.Scanner;

public class Sum_ByUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 , num2;
		
		System.out.println("enter 1st no. : ");
		Scanner sc = new Scanner(System.in);
		 num1 = sc.nextInt();
		
		System.out.println("enter 2st no. : ");
		 num2 = sc.nextInt();
		 
		 System.out.println(" Sum of no. is :"+ (num1+num2));
		 

	}

}
