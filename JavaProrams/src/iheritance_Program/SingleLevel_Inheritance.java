package iheritance_Program ;

public class SingleLevel_Inheritance {
	 int a = 10;
	static int b = 20;
	
	
	public static void apple() {
		System.out.println("apple is red");
	} 
	
	public void banana() {
		System.out.println("banana is yellow");
		
		System.out.println(a+b);
	}

}

 class Child_Singlelevel_Inheritance extends SingleLevel_Inheritance {
	 
	 
	 public static void main(String[] args) {
		 
		 apple();
		 System.out.println(b);
		 Child_Singlelevel_Inheritance cs = new Child_Singlelevel_Inheritance();
		 cs.banana();
		 System.out.println(cs.a);
		 
		
	}
	
	
}
