package interface_topic;

public class Sample2 implements Sample,Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample2 a= new Sample2();
		a.wish();
		a.display();
		a.grapes();
		a.Apple();
		System.out.println(Sample.a);
	}

	@Override
	public void wish() {
		// TODO Auto-generated method stub
		System.out.println("to get a job");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("insha allah it will be soon");
	}

	@Override
	public void Apple() {
		// TODO Auto-generated method stub
		System.out.println("apple is red");
	}

	@Override
	public void grapes() {
		// TODO Auto-generated method stub
		System.out.println("grapes is green");
	}
	
	

}
