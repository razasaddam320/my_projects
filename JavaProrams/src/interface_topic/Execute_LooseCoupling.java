package interface_topic;

import java.util.Scanner;

public class Execute_LooseCoupling {

	public static void main(String[] args) {
		
	// we have 2 approach for Loose_coupling  scanner class
		
		Scanner sc = new Scanner(System.in);
		System.out.println("choose the vechicle");
		
		int Choice = sc.nextInt();
		
		LooseCoupling lc;
		
		switch(Choice) {
			
		case 1: lc= new Loosecoupling_Bike();
				lc.trip();
				break;
		
		case 2: lc= new LooseCoupling_Car();
				lc.trip();
				break;
		
		default: System.out.println("invalid choice "); 
		
		}	
		
		// without scanner class 
		
//		LooseCoupling lc;
//		lc = new LooseCoupling_Car();
//		lc.trip();
//		lc = new Loosecoupling_Bike();
//		lc.trip();
//		

	}

}
