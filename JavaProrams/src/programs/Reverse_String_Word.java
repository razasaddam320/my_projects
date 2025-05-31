package programs;

public class Reverse_String_Word {
 int sum=5 ,  count =5;
	public static void main(String[] args) {
		
		String s = "khatam ta ta bye";
		String []str = s.split(" ");
		
		for(int i=str.length-1; i>=0; i--)
		{
			System.out.print(str[i]+ " ");
		}

	}

}
