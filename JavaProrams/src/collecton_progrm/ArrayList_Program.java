package collecton_progrm;

import java.util.ArrayList;

public class ArrayList_Program {
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add(20);
		a.add("Saddam");
		a.add('S');
		a.add(25.5);
		a.add(true);
		
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
			
		}
	}

}
