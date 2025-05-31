package abstract_topics;

abstract public class Sample_Parent {
	
	public abstract void apple();
	public abstract void banana();
	

}

 class Sample_Child extends Sample_Parent {

	@Override
	public void apple() {
		System.out.println(" apple s red");
	}

	@Override
	public void banana() {
		System.out.println(" banana is yellow");
		
	}
	
	public static void main(String[] args) {
		Sample_Child a= new Sample_Child();
		System.out.println(a.toString());
	}
	
}
