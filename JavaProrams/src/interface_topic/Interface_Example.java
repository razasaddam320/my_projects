package interface_topic;

public interface Interface_Example {
	
	void red();
	void green();

}

 abstract class Banana implements Interface_Example {

	
	@Override
	public void red() {
		System.out.println("apple is red");
	}

	
	abstract void yellow();
	
}
 
  class Grapes extends Banana {

	@Override
	public void green() {
		System.out.println("apple is green");
		
	}

	@Override
	void yellow() {
		System.out.println("banana is yellow");
	}
	 
	public static void main(String[] args) {
		
		Grapes ge = new Grapes();
		ge.green();
		ge.red();
		ge.yellow();
	}
 }
