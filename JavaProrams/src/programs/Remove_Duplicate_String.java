package programs;

import java.util.LinkedHashSet;

public class Remove_Duplicate_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "saddamhussain";
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		
		for(int i=0; i<s.length(); i++)
		{
			lhs.add(s.charAt(i));
		}
		
		System.out.println(lhs);
	}

}
