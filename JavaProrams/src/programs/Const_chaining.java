package programs;

public class Const_chaining {

		 Const_chaining() {
			 
			 this(10);
			 System.out.println("const no argument");
			
		}
		 
		 Const_chaining(int a) {
			 
			 System.out.println("const int argument");
			
		} 
		
		 Const_chaining(String a) {
			 
			 this();
			 System.out.println("const String argument");
	
		 }	
		
			public static void main(String[] args) {
				
				Const_chaining c = new Const_chaining("java");
			}
	

}
