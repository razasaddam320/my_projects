package programs;

import java.util.LinkedHashSet;

public class AAA_BBB_CCC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcadcbacdbca";
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		
		for(int i=0; i<s.length(); i++)
		{
			lhs.add(s.charAt(i));
		}
		
		for(Character c : lhs) {
			
			for(int j=0; j<s.length(); j++)
			{
				if(c.equals(s.charAt(j))) {
					System.out.print(c);
					
				}
					
			}
			
			System.out.println();
		}
			
	}

}
