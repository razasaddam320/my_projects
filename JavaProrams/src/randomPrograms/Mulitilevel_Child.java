package randomPrograms;

public class Mulitilevel_Child extends Multilevel_Inheritance_Parent2 {
	
	public void grapes() {
		System.out.println("grapes is green ");
	}

	public static void main(String[] args) {
		
		Mulitilevel_Child a = new Mulitilevel_Child();
		
		a.apple();
		a.banana();
		a.grapes();

	}

}
