package randomPrograms;

public class Methods {
	static int a=10;
	int b =12;
	
	public static void m1() {
		System.out.println("this is m1");
	}
	
	public void m2( ) {
		System.out.println("this is non static methods ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1();
		System.out.println(a);
		Methods a = new Methods();
		System.out.println(a.b);
		a.m2();
	}

}
